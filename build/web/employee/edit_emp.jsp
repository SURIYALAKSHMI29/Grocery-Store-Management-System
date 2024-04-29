<%@page import="java.sql.*"%>
<%
    String emp_id = request.getParameter("employee_id");
    //out.println(emp_id);
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String ph = request.getParameter("phone");
    String j_Date = request.getParameter("joined_date");
    String w_Type = request.getParameter("work_type");
    Double salary = Double.valueOf(request.getParameter("salary"));

try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");
    PreparedStatement ps = c.prepareStatement("UPDATE employees SET name=?, email=?, phone_no=?, date_of_join=?, work_type=?, salary=? WHERE id=?");
    ps.setString(1, name);
    ps.setString(2, email);
    ps.setString(3, ph);
    ps.setString(4, j_Date);
    ps.setString(5, w_Type);
    ps.setDouble(6, salary);
    ps.setString(7, emp_id);
    ps.executeUpdate();  
    c.close(); 
    response.sendRedirect("employee.jsp");
} catch(Exception e) {
    out.println("Error: " + e.getMessage());
}
%>
