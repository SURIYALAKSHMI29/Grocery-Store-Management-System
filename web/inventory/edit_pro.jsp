<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        //out.println("<h2>bbb redirected</h2>");
        int pro_id = Integer.parseInt(request.getParameter("pro_id"));
        //out.println("<p>"+pro_id+"</p>");
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("Select * from products where pro_id ="+pro_id+";");
        if(rs.next()){
%>
<html>
    <head>
        <style>
        .container {
            position: relative;
            padding: 20px;
        }

        .img {
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            width: 100%;
            background-image: url('admin.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            filter: blur(15px);
            z-index: -1;
        }

        body {
            color: white;
            font-size: 26px;
            text-align: center;
        }
        
        table {
            margin: 0 auto;
            width: 50%;
            background-color: rgba(0, 0, 0, 0.5);
            border-radius: 10px;
            padding: 20px;
        }

        th, td {
            padding: 10px;
        }

        th {
            text-align: left;
        }

        td {
            text-align: right;
        }
        input[type='text']{
            width: 140px;
        }
        input[type='submit'] {
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 18px;
            background-color: #f27f0c;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        </style>  
    </head>
    <body>
    <div class='container'>
    <div class='img'></div>
    <h2>Edit the product details!</h2>
    <form method="post" action="edit_pro.jsp?pro_id=<%= rs.getInt(1)%>">
    <table>
        <tr>
            <th>Category Id:</th>
            <td> <%= rs.getInt(1)%></td>
        </tr>
        <tr>
            <th>Product Id:</th>
            <td><%= rs.getInt(2)%></td>
        </tr>
        <tr>
            <th>Name:</th>
            <td> <input type="text" name='name' value='<%= rs.getString(3)%>'></td>
        </tr>
        <tr>
            <th>Selling Price:</th>
            <td> <input type="text" name='sp' value='<%= rs.getString(4)%>'></td>
        </tr>
        <tr>
            <th>Purchased price:</th>
            <td> <input type="text" name='cp' value='<%= rs.getDouble(6)%>'></td>
        </tr>
        <tr>
            <th>Available: </th>
            <td> <input type="text" name='avail' value=' <%= rs.getInt(5)%>'></td>
        </tr>
        <input type="hidden" name='p_id' value='<%= rs.getString(2)%>'>
    </table>
    <input type='submit' value="Save Changes">
    </form>
    </div>
    
    <%
        int p_id = Integer.parseInt(request.getParameter("p_id")); 
        String name = request.getParameter("name");
        double sp = Double.parseDouble(request.getParameter("sp")); 
        double cp = Double.parseDouble(request.getParameter("cp")); 
        int avail = Integer.parseInt(request.getParameter("avail").trim()); 
      
        PreparedStatement ps = c.prepareStatement("UPDATE products SET Name=?, Sell_Price=?, Qty_On_Hand=?, Purchase_Price=? WHERE pro_id=?;");
        
        ps.setString(1, name);
        ps.setDouble(2, sp);
        ps.setInt(3, avail);
        ps.setDouble(4, cp);
        ps.setInt(5, p_id);

        int rowsAffected = ps.executeUpdate();
            
            if(rowsAffected > 0) {
                out.println("<script>alert('Changes are Saved successfully for the product " + p_id + "')</script>");
                out.println("<script>window.opener.location.reload();</script>");
                out.println("<script>window.close();</script>");
            } else {
                out.println("<script>alert('Failed to update product')</script>");
            }
        }
    %>
    </body>
</html>
<%      
    }catch(Exception e){
        out.println("Error: " + e.getMessage());
    }
%>