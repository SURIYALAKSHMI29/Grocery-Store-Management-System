<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
  
        int pro_id = Integer.parseInt(request.getParameter("pro_id"));
        Statement st = c.createStatement();
        st.executeUpdate("DELETE FROM products WHERE pro_id=" + pro_id+";");
        response.sendRedirect("products.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>