package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class retailers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Retailers</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    color: orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#retailersList {\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));\n");
      out.write("    grid-gap: 20px;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".retailer {\n");
      out.write("    background-color: #fff;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".retailer h2 {\n");
      out.write("    margin-top: 0;\n");
      out.write("    color: orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".retailer p {\n");
      out.write("    color: darkcyan;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".related-content {\n");
      out.write("    margin-top: 10px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    color: #999;\n");
      out.write("}\n");
      out.write(".related-content p{\n");
      out.write("    color: graytext;\n");
      out.write("}\n");
      out.write(".dis1, .dis2, .dis3{\n");
      out.write("    display: flex;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    align-content: flex-start;\n");
      out.write("}\n");
      out.write("#col12,  #col11, #col13{\n");
      out.write("    color: darkslategrey;\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write(".cat{\n");
      out.write("    color: darkslategrey;\n");
      out.write("    margin-left: 20px;\n");
      out.write("}\n");
      out.write(".topright {\n");
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
      out.write("<body>\n");
      out.write("    <a href=\"new_retailer.jsp\" class=\"topright\">Update Installment</a>\n");
      out.write("    <h1>Our Retailers</h1> <br>\n");
      out.write("    <div id=\"retailersList\">\n");
      out.write("        ");
 
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
                String query = "SELECT * FROM distributor;";
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
        
      out.write("\n");
      out.write("        <div class=\"retailer\">\n");
      out.write("            <h2>");
      out.print( rs.getString("Distributor_Id") );
      out.write("</h2>\n");
      out.write("            <div class=\"dis1\">\n");
      out.write("                <p id=\"col11\">Name: <p>\n");
      out.write("                <p class=\"col2\"> ");
      out.print( rs.getString("Distributor_Name") );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"dis2\">\n");
      out.write("                <p id=\"col12\">Contact:</p>\n");
      out.write("                <p class=\"col2\"> ");
      out.print( rs.getString("Phone_Number") );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dis3\">\n");
      out.write("                <p id=\"col13\">Manager: </p>\n");
      out.write("                <p class=\"col2\"> ");
      out.print( rs.getString("Distributor_Manager") );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"related-content\">\n");
      out.write("                <h3>Categories distributed</h3>\n");
      out.write("                <ul>\n");
      out.write("                    \n");
      out.write("                    ");

                         try {
                            String query1 = "SELECT d.Distributor_id, dd.cate_id, MIN(c.cate_name) AS cate_name FROM distributor d INNER JOIN distributor_category_link dd ON d.Distributor_id = dd.Dist_Id INNER JOIN categories_pro c ON dd.cate_id = c.cate_id WHERE d.Distributor_id = ? GROUP BY d.Distributor_id, dd.cate_id;" ;
                            PreparedStatement ps = c.prepareStatement(query1);
                            ps.setInt(1, rs.getInt("Distributor_Id"));
                            ResultSet rs1 = ps.executeQuery();
                            while (rs1.next()) { 
      out.write("\n");
      out.write("                                <li class=\"cat\"> ");
      out.print(rs1.getString("cate_name"));
      out.write("</li>\n");
      out.write("                    ");
      }
                            rs1.close(); // Close the inner result set after processing
         
                         }
                         catch(Exception e){
                             e.getMessage();
                         }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 
                }
                rs.close();
                stmt.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("   \n");
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
