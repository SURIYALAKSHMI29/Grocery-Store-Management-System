package org.apache.jsp.inventory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

    Connection connection = null;
    try {
        // Load the JDBC driver
        Class.forName("your.database.driver");

        // Establish the connection
        connection = DriverManager.getConnection("your.database.url", "username", "password");

        // Set auto-commit to false if needed
        // connection.setAutoCommit(false);

        // You can optionally set attributes in request scope for using in other JSP files
        // request.setAttribute("dbConnection", connection);
    } catch (Exception e) {
        e.printStackTrace();
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Inventory Management</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    color: #d42929;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".scrolling-section {\n");
      out.write("    overflow-x: scroll;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    padding: 10px 0;\n");
      out.write("    margin: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".scrolling-content {\n");
      out.write("    display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#cate{\n");
      out.write("    padding:30px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("/* The side navigation menu */\n");
      out.write(".sidenav {\n");
      out.write("  height: 100%; /* 100% Full-height */\n");
      out.write("  width: 0; /* 0 width - change this with JavaScript */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Stay on top */\n");
      out.write("  top: 0; /* Stay at the top */\n");
      out.write("  left: 0;\n");
      out.write("  background-color: #111; /* Black*/\n");
      out.write("  overflow-x: hidden; /* Disable horizontal scroll */\n");
      out.write("  padding-top: 60px; /* Place content 60px from the top */\n");
      out.write("  transition: 0.5s; /* 0.5 second transition effect to slide in the sidenav */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Position and style the close button (top right corner) */\n");
      out.write(".sidenav .closebtn {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 25px;\n");
      out.write("  font-size: 36px;\n");
      out.write("  margin-left: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style page content - use this if you want to push the page content to the right when you open the side navigation */\n");
      out.write("#main {\n");
      out.write("  transition: margin-left .5s;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidenav {padding-top: 15px;}\n");
      out.write("  .sidenav a {font-size: 18px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".notice-nav {\n");
      out.write("    background-color: whitesmoke;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin-bottom: 50px;    \n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("    margin-top: 0px;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-content {\n");
      out.write("    margin-left: 250px;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".category {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    padding: 10px;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-box {\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-box img {\n");
      out.write("    max-width: 100px;\n");
      out.write("    max-height: 100px;\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".show-more {\n");
      out.write("    display: block;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    color: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("        <h2>Notice</h2>\n");
      out.write("        <div class=\"notice-nav\">\n");
      out.write("                <p>laalaa bkuscgd dshcgkds</p>\n");
      out.write("                <p>laalaa bkdsvds 454 uscgd dshcgkds</p>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Use any element to open the sidenav -->\n");
      out.write("    <span onclick=\"openNav()\" id=\"cate\">Categories</span>\n");
      out.write("\n");
      out.write("    <!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->\n");
      out.write("    <div id=\"main\">\n");
      out.write("        ...\n");
      out.write("   \n");
      out.write("    <h1>Inventory Management System</h1> \n");
      out.write("    <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <div class=\"scrolling-section\">\n");
      out.write("            <div class=\"scrolling-content\">\n");
      out.write("                <marquee width=\"60%\" direction=\"left\" height=\"100px\">\n");
      out.write("                This is a sample scrolling text that has scrolls texts to the left.\n");
      out.write("                </marquee>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div id=\"category1\" class=\"category\">\n");
      out.write("                <h2>Category 1</h2>\n");
      out.write("                <div class=\"product-box\">\n");
      out.write("                    <!-- Product Details Here -->\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\" class=\"show-more\">Show More</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Other Categories -->\n");
      out.write("            <div id=\"category2\" class=\"category\">\n");
      out.write("                <h2>Category 2</h2>\n");
      out.write("                <div class=\"product-box\">\n");
      out.write("                    <!-- Product Details Here -->\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\" class=\"show-more\">Show More</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function openNav() {\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("  document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */\n");
      out.write("function closeNav() {\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft = \"0\";\n");
      out.write("  document.body.style.backgroundColor = \"white\";\n");
      out.write("}\n");
      out.write(" var message = '");
      out.print( request.getAttribute("message") );
      out.write("';\n");
      out.write("    if (message && message.trim() !== '') {\n");
      out.write("        // Create a new div element for displaying the message\n");
      out.write("        var messageDiv = document.createElement('div');\n");
      out.write("        messageDiv.innerHTML = '<p>' + message + '</p>';\n");
      out.write("        \n");
      out.write("        // Append the message div to the body of the page\n");
      out.write("        document.body.appendChild(messageDiv);\n");
      out.write("        \n");
      out.write("        // Clear the message after a certain time (e.g., 5 seconds)\n");
      out.write("        setTimeout(function() {\n");
      out.write("            messageDiv.remove();\n");
      out.write("        }, 5000); // 5000 milliseconds = 5 seconds\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
