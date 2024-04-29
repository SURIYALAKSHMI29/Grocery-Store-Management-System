package org.apache.jsp.bill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class change_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- change_password.jsp -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Change Password</title>\n");
      out.write("    <style>\n");
      out.write(" /* styles.css */\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f5f5f5; /* Light gray background */\n");
      out.write("    color: #333; /* Dark gray text color */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    max-width: 400px;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #ccc; /* Light gray border */\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #fff; /* White background */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("    color: #555; /* Dark gray label color */\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border: 1px solid #ccc; /* Light gray border */\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    background-color: orange; /* Blue button background color */\n");
      out.write("    color: #fff; /* White button text color */\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    background-color: darkorange; /* Darker blue button background color on hover */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".error-message {\n");
      out.write("    color: #dc3545; /* Red error message color */\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Change Password</h2>\n");
      out.write("        <form action=\"update_password.jsp\"  id=\"form\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"userid\">User ID:</label>\n");
      out.write("                <input type=\"text\" id=\"userid\" name=\"userid\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"oldpassword\">Old Password:</label>\n");
      out.write("                <input type=\"password\" id=\"oldpassword\" name=\"oldpassword\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"newpassword\">New Password:</label>\n");
      out.write("                <input type=\"password\" id=\"newpassword\" name=\"newpassword\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"confirmpassword\">Confirm Password:</label>\n");
      out.write("                <input type=\"password\" id=\"confirmpassword\" name=\"confirmpassword\" required>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <button type=\"submit\" onclick=\"check()\">Change Password</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        function check(){\n");
      out.write("            const n_pass = document.getElementById(\"newpassword\").value; // Use value instead of innerText\n");
      out.write("            const c_pass = document.getElementById(\"confirmpassword\").value; \n");
      out.write("            if(n_pass===c_pass){\n");
      out.write("                document.getElementById('form').submit();\n");
      out.write("                alert(\"Changed Successfully!\");\n");
      out.write("            }\n");
      out.write("            else{\n");
      out.write("                alert(\"Passwords Mismatch!\");\n");
      out.write("                window.location.href = \"../login.jsp\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
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
