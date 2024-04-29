package org.apache.jsp.bill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class billing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Billing Page</title>\n");
      out.write("    <style>\n");
      out.write("        .container {\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            width: 80%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"], input[type=\"number\"] {\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 5px;\n");
      out.write("            width: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: orange;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #productDetails {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #totalCost {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container th {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #successMessage {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: green;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Billing Page</h1>\n");
      out.write("        <div id=\"productSearch\">\n");
      out.write("            <input type=\"text\" id=\"productName\" name = \"productName\" placeholder=\"Search Product by Name\">\n");
      out.write("            <button onclick=\"searchProduct()\">Search</button>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"productDetails\" style=\"visibility:visible\" ><hr>\n");
      out.write("            <p>product details<p>\n");
      out.write("            <p id=\"p_NameDisplay\"></p>\n");
      out.write("            <p id=\"p_PriceDisplay\"></p>\n");
      out.write("            <input type=\"number\" id=\"quantity\" placeholder=\"Quantity\">\n");
      out.write("            <button onclick=\"addProduct()\">Add</button>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <h2>Bill Details</h2>\n");
      out.write("        <table id=\"billTable\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Product ID</th>\n");
      out.write("                    <th>Product Name</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Total</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody></tbody>\n");
      out.write("        </table>\n");
      out.write("        <div id=\"totalCost\">Total Cost: Rs. 0</div>\n");
      out.write("        <button onclick=\"generateBill()\">Generate Bill</button>\n");
      out.write("        <div id=\"successMessage\" style=\"display: none;\">Billed successfully!</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        function searchProduct(){\n");
      out.write("            ");

                String p = request.getParameter("productName");
//                try {
//                    Class.forName("com.mysql.jdbc.Driver");
//                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
//                    Statement st = c.createStatement();
//                    ResultSet rs = st.executeQuery("Select * From products where name like %"+p+"%;");
            
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write(" function addProduct() {\n");
      out.write("            var productName = document.getElementById(\"p_NameDisplay\").innerText;\n");
      out.write("            var price = parseFloat(document.getElementById(\"p_PriceDisplay\").innerText.split('Rs')[1]);\n");
      out.write("            var quantity = parseInt(document.getElementById(\"quantity\").value);\n");
      out.write("\n");
      out.write("            var total = price * quantity;\n");
      out.write("\n");
      out.write("            var newRow = \"<tr><td>Product ID</td><td>\" + productName + \"</td><td>$\" + price.toFixed(2) + \"</td><td>\" + quantity + \"</td><td>$\" + total.toFixed(2) + \"</td></tr>\";\n");
      out.write("\n");
      out.write("            document.querySelector(\"#billTable tbody\").innerHTML += newRow;\n");
      out.write("\n");
      out.write("            updateTotalCost();\n");
      out.write("        }\n");
      out.write(" function updateTotalCost() {\n");
      out.write("            var totalCost = 0;\n");
      out.write("            document.querySelectorAll(\"#billTable tbody tr\").forEach(function(row) {\n");
      out.write("                totalCost += parseFloat(row.cells[4].innerText.split('$')[1]);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            document.getElementById('totalCost').innerText = \"Total Cost: $\" + totalCost.toFixed(2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function generateBill() {\n");
      out.write("            // Assuming you have an AJAX call to update the database with the bill details\n");
      out.write("            // Here, I'm simulating success message\n");
      out.write("            document.getElementById('successMessage').style.display = 'block';\n");
      out.write("        }\n");
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
