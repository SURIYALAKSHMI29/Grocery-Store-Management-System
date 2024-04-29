<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE>

<html>
<head>
   
    <title>Retailer Information</title>
    <style>
        body {
            margin: 0;
            padding: 20px;
            background-color:whitesmoke;
        }
        form {
            max-width: 450px;
            margin: 0 auto;
        }
        label, input {
            margin-left: 20px;
            margin-bottom: 20px;
        }
        label{
            font-weight: bold;
            color: teal;
            font-size: 18px;
        }
        input,select{
            position: relative;
            margin-left: 80px;
        }
        input[type="submit"] {
            background-color:whitesmoke;
            color: black;
            padding: 2px 10px;
            border: 1px solid black;
            margin-top: 20px;
            border-radius: 4px;
            margin-left: 180px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: gray;
        }
        h2{
            background-color:lightgray;
            height: 50px;
            width: cover;
            color: Orange;
            text-align: center;
            padding: 10px;
        }
        
    </style>
</head>
<body>
    <h2>Enter Retailer Information</h2>
    <form action="new_retailer.jsp" method="post">
        <fieldset>
            <legend>Update</legend> <br>
        <label for="name">Retailer Name:</label>
        <input type="text" id="name" name="name" required> <bR>

        <label for="address">Retailer ID :</label>
        <input type="number" name="r_id" required> <bR>
       
        <label for="category">Product Type:</label>
        <select name="c_id" required> 
                        <option selected disabled>Category_name</option>
                <%
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                        Statement st = c.createStatement();
                        ResultSet rs_c = st.executeQuery("SELECT * FROM categories_pro;");
                        while(rs_c.next()){  %>    
                        <option value=<%=rs_c.getString(1)%>><%=rs_c.getString(2)%></option>
                <%    }
                    }
                    catch(Exception e){
                        e.getMessage();
                    }
               %>
        </select> <br>
        <br>        
        <input type="submit" value="Submit">
        </fieldset>
    </form>
    
    <%
        if (request.getMethod().equals("POST")) {
            int r_id =Integer.parseInt(request.getParameter("r_id"));
            int c_id =Integer.parseInt(request.getParameter("c_id"));
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");
                
                String query1 = "Insert into distributor_category_link(Dist_Id, Cate_Id, Recent_Purchase_Date) Values(?,?,curDate())";
                PreparedStatement ps1 = c.prepareStatement(query1);
                ps1.setInt(1,r_id);
                ps1.setInt(2,c_id);
                ps1.executeUpdate();
                
                String query2 = "Update categories_pro SET reinstalled_at = curDate() where cate_id=?;";
                PreparedStatement ps2 = c.prepareStatement(query2);
                ps2.setInt(1, c_id);
                ps2.executeUpdate();
                
            }
            catch(Exception e){
                e.getMessage();
            }
         %>
        <script>
            alert("Updated Successfully!");
            alert("Now, Redirecting to retailers page...");
        </script>
    <%   response.setHeader("Refresh", "1; URL=retailers.jsp");
    }
    %>
</body>
</html>
