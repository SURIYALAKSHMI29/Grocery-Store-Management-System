package org.apache.jsp.bill;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bill_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Grocery Billing</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            border: 2px solid lightcyan;\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #333;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        select,\n");
      out.write("        input,\n");
      out.write("        button {\n");
      out.write("            margin: 5px;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown {\n");
      out.write("            position: relative;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #item-dropdown {\n");
      out.write("            position: absolute;\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("            min-width: 200px;\n");
      out.write("            box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("            z-index: 1;\n");
      out.write("            display: none; /* Initially hide the dropdown */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .item-option {\n");
      out.write("            padding: 12px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: block;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .item-option:hover {\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: orange;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background-color: darkorange;\n");
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
      out.write("        #billTable {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #billTable th,\n");
      out.write("        #billTable td {\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #billTable th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .flex-container {\n");
      out.write("            display: flex; /* Display the child elements in a row */\n");
      out.write("            justify-content: space-between; /* Distribute space between the child elements */\n");
      out.write("            align-items: center; /* Align the child elements vertically */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #u {\n");
      out.write("            font-style: italic;\n");
      out.write("            display: flex;\n");
      out.write("            font-size: 16px;\n");
      out.write("            padding: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .topright {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 8px;\n");
      out.write("            right: 16px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: darkcyan;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <a href=\"change.jsp\" class=\"topright\">Change Password</a>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Grocery Billing</h1>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <input type=\"text\" id=\"item-input\" name=\"item\" oninput=\"filterItems()\" placeholder=\"Type to search\">\n");
      out.write("                <div id=\"item-dropdown\" class=\"dropdown-content\">\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                            Statement st = c.createStatement();
                            ResultSet rs_c = st.executeQuery("SELECT * FROM products where Qty_On_Hand>0;");
                            while(rs_c.next()){  
                    
      out.write("    \n");
      out.write("                    <div class=\"item-option\" onclick=\"selectItem('");
      out.print(rs_c.getInt(2));
      out.write('.');
      out.print(rs_c.getString(3));
      out.write(" - ");
      out.print(rs_c.getDouble(4));
      out.write("', ");
      out.print(rs_c.getInt(5));
      out.write(")\">");
      out.print(rs_c.getInt(2));
      out.write('.');
      out.write(' ');
      out.print(rs_c.getString(3));
      out.write(" - ");
      out.print(rs_c.getDouble(4));
      out.write("</div>\n");
      out.write("                    ");
  
                            }
                        } catch(Exception e){
                            e.getMessage();
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"number\" id=\"qty\" placeholder=\"Qty\" min=\"1\">\n");
      out.write("            <button onclick=\"addItem()\">Add</button>\n");
      out.write("        </div>\n");
      out.write("        <br><hr><br>\n");
      out.write("        <form id=\"billForm\" action=\"bill_final.jsp\" method=\"post\">\n");
      out.write("            <h2>Bill Details</h2>\n");
      out.write("            <table id=\"billTable\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Product ID</th>\n");
      out.write("                        <th>Product Name</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Total</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody></tbody>\n");
      out.write("            </table> <br>\n");
      out.write("            <input type=\"hidden\" name=\"user\" value= \"");
      out.print(session.getAttribute("user"));
      out.write("\" >\n");
      out.write("            <input type=\"hidden\" name=\"total\" value=\"\">\n");
      out.write("            <div class=\"flex-container\">\n");
      out.write("                <div id=\"totalCost\">Total Cost: Rs. 0 </div> \n");
      out.write("                <div id=\"u\">Billed By:");
      out.print(session.getAttribute("user"));
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <button onclick=\"generateBill()\">Generate Bill</button>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function filterItems() {\n");
      out.write("            var input, filter, dropdown, options, i, option;\n");
      out.write("            input = document.getElementById('item-input');\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            dropdown = document.getElementById('item-dropdown');\n");
      out.write("            options = dropdown.getElementsByClassName('item-option');\n");
      out.write("            if (filter.trim() === \"\") {\n");
      out.write("                dropdown.style.display = 'none'; // Hide dropdown if input is empty\n");
      out.write("            } else {\n");
      out.write("                dropdown.style.display = 'block'; // Show dropdown if input is not empty\n");
      out.write("                for (i = 0; i < options.length; i++) {\n");
      out.write("                    option = options[i];\n");
      out.write("                    if (option.innerText.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                        option.style.display = '';\n");
      out.write("                    } else {\n");
      out.write("                        option.style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function selectItem(item, availableQty) {\n");
      out.write("            document.getElementById('item-input').value = item;\n");
      out.write("            document.getElementById('item-dropdown').style.display = 'none'; // Hide dropdown after selecting item\n");
      out.write("            document.getElementById('qty').setAttribute('max', availableQty); // Set maximum quantity based on available quantity\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        // Function to add item to the bill\n");
      out.write("        function addItem() {\n");
      out.write("            const selectedItem = document.getElementById('item-input').value;\n");
      out.write("            const pro_id = selectedItem.split('.')[0];\n");
      out.write("            const Item = selectedItem.split('.')[1];\n");
      out.write("            const qty = document.getElementById('qty').value;\n");
      out.write("            const subtotal = (parseFloat(selectedItem.split(' - ')[1]) * qty).toFixed(2);\n");
      out.write("\n");
      out.write("            const newRow = \"<tr>\" +\n");
      out.write("                \"<td><input type='hidden' name='pro_id' value='\" + pro_id + \"'>\" + pro_id + \"</td>\" +\n");
      out.write("                \"<td><input type='hidden' name='item' value='\" + Item + \"'>\" + Item + \"</td>\" +\n");
      out.write("                \"<td><input type='hidden' name='qty' value='\" + qty + \"'>\" + qty + \"</td>\" +\n");
      out.write("                \"<td>Rs\" + subtotal + \"</td>\" +\n");
      out.write("                \"</tr>\";\n");
      out.write("\n");
      out.write("            document.querySelector(\"#billTable tbody\").innerHTML += newRow;\n");
      out.write("            updateTotalCost();\n");
      out.write("\n");
      out.write("            document.getElementById('item-input').value = '';\n");
      out.write("            document.getElementById('qty').value = '';\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function updateTotalCost() {\n");
      out.write("            var totalCost = 0;\n");
      out.write("            var rows = document.querySelectorAll(\"#billTable tbody tr\");\n");
      out.write("\n");
      out.write("            // Iterate over the rows and calculate total cost\n");
      out.write("            for (var i = 0; i < rows.length; i++) {\n");
      out.write("                totalCost += parseFloat(rows[i].cells[3].innerText.split('Rs')[1]); // Update index to 3 for subtotal\n");
      out.write("            }\n");
      out.write("            // Update the total cost display\n");
      out.write("            document.getElementById('totalCost').innerText = \"Total Cost: Rs\" + totalCost.toFixed(2);\n");
      out.write("            document.getElementsByName('total')[0].value = totalCost.toFixed(2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Function to generate the bill\n");
      out.write("        function generateBill() {\n");
      out.write("            var total = document.getElementById('totalCost').innerText;\n");
      out.write("            if (total === \"Total Cost: Rs. 0\")\n");
      out.write("                alert(\" Add atleast 1 Item!\");\n");
      out.write("            else {\n");
      out.write("                if (confirm(\"Are you sure you want to bill?\")) {\n");
      out.write("                    // Assuming your table is wrapped within a <form> element with id=\"billForm\"\n");
      out.write("\n");
      out.write("\n");
      out.write("                    document.getElementById('billForm').submit();\n");
      out.write("                    alert(\"Billed Successfully!\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
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
