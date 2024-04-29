package org.apache.jsp.inventory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- \n");
      out.write("Inventory Management page\n");
      out.write("-->\n");
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
      out.write("    <title>Inventory Management</title>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write(" body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("html {\n");
      out.write("  scroll-behavior: smooth;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("    text-align: center;\n");
      out.write("    color: #d42929;\n");
      out.write("}\n");
      out.write("#container {\n");
      out.write("    display: flex;\n");
      out.write("    position: relative;\n");
      out.write("    transition: margin-left .5s;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("  height: 100%; \n");
      out.write("  width: 0; \n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 1; \n");
      out.write("  top: 0; \n");
      out.write("  left: 0;\n");
      out.write("  background-color:  black; \n");
      out.write("  overflow-x: hidden; \n");
      out.write("  padding-top: 60px; \n");
      out.write("  transition: 0.5s; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a,h2 {\n");
      out.write("  padding: 8px 8px 8px 32px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 25px;\n");
      out.write("  color: #fff;\n");
      out.write("  display: block;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav h1,p{\n");
      out.write("    color:  #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav h4{\n");
      out.write("    color:red;\n");
      out.write("    font-style: italic;\n");
      out.write("}\n");
      out.write("/* When you mouse over the navigation links, change their color */\n");
      out.write(".sidenav a:hover {\n");
      out.write("  color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Position and style the close button (top right corner) */\n");
      out.write(".sidenav .closebtn {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 25px;\n");
      out.write("  font-size: 36px;\n");
      out.write("  margin-left: 50px;\n");
      out.write("  color: #fff; /* White text color */\n");
      out.write("}\n");
      out.write("/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidenav {padding-top: 15px;}\n");
      out.write("  .sidenav a {font-size: 18px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("#open {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 30px; \n");
      out.write("    left: 20px; \n");
      out.write("    cursor: pointer;\n");
      out.write("    z-index: 999; \n");
      out.write("    color: navy;\n");
      out.write("    font-family: TimesNewRoman;\n");
      out.write("    font-size: 1.2em;\n");
      out.write("    font-style: oblique;\n");
      out.write("}\n");
      out.write("        \n");
      out.write(".main-content {\n");
      out.write("    margin-left: 50px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write(".head {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        align-items: center;\n");
      out.write("}\n");
      out.write(".head h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    flex-grow: 1;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write(".head a{\n");
      out.write("    color:purple;\n");
      out.write("    font-size: larger;\n");
      out.write("    font-style: italic;\n");
      out.write("}\n");
      out.write(".horizontal-bar {\n");
      out.write("    float: left;\n");
      out.write("    margin-right: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".horizontal-bar ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    height: 42px;\n");
      out.write("    width: 1300px;\n");
      out.write("    background-color: #f27f0c;\n");
      out.write("    font-size: 22px;\n");
      out.write("    padding: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".horizontal-bar ul li a {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(".horizontal-bar ul li a:hover{\n");
      out.write("    color:darkslategray;\n");
      out.write("}\n");
      out.write(".category {\n");
      out.write("    margin-top: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".category h2{\n");
      out.write("    border: 2px solid #CCCCC6;\n");
      out.write("    padding: 30px;\n");
      out.write("    background-color: darkcyan;\n");
      out.write("    text-align: left;\n");
      out.write("    color:  #fff;\n");
      out.write("    z-index: 99;\n");
      out.write("}\n");
      out.write(".product-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap; \n");
      out.write("    justify-content: center; \n");
      out.write("    align-items: flex-start; \n");
      out.write("    gap: 20px; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    padding: 10px;\n");
      out.write("    background-color: lightgray;\n");
      out.write("    width: 250px; \n");
      out.write("    border-radius: 5px;\n");
      out.write("    margin: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    transition: transform 0.2s;\n");
      out.write("}\n");
      out.write(".product-card:hover {\n");
      out.write("    transform: scale(1.1); \n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-options {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 105px;\n");
      out.write("    right: 10px;\n");
      out.write("    display: none; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-card:hover .product-options {\n");
      out.write("    display: block; \n");
      out.write("}\n");
      out.write("        \n");
      out.write("/* Product name */\n");
      out.write(".product-card h3 {\n");
      out.write("    margin-top: 0;\n");
      out.write("    font-size: 1.2em;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("/* Product description */\n");
      out.write(".product-card p {\n");
      out.write("    color: #666;\n");
      out.write("    font-size:16px;\n");
      out.write("    font-weight: bold; \n");
      out.write("}\n");
      out.write("/* Product price */\n");
      out.write(".product-card p.price {\n");
      out.write("    color: #333;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("@keyframes slideIn {\n");
      out.write("    from { width: 0; }\n");
      out.write("    to { width: 250px; }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes slideOut {\n");
      out.write("    from { width: 250px; }\n");
      out.write("    to { width: 0; }\n");
      out.write("}\n");
      out.write(".add-container{\n");
      out.write("    margin-top: 100px;\n");
      out.write("    height: auto;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #ffffff; /* Set your desired background color */\n");
      out.write("    box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.5);\n");
      out.write("    padding-bottom: 30px;\n");
      out.write("}\n");
      out.write(".add h2{\n");
      out.write("    border: 2px solid #CCCCC6;\n");
      out.write("    padding: 30px;\n");
      out.write("    text-align: center;\n");
      out.write("    background-color:black;\n");
      out.write("    text-align: left;\n");
      out.write("    color:white;\n");
      out.write("    z-index: 99;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".add-container .add input,.add-container .add select,.add-container .add button {\n");
      out.write("        margin: 10px;\n");
      out.write("        padding: 8px;\n");
      out.write("        font-size: 16px;\n");
      out.write("}\n");
      out.write(".add h3{\n");
      out.write("    color: #F27F0C;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 8px;\n");
      out.write("  \n");
      out.write("    font-size: 24px;\n");
      out.write("}\n");
      out.write(".add button{\n");
      out.write("    background-color: #F27F0C;\n");
      out.write("    border: #F27F0C;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".add select:hover {\n");
      out.write("    border-color: #999;\n");
      out.write("}\n");
      out.write(".add select:focus {\n");
      out.write("    outline: none; \n");
      out.write("    border-color: #007bff; \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("  \n");
      out.write("        <h1>Notice</h1> <br>\n");
      out.write("        ");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select pro_id,Name from products where Qty_On_Hand<1;");
            if(rs.next()){ 
                out.println("<h4>Out of Stock! Need Replacement...</h4>");
                  do{
      out.write("\n");
      out.write("                    <p>");
      out.print(rs.getInt(1));
      out.write(" - ");
      out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("                ");
}  while(rs.next());
            }
            else{
                out.println("<p>No alerts...</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <strong onclick=\"openNav()\" id=\"open\">NOTICE</strong>\n");
      out.write("    ");

        if (request.getAttribute("message") != null) {
            String message = (String) request.getAttribute("message");
    
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <p>");
      out.print( message );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    ");

        }
    
      out.write(" \n");
      out.write("    <div id=\"container\">\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"head\">        \n");
      out.write("            <h1>Inventory Information</h1>\n");
      out.write("            <a class=\"new\" href=\"javascript:void(0)\" onclick=\"scrollToAddProduct()\">Add New...</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"horizontal-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#Rice & Cereal\" onclick=\"scrollToCategory('category1')\">Rice & Cereals</a></li>\n");
      out.write("                    <li><a href=\"#Pulses - paruppu\" >Dals</a></li>\n");
      out.write("                    <li><a href=\"#Snacks\" >Snacks</a></li>\n");
      out.write("                    <li><a href=\"#Beverages\" >Beverages</a></li>\n");
      out.write("                    <li><a href=\"#Dairy\" >Dairy</a></li>\n");
      out.write("                    <li><a href=\"#Condiments & Spices\" >Condiments & Spices</a></li>\n");
      out.write("                    <li><a href=\"#Personal Care\" >Personal Care</a></li>\n");
      out.write("                    <li><a href=\"#Cleaning Supplies\" >Cleaning</a></li>\n");
      out.write("                    <li><a href=\"#Flour\" >Flour</a></li>\n");
      out.write("                    <li><a href=\"#Cans & Jars\">Cans & Jars</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <br><br><br><br>\n");
      out.write("             ");
try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                    Statement st = c.createStatement();
                    ResultSet rs_c = st.executeQuery("SELECT * FROM categories_pro;");
                    if(rs_c.next()){
                        do{
                            String c_name= rs_c.getString("cate_name");
                            int c_id = rs_c.getInt("cate_id");
             
      out.write("\n");
      out.write("                    <div id=\"");
      out.print(c_name);
      out.write("\" class=\"category\">\n");
      out.write("                        <h2>");
      out.print(c_name);
      out.write("</h2>\n");
      out.write("                        <div class=\"product-container\">\n");
      out.write("             ");

                    Statement st1 = c.createStatement();
                    ResultSet rs = st1.executeQuery("SELECT  Name,pro_id, Sell_Price, Qty_On_Hand FROM products WHERE Category_id ="+c_id);
                    out.println("<p>"+c_id+"</p>");
                
                    while(rs.next()){
            
      out.write("\n");
      out.write("            \n");
      out.write("                        <div class=\"product-card\" data-product-id=");
      out.print( rs.getInt("pro_id") );
      out.write(" data-category-id=");
      out.print( c_id );
      out.write(">\n");
      out.write("                            <h3>");
      out.print( rs.getInt("pro_id") );
      out.write(" - ");
      out.print( rs.getString("Name") );
      out.write("</h3>\n");
      out.write("        \n");
      out.write("                            <p>Selling Price: ");
      out.print( rs.getDouble("Sell_Price") );
      out.write("</p>\n");
      out.write("                            <p>Available: ");
      out.print( rs.getInt("Qty_On_Hand") );
      out.write("</p>\n");
      out.write("                            <div class=\"product-options\">\n");
      out.write("                                <a href=\"#\" onclick=\"edit_pro(");
      out.print(rs.getInt(2));
      out.write(")\">Edit</a>\n");
      out.write("                                <a href=\"#\" onclick=\"delete_pro(");
      out.print(rs.getInt(2));
      out.write(")\">Delete</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("             ");
      
                        }
                    }while(rs_c.next());
                }
                    else{
                        out.println("<h3>Sorry, haven't inialized your inventory yet...<br>d Click add categories to add Category & products!</h3>");
                    }
                    c.close(); 
                } catch (Exception e) {
                    // out.println("<p>Error fetching products: " + e.getMessage() + "</p>");           
                    e.printStackTrace();
                }
             
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div\n");
      out.write("        </div> \n");
      out.write("        <div class=\"add-container\" id=\"add\">\n");
      out.write("            <div class=\"add\" id=\"add_product\">\n");
      out.write("                <h2>Add New Product / Category</h2>\n");
      out.write("                <form action=\"add_pro.jsp\" method=\"post\">\n");
      out.write("                    <h3>New Product</h3>\n");
      out.write("                    <select name=\"c_name\"required> \n");
      out.write("                        <option selected disabled>Category_name</option>\n");
      out.write("                ");

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                        Statement st = c.createStatement();
                        ResultSet rs_c = st.executeQuery("SELECT * FROM categories_pro;");
                        while(rs_c.next()){  
      out.write("    \n");
      out.write("                        <option value=");
      out.print(rs_c.getString(2));
      out.write('>');
      out.print(rs_c.getString(2));
      out.write("</option>\n");
      out.write("                ");
    }
                    }
                    catch(Exception e){
                        e.getMessage();
                    }
               
      out.write("</select>\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"Name\" required>\n");
      out.write("                    <input type=\"number\" step=\"0.01\" name=\"sp\" placeholder=\"Selling Price\"required>\n");
      out.write("                    <input type=\"number\" step=\"0.01\" name=\"cp\" placeholder=\"Cost Price\"required>\n");
      out.write("                    <input type=\"number\" name=\"qty\" placeholder=\"Quantity On Hand\">\n");
      out.write("                    <button type=\"submit\">Add Product</button>\n");
      out.write("                </form>\n");
      out.write("                    <br><br><br>\n");
      out.write("                <form action=\"create_cate.jsp\" method=\"post\">\n");
      out.write("                    <h3>New Category</h3>\n");
      out.write("                    <input type=\"text\" name=\"c_name\" placeholder=\"CategoryName\" required>  \n");
      out.write("                    <input type=\"checkbox\" id=\"myCheckbox\" name=\"myCheckbox\" checked>\n");
      out.write("                    <label for=\"myCheckbox\">Installed stocks today</label>\n");
      out.write("                    <button type=\"submit\">Add Category</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        var message = '");
      out.print( request.getAttribute("message") );
      out.write("';\n");
      out.write("        console.log(\"Message received from server: \" + message); // Debug statement\n");
      out.write("        if (message!=='null' && message.trim() !== null) {\n");
      out.write("            alert(message);\n");
      out.write("            message='null';\n");
      out.write("            window.location.href = \"products.jsp\";\n");
      out.write("        setTimeout(function() {\n");
      out.write("     \n");
      out.write("        }, 5000); // 5000 = 5 seconds\n");
      out.write("        }     \n");
      out.write("        function openNav() {\n");
      out.write("            document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("            document.getElementById(\"container\").style.marginLeft = \"250px\";\n");
      out.write("            document.getElementById(\"open\").style.visibility = \"hidden\";\n");
      out.write("            document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function closeNav() {\n");
      out.write("            document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("            document.getElementById(\"container\").style.marginLeft = \"0\";\n");
      out.write("            document.getElementById(\"open\").style.visibility = \"visible\";\n");
      out.write("            document.body.style.backgroundColor = \"white\";\n");
      out.write("        }\n");
      out.write("        function handleProductCardClick(event) {\n");
      out.write("            // Toggle the visibility of product options\n");
      out.write("            const productOptions = event.currentTarget.querySelector('.product-options');\n");
      out.write("            productOptions.style.display = productOptions.style.display === 'block' ? 'none' : 'block';\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Attach click event listener to each product card\n");
      out.write("        const productCards = document.querySelectorAll('.product-card');\n");
      out.write("        productCards.forEach(productCard => {\n");
      out.write("            productCard.addEventListener('click', handleProductCardClick);\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        function delete_pro(pro_Id) {\n");
      out.write("            if (confirm(\"Are you sure you want to product with product Id - '\" + pro_Id + \"'?\")) {\n");
      out.write("                window.location.href = \"del_pro.jsp?pro_id=\" + pro_Id;\n");
      out.write("                alert(pro_Id+\" - deleted Successfully!\");\n");
      out.write("            }\n");
      out.write("        }      \n");
      out.write("        function edit_pro(pro_Id) {\n");
      out.write("            var formUrl = \"edit_pro.jsp?pro_id=\"+pro_Id;\n");
      out.write("            var width = 650;\n");
      out.write("            var height = 580;\n");
      out.write("            var left = (screen.width - width) / 2;\n");
      out.write("            var top = (screen.height - height) / 2;\n");
      out.write("            var windowFeatures = \"width=\" + width + \",height=\" + height + \",toolbar=no,menubar=no,location=no,status=no,left=\" + left + \",top=\" + top;\n");
      out.write("            var newWindow = window.open(formUrl, \"_blank\", windowFeatures);\n");
      out.write("            newWindow.focus();\n");
      out.write("        } \n");
      out.write("        function scrollToAddProduct() {\n");
      out.write("            document.getElementById('add').scrollIntoView({ behavior: 'smooth' });\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    </script>\n");
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
