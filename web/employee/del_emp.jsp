<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        out.println("<h2>bbb redirected</h2>");
        int emp_id = Integer.parseInt(request.getParameter("emp_id"));

        Statement st = c.createStatement();

        st.executeUpdate("DELETE FROM employees WHERE id=" + emp_id+";");

        response.sendRedirect("employee.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>