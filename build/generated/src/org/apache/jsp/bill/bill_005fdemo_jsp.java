package org.apache.jsp.bill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bill_005fdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Grocery Store Billing</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    max-width: 600px;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item span {\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input.quantity {\n");
      out.write("    width: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#total {\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#totalAmount {\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Grocery Store Billing</h1>\n");
      out.write("        <div id=\"items\">\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <span>Item 1:</span>\n");
      out.write("                <input type=\"number\" class=\"quantity\" value=\"0\" min=\"0\">\n");
      out.write("                <span class=\"price\">$10.00</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <span>Item 2:</span>\n");
      out.write("                <input type=\"number\" class=\"quantity\" value=\"0\" min=\"0\">\n");
      out.write("                <span class=\"price\">$15.00</span>\n");
      out.write("            </div>\n");
      out.write("            <!-- Add more items as needed -->\n");
      out.write("        </div>\n");
      out.write("        <div id=\"total\">\n");
      out.write("            <h3>Total: <span id=\"totalAmount\">$0.00</span></h3>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        document.addEventListener(\"DOMContentLoaded\", function() {\n");
      out.write("    const quantityInputs = document.querySelectorAll(\".quantity\");\n");
      out.write("    const totalAmount = document.getElementById(\"totalAmount\");\n");
      out.write("\n");
      out.write("    // Function to calculate total amount\n");
      out.write("    function calculateTotal() {\n");
      out.write("        let total = 0;\n");
      out.write("        quantityInputs.forEach(input => {\n");
      out.write("            const price = parseFloat(input.nextElementSibling.textContent.slice(1));\n");
      out.write("            const quantity = parseInt(input.value);\n");
      out.write("            total += price * quantity;\n");
      out.write("        });\n");
      out.write("        totalAmount.textContent = \"$\" + total.toFixed(2);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Calculate total on page load\n");
      out.write("    calculateTotal();\n");
      out.write("\n");
      out.write("    // Event listener for quantity input change\n");
      out.write("    quantityInputs.forEach(input => {\n");
      out.write("        input.addEventListener(\"change\", calculateTotal);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
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
