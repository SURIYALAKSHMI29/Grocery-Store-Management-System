<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<%
    String userid = request.getParameter("userid");
    String oldpassword = request.getParameter("oldpassword");
    String newpassword = request.getParameter("newpassword");
    String confirmpassword = request.getParameter("confirmpassword");

    // Database connection
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");

        // Check if the old password matches the one stored in the database
        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE userID = ? AND password = ?;");
        ps.setString(1, userid);
        ps.setString(2, oldpassword);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Old password matches, proceed with updating the password
                // Update the password in the database
                PreparedStatement updatePs = c.prepareStatement("UPDATE users SET password = ? WHERE userID = ?");
                updatePs.setString(1, newpassword);
                updatePs.setString(2, userid);
                updatePs.executeUpdate();
                out.println("<h3>Password updated successfully!</h3>");
            
        } else {
            // Old password does not match
            out.println("<h3>Incorrect old password!</h3>");
        }
            
        c.close();
        response.sendRedirect("bill_product.jsp");
    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    }
%>
