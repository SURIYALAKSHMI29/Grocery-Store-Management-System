package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fretailer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   \n");
      out.write("    <title>Retailer Information</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color:whitesmoke;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            background-color:orange;\n");
      out.write("        }\n");
      out.write("        label, input {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color:whitesmoke;\n");
      out.write("            color: black;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            background-color:grey;\n");
      out.write("            height: 40px;\n");
      out.write("            width: cover;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Enter Retailer Information</h2>\n");
      out.write("    <form action=\"#\" method=\"post\">\n");
      out.write("        <label for=\"name\">Retailer Name:</label>\n");
      out.write("        <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("\n");
      out.write("        <label for=\"address\">Address:</label>\n");
      out.write("        <input type=\"text\" id=\"address\" name=\"address\" required>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <label for=\"category\">product category:</label>\n");
      out.write("        <input type=\"text\" id=\"state\" name=\"state\" required>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <label for=\"phone\">Phone Number:</label>\n");
      out.write("        <input type=\"tel\" id=\"phone\" name=\"phone\" pattern=\"[0-9]{3}-[0-9]{3}-[0-9]{4}\" placeholder=\"Format: 123-456-7890\" required>\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
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
