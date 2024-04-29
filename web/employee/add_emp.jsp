<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        Statement st = c.createStatement();
     
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String ph_no = request.getParameter("ph_no");
        String w_type = request.getParameter("work_type");
        String sal = request.getParameter("salary");
 
        Double salary = Double.valueOf(sal);
       
        String query = "Insert into employees(name, email,phone_no,date_of_join,work_type,salary) Values(?,?,?,curDate(),?,?);";
        PreparedStatement ps=c.prepareStatement(query);  
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,ph_no);
        ps.setString(4,w_type);
        ps.setDouble(5,salary);
    
        ps.executeUpdate(); 
      
        response.sendRedirect("employee.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>