package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("     body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-image: url('images/grocery_bg1.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("    width: 360px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    margin-top: 100px;\n");
      out.write("    padding: 40px 0;\n");
      out.write("    background: #ffffff;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#abc{\n");
      out.write("    font-family: TimesNewRoman;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 34px;\n");
      out.write("    padding-bottom: 30px;\n");
      out.write("    color:#29231D;\n");
      out.write("    text-shadow: 3px 3px 3px gray;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("    padding: 0 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("    color: #20211A;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group input {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: orange;\n");
      out.write("    color: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("button:hover {\n");
      out.write("    background-color: darkorange;\n");
      out.write("}\n");
      out.write(".copyright {\n");
      out.write("    position: absolute;\n");
      out.write("    color: white;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: black;\n");
      out.write("    padding: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("#id{  color: maroon;}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <div id=\"abc\"><strong>Welcome to ABC Grocery Store</strong></div>\n");
      out.write("        <form action=\"login.jsp\" method=\"post\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label for=\"username\">User ID:</label>\n");
      out.write("                <input type=\"number\" id=\"username\" name=\"username\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\">Login</button>\n");
      out.write("        </form>\n");
      out.write("      ");
    
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      if(username!=null && password!=null){
      int us=0,n=1;
      try{
          if(username!=null)
              us=Integer.parseInt(username);
      }
      catch (NumberFormatException e) {
        // Handle the case when the username cannot be parsed into an integer
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
    
      out.write("\n");
      out.write("\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"copyright\">\n");
      out.write("            <p>&copy; 2024 Grocery Store. All rights reserved.</p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
