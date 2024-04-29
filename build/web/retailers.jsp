<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Retailers</title>
    <style>
        body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    margin: 0;
    padding: 20px;
}

h1 {
    text-align: center;
    color: orange;
}

#retailersList {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    grid-gap: 20px;
    padding: 20px;
}

.retailer {
    background-color: #fff;
    border: 1px solid #ccc;
    padding: 20px;
    border-radius: 5px;
}

.retailer h2 {
    margin-top: 0;
    color: orange;
}

.retailer p {
    color: darkcyan;
}

.related-content {
    margin-top: 10px;
    font-size: 14px;
    color: #999;
}
.related-content p{
    color: graytext;
}
.dis1, .dis2, .dis3{
    display: flex;
    font-size: 16px;
    font-weight: bold;
    align-content: flex-start;
}
#col12,  #col11, #col13{
    color: darkslategrey;
    margin-right: 10px;
}
.cat{
    color: darkslategrey;
    margin-left: 20px;
}
.topright {
            position: absolute;
            top: 8px;
            right: 16px;
            font-size: 16px;
            text-decoration: none;
            font-weight: bold;
            color: darkcyan;
        }
    </style>
</head>
<body>
    <a href="new_retailer.jsp" class="topright">Update Installment</a>
    <h1>Our Retailers</h1> <br>
    <div id="retailersList">
        <% 
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
                String query = "SELECT * FROM distributor;";
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
        %>
        <div class="retailer">
            <h2><%= rs.getString("Distributor_Id") %></h2>
            <div class="dis1">
                <p id="col11">Name: <p>
                <p class="col2"> <%= rs.getString("Distributor_Name") %></p>
            </div>
           
            <div class="dis2">
                <p id="col12">Contact:</p>
                <p class="col2"> <%= rs.getString("Phone_Number") %></p>
            </div>
            <div class="dis3">
                <p id="col13">Manager: </p>
                <p class="col2"> <%= rs.getString("Distributor_Manager") %></p>
            </div>
            <div class="related-content">
                <h3>Categories distributed</h3>
                <ul>
                    
                    <%
                         try {
                            String query1 = "SELECT d.Distributor_id, dd.cate_id, MIN(c.cate_name) AS cate_name "
                                    + "FROM distributor d INNER JOIN distributor_category_link dd "
                                    + "ON d.Distributor_id = dd.Dist_Id INNER JOIN categories_pro c ON dd.cate_id = c.cate_id "
                                    + "WHERE d.Distributor_id = ? GROUP BY d.Distributor_id, dd.cate_id;" ;
                            PreparedStatement ps = c.prepareStatement(query1);
                            ps.setInt(1, rs.getInt("Distributor_Id"));
                            ResultSet rs1 = ps.executeQuery();
                            while (rs1.next()) { %>
                                <li class="cat"> <%=rs1.getString("cate_name")%></li>
                    <%      }
                            rs1.close(); // Close the inner result set after processing
         
                         }
                         catch(Exception e){
                             e.getMessage();
                         }
                    %>
                </ul>
            </div>
        </div>
        <% 
                }
                rs.close();
                stmt.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </div>
   
</body>
</html>
