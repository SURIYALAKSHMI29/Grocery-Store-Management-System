package org.apache.jsp.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>manage_Employee</title>\n");
      out.write("    <style>\n");
      out.write("    body {\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("    h1, h2 {\n");
      out.write("        text-align: center;\n");
      out.write("        color:#F27F0C;\n");
      out.write("    }\n");
      out.write("    .employee-list {\n");
      out.write("        margin: 20px auto;\n");
      out.write("        width: 80%;\n");
      out.write("    }\n");
      out.write("    table {\n");
      out.write("        width: 100%;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    table, th, td {\n");
      out.write("        border: 2px solid #d4d4d4; /* bg->white border->d4d4d4 */\n");
      out.write("        padding: 10px;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("    th {\n");
      out.write("        text-align: center;\n");
      out.write("        color:navy;\n");
      out.write("        background-color: #ECECEC;\n");
      out.write("    }\n");
      out.write("    .add-employee {\n");
      out.write("        margin: 20px auto;\n");
      out.write("        margin-top: 70px;\n");
      out.write("        width: 80%;\n");
      out.write("    }\n");
      out.write("    .add-employee form{\n");
      out.write("         margin-left: 130px;\n");
      out.write("    }\n");
      out.write("    .add-employee input, .add-employee button {\n");
      out.write("        margin: 5px;\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .edit {\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        padding: 2px 8px;\n");
      out.write("        margin-left: 10px;\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .highlight {\n");
      out.write("        background-color: #F8F6F0;\n");
      out.write("    }\n");
      out.write("    .enlarge {\n");
      out.write("        font-weight: bold;   \n");
      out.write("    }\n");
      out.write("    .delete {\n");
      out.write("        background-color: #f44336;\n");
      out.write("        padding: 2px 8px;\n");
      out.write("        margin-right: 5px;\n");
      out.write("        margin-left: 10px;\n");
      out.write("        color: white;\n");
      out.write("        border: none;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Employee Details</h1>\n");
      out.write("\n");
      out.write("    <div class=\"employee-list\">\n");
      out.write("        <table>\n");
      out.write("            <center>\n");
      out.write("            <tr>\n");
      out.write("                <th>Employee ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Phone No</th>\n");
      out.write("                <th>Joined Date</th>\n");
      out.write("                <th>Work Type</th>\n");
      out.write("                <th>Salary</th>\n");
      out.write("                <th>Actions</th>\n");
      out.write("            </tr>\n");
      out.write("            </center>\n");
      out.write("            ");

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");
                Statement st= c.createStatement();
                ResultSet rs= st.executeQuery("Select * from employees where id<>1;");
                while(rs.next()){ 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rs.getInt(1) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getString(6) );
      out.write("</td>\n");
      out.write("                        <td contenteditable=\"false\">");
      out.print( rs.getDouble(7) );
      out.write("</td>\n");
      out.write("                        <td class=\"btns\">\n");
      out.write("                            <button class=\"edit\" onclick=\"editEmployee(this)\">Edit</button>\n");
      out.write("                            <button class=\"delete\" onclick=\"deleteEmployee(");
      out.print( rs.getInt(1) );
      out.write(")\">Delete</button>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        <td style=\"display: none;\">\n");
      out.write("                        <form action=\"edit_emp.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"employee_id\" value=\"");
      out.print( rs.getInt(1) );
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"name\">\n");
      out.write("                            <input type=\"hidden\" name=\"email\">\n");
      out.write("                            <input type=\"hidden\" name=\"phone\">\n");
      out.write("                            <input type=\"hidden\" name=\"joined_date\">\n");
      out.write("                            <input type=\"hidden\" name=\"work_type\">\n");
      out.write("                            <input type=\"hidden\" name=\"salary\">\n");
      out.write("                            <button type=\"submit\" style=\"display: none;\"></button> <!-- Hidden submit button -->\n");
      out.write("                        </form>\n");
      out.write("                        </td>    \n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("              ");
  }
            }
            catch(Exception e){ e.getMessage(); }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div id=\"edit_form\"></div>\n");
      out.write("    \n");
      out.write("    <div class=\"add-employee\">\n");
      out.write("        <h2>Add New Employee</h2>\n");
      out.write("        <form action=\"add_emp.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Name\" required>\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            <input type=\"text\" name=\"ph_no\" placeholder=\"Phone No\">\n");
      out.write("            <input type=\"text\" name=\"work_type\" placeholder=\"Work Type\" required>\n");
      out.write("            <input type=\"text\" name=\"salary\" placeholder=\"Salary\">\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\">Add Employee</button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    function editEmployee(button) {\n");
      out.write("        var row = button.parentNode.parentNode; //to access the entire row (button ->td ->tr)\n");
      out.write("        var cells = row.getElementsByTagName('td');\n");
      out.write("        \n");
      out.write("        // Toggle contenteditable attribute for each cell\n");
      out.write("        for (var i = 1; i < cells.length - 1; i++) { // Exclude the first and last cell\n");
      out.write("            if (cells[i].contentEditable === 'true') {\n");
      out.write("                cells[i].contentEditable = 'false';\n");
      out.write("            } else {\n");
      out.write("                cells[i].contentEditable = 'true';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        row.classList.toggle('highlight');\n");
      out.write("        row.classList.toggle('enlarge');\n");
      out.write("        if (button.innerHTML === 'Edit') {\n");
      out.write("            button.innerHTML = 'Save';\n");
      out.write("        } \n");
      out.write("        else {\n");
      out.write("            button.innerHTML = 'Edit';           \n");
      out.write("        // Find the form within the row\n");
      out.write("            var form = row.querySelector('form');\n");
      out.write("        // Populate form fields with edited values\n");
      out.write("            var inputs = form.getElementsByTagName('input');\n");
      out.write("            for (var i = 1; i < inputs.length; i++) {\n");
      out.write("                inputs[i].value = cells[i].textContent; // Start from index 1 to skip Employee ID\n");
      out.write("            }\n");
      out.write("            form.submit();  \n");
      out.write("            alert(\"Edited successfully!\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    function deleteEmployee(employee_Id) {\n");
      out.write("    if (confirm(\"Are you sure you want to delete '\" + employee_Id + \"' employee?\")) {\n");
      out.write("        window.location.href = \"del_emp.jsp?emp_id=\" + employee_Id;\n");
      out.write("        alert(employee_Id+\" - deleted Successfully!\");\n");
      out.write("         }\n");
      out.write("    }\n");
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
