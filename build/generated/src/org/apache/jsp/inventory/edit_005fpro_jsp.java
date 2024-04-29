package org.apache.jsp.inventory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        //out.println("<h2>bbb redirected</h2>");
        int pro_id = Integer.parseInt(request.getParameter("pro_id"));
        //out.println("<p>"+pro_id+"</p>");
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("Select * from products where pro_id ="+pro_id+";");
        if(rs.next()){

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        .container {\n");
      out.write("            position: relative;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .img {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("            background-image: url('admin.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            filter: blur(15px);\n");
      out.write("            z-index: -1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            color: white;\n");
      out.write("            font-size: 26px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            margin: 0 auto;\n");
      out.write("            width: 50%;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            text-align: right;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type='submit'] {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            background-color: #f27f0c;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class='container'>\n");
      out.write("    <div class='img'></div>\n");
      out.write("    <h2>Edit the product details!</h2>\n");
      out.write("    <form method=\"post\" action=\"edit_pro.jsp?pro_id=");
      out.print( rs.getInt(1));
      out.write("\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Category Id:</th>\n");
      out.write("            <td> ");
      out.print( rs.getInt(1));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Product Id:</th>\n");
      out.write("            <td>");
      out.print( rs.getInt(2));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Name:</th>\n");
      out.write("            <td> <input type=\"text\" name='name' value='");
      out.print( rs.getString(3));
      out.write("'></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Selling Price:</th>\n");
      out.write("            <td> <input type=\"text\" name='sp' value='");
      out.print( rs.getString(4));
      out.write("'></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Purchased price:</th>\n");
      out.write("            <td> <input type=\"text\" name='cp' value='");
      out.print( rs.getDouble(6));
      out.write("'></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Available: </th>\n");
      out.write("            <td> <input type=\"text\" name='avail' value=' ");
      out.print( rs.getInt(5));
      out.write("'></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <input type='submit' value=\"Save Changes\">\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    ");

        if (request.getMethod().equals("POST")) {
        int p_id = Integer.parseInt(request.getParameter("pro_id")); 
        String name = request.getParameter("name");
        out.println("<h2>bbb redirected1"+p_id+"</h2>");
        double sp = Double.parseDouble(request.getParameter("sp")); 
        double cp = Double.parseDouble(request.getParameter("cp")); 
        int avail = Integer.parseInt(request.getParameter("avail")); 
        out.println("<h2>bbb redirected4"+cp+" "+sp+"</h2>");
        PreparedStatement ps = c.prepareStatement("UPDATE products SET Name=?, Sell_Price=?, Qty_On_Hand=?, Purchase_Price=? WHERE pro_id=?;");
        out.println("<h2>bbb redirected6</h2>");
        ps.setString(1, name);
        ps.setDouble(2, sp);
        ps.setInt(3, avail);
        ps.setDouble(4, cp);
        ps.setInt(5, p_id);
        out.println("<h2>bbb redirected7"+avail+"</h2>");
        ps.executeUpdate();  
        out.println("<h2>bbb redirected8</h2>");
        c.close(); 
        out.println("<script>alert('Changes are Saved successfully for the product '"+p_id+"');</script>");
        response.sendRedirect("products.jsp");
        }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      }
    }catch(Exception e){
        out.println("Error: " + e.getMessage());
    }

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
