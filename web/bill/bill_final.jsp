
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill Final</title>
</head>
<body>
    <%
        int user = Integer.parseInt(request.getParameter("user").trim());
        String[] productIDs = request.getParameterValues("pro_id");
        String[] productNames = request.getParameterValues("item");
        String[] quantities = request.getParameterValues("qty");
        Double total = Double.valueOf(request.getParameter("total"));
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        Statement st = c.createStatement();
        
        String query = "Insert into bill(date, Total_Amount,Billed_By) Values(curDate(),?,?);";
        PreparedStatement ps=c.prepareStatement(query);  
 
        ps.setDouble(1,total);
        ps.setInt(2,user);
        
       ps.executeUpdate();
        
        ResultSet rs = st.executeQuery("SELECT max(bill_id) FROM bill;");
        rs.next();
        int bill_Id = rs.getInt(1); 
        
        String query1 = "Insert into bill_desc(bill_id, p_id, Qty) Values (?,?,?);";
        String updateQuery = "UPDATE products SET Qty_On_Hand= Qty_On_Hand - ? WHERE pro_id = ?;";
        
        PreparedStatement ps1 = c.prepareStatement(query1);  
        PreparedStatement ps2 = c.prepareStatement(updateQuery);

        if (productIDs != null && productNames != null && quantities != null) {
            for (int i = 0; i < productIDs.length; i++) {
                int p_id = Integer.parseInt(productIDs[i]);
                int qty= Integer.parseInt(quantities[i]);
                
                ps1.setInt(1,bill_Id);                
                ps1.setInt(2,p_id);
                ps1.setInt(3,qty);
                
                ps1.executeUpdate();
                               
                ps2.setInt(1, qty);
                ps2.setInt(2, p_id);
                
                ps2.executeUpdate();
            }
        }
        else{
            out.println("error0");
        }
        response.sendRedirect("bill_product.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>
