package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class sales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sales Report</title>\n");
      out.write("    <style>\n");
      out.write("body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f5f5f5; /* Light gray background */\n");
      out.write("            color: #333; /* Dark gray text color */\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 1px solid #ccc; /* Light gray border */\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #fff; /* White background */\n");
      out.write("            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .head{\n");
      out.write("            max-width: 400px;\n");
      out.write("            text-align: left;\n");
      out.write("            margin-left: 50px;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #555; /* Dark gray label color */\n");
      out.write("        }\n");
      out.write("        input[type=\"date\"],\n");
      out.write("        button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc; /* Light gray border */\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            background-color: orange; /* Orange button background color */\n");
      out.write("            color: #fff; /* White button text color */\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background-color: darkorange; /* Darker orange button background color on hover */\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("        width: 70%;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        margin: 20px auto; /* Center the table horizontally */\n");
      out.write("        text-align: center; \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    th, td {\n");
      out.write("        padding: 8px;\n");
      out.write("        border: 1px solid #ddd;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    th {\n");
      out.write("        background-color: lightgoldenrodyellow; /* Light gray background for table header */\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    tr:nth-child(even) {\n");
      out.write("        background-color: #f9f9f9; /* Lighter gray background for even rows */\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    tr:hover {\n");
      out.write("        background-color: #f2f2f2; /* Darker gray background for hovered rows */\n");
      out.write("    }\n");
      out.write("    .heading,h2,h3{\n");
      out.write("        text-align: center;\n");
      out.write("        color: orange;\n");
      out.write("    }\n");
      out.write("    .container1 {\n");
      out.write("        font-size: 22px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center; \n");
      out.write("        align-items: center; \n");
      out.write("        margin-top: 60px;\n");
      out.write("        margin-bottom: 20px; \n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    #sa {\n");
      out.write("    color: orange; \n");
      out.write("    margin-right: 10px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("#date {\n");
      out.write("    color: darkorange; \n");
      out.write("    margin-left: 10px; \n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1 class=\"heading\">ABC Grocery Store</h1>\n");
      out.write("    <div class=\"container\"> \n");
      out.write("        <div class=\"head\">\n");
      out.write("        <h1>Sales Report</h1>\n");
      out.write("        \n");
      out.write("        <!-- Form to select date range for the report -->\n");
      out.write("        <form action=\"sales.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"start_date\">Start Date:</label>\n");
      out.write("                <input type=\"date\" id=\"start_date\" name=\"start_date\" required  max=\"");
      out.print(java.time.LocalDate.now());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"end_date\">End Date:</label>\n");
      out.write("                <input type=\"date\" id=\"end_date\" name=\"end_date\" required max=\"");
      out.print(java.time.LocalDate.now());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\">Generate Report</button> <br>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        ");
 
            if (request.getMethod().equals("POST")) {
            // Retrieve data from the database based on the selected date range
            
            String startDate = request.getParameter("start_date");
            String endDate = request.getParameter("end_date");
      out.write("\n");
      out.write("            <br><br><br><hr>\n");
      out.write("            <div class=\"container1\">\n");
      out.write("                <div id=\"sa\">Sales Table</div>\n");
      out.write("                <div id=\"date\">[");
      out.print(startDate);
      out.write(" to ");
      out.print(endDate);
      out.write("]</div>\n");
      out.write("            </div>\n");
      out.write("    ");
         try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
                String query = "SELECT * FROM bill WHERE Date BETWEEN ? AND ?;";
                PreparedStatement ps = c.prepareStatement(query);
                ps.setString(1, startDate);
                ps.setString(2, endDate);
                // Execute the query
                ResultSet rs = ps.executeQuery();
                int total=0;
                
        // Display the sales report table
                out.println("<table border='1'>");
                out.println("<tr><th>Sale ID</th><th>Sale Date</th><th>Total Amount</th><th>Billed By</th></tr>");
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("bill_id") + "</td>");
                    out.println("<td>" + rs.getDate("Date") + "</td>");
                    out.println("<td>" + rs.getDouble("Total_Amount") + "</td>");
                    out.println("<td>" + rs.getInt("Billed_By") + "</td>");
                    out.println("</tr>");
                    total+=rs.getDouble("Total_Amount");
                }
                out.println("</table><br>");
            
            out.println("<h3>Total Sales: Rs. "+total+"</h3>");
        // Close the resources
        rs.close();
        ps.close();
        c.close();
            }
             catch (Exception e) {
                out.println("<h3>Error: " + e.getMessage() + "</h3>");
            }
        }
        
      out.write("\n");
      out.write("    </div>    \n");
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
