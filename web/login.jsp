<%-- 
    Document   : login.jsp
    Created on : 10 Apr, 2024, 11:57:30 PM
    Author     : suriya
--%>

<%@page import="java.sql.*, java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
     body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-image: url('images/grocery_bg1.jpg');
    background-repeat: no-repeat;
    background-size: cover;
}

.login-container {
    width: 360px;
    margin: 0 auto;
    margin-top: 100px;
    padding: 40px 0;
    background: #ffffff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

#abc{
    font-family: TimesNewRoman;
    text-align: center;
    font-size: 34px;
    padding-bottom: 30px;
    color:#29231D;
    text-shadow: 3px 3px 3px gray;
}

form {
    padding: 0 40px;
}

.input-group {
    margin-bottom: 20px;
}

.input-group label {
    display: block;
    margin-bottom: 5px;
    color: #20211A;
}

.input-group input {
    width: 100%;
    padding: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

button {
    width: 100%;
    padding: 10px;
    border: none;
    border-radius: 5px;
    background-color: orange;
    color: #fff;
    cursor: pointer;
}
button:hover {
    background-color: darkorange;
}
.copyright {
    position: absolute;
    color: white;
    bottom: 0;
    left: 0;
    width: 100%;
    background-color: black;
    padding: 10px;
    text-align: center;
}
#id{  color: maroon;}
    </style>
</head>
<body>
    
    <div class="login-container">
        <div id="abc"><strong>Welcome to ABC Grocery Store</strong></div>
        <form action="login.jsp" method="post">
            <div class="input-group">
                <label for="username">User ID:</label>
                <input type="number" id="username" name="username" required>
            </div>
            <div class="input-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Login</button>
        </form>
      <%    
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      if(username!=null && password!=null){
      int us=0,n=1;
      try{
          if(username!=null)
              us=Integer.parseInt(username);
      }
      catch (NumberFormatException e) {
      
        e.printStackTrace(); 
    }
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");
          Statement st= c.createStatement();
          ResultSet rs= st.executeQuery("Select * from users;");
          while(rs.next())
          {
             if(rs.getInt(1)==us && rs.getString(3).equals(password)){
                 if(us==1)
                     response.sendRedirect("admin.jsp");
                 else{
                    session.setAttribute("user", us);
                    response.sendRedirect("bill/bill_product.jsp");
                 }
                 n=0;
             }
          }
          if(n==1){
               out.println("<br><div style='color:red; text-align:center'>Wrong Credentials!</div>");
          }
     }
      catch(Exception e){
          out.println("<div>Sorry, Unexcpected error occured.</div>");
          out.println("<div>Try again later!</div>");
      }
    }
    %>

    </div>  
    <div class="copyright">
            <p>&copy; 2024 Grocery Store. All rights reserved.</p>
    </div>
</body>
</html>