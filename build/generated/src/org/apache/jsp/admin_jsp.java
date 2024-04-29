package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Grocery Store Admin</title>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin_style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav>\n");
      out.write("        <h1>Welcome Admin</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"employee/employee.jsp\">Employees</a></li>\n");
      out.write("            <li><a href=\"inventory/products.jsp\">Inventory</a></li>\n");
      out.write("            <li><a href=\"retailers.jsp\">Retailers</a></li>\n");
      out.write("            <li><a href=\"sales.jsp\">Sales</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <br><br>\n");
      out.write("    <div class=\"bg\">\n");
      out.write("    <div class=\"grocery-shop\">\n");
      out.write("        <div class=\"store-front\"></div>\n");
      out.write("        <div class=\"roof\"></div>\n");
      out.write("        <div class=\"door\"></div>\n");
      out.write("        <div class=\"window\"></div>\n");
      out.write("        <div class=\"signboard\">Grocery Store</div>\n");
      out.write("        <div class=\"tree\"></div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"todo\">\n");
      out.write("            <center>\n");
      out.write("                <div class=\"head\">\n");
      out.write("                <div class=\"date\">");
DateFormat df = new SimpleDateFormat("dd/MM/yy"); String date1=df.format(new Date());
      out.write("\n");
      out.write("                    ");
      out.print(date1);
      out.write("</div>\n");
      out.write("               <div id=\"td\">To-Do</div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            <ul id=\"todo-list\">\n");
      out.write("                <h4>Electricity bill- 1st may to 10th may<br><br>\n");
      out.write("                Inventory items reinstalled @4th april,2024</h4>           \n");
      out.write("    <!-- Todo items will be dynamically added here -->\n");
      out.write("            </ul>\n");
      out.write("             <div>\n");
      out.write("                   <input type=\"text\" id=\"todo-input\" placeholder=\"Enter a new todo\"> \n");
      out.write("                   <button onclick=\"addTodo()\">Add Todo</button>\n");
      out.write("            </div>\n");
      out.write("                </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <h2 id=\"si\">Sales Increased by 4%!</h2>\n");
      out.write("     <div class=\"copyright\">\n");
      out.write("            <p>&copy; 2024 Grocery Store. All rights reserved.</p>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write(" <script>\n");
      out.write("          function addTodo() {\n");
      out.write("  var todoInput = document.getElementById(\"todo-input\");\n");
      out.write("  var todoText = todoInput.value.trim();\n");
      out.write("  \n");
      out.write("  if (todoText === \"\") {\n");
      out.write("    alert(\"Please enter a todo.\");\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  var todoList = document.getElementById(\"todo-list\");\n");
      out.write("  var todoItem = document.createElement(\"h4\");\n");
      out.write("  todoItem.textContent = todoText;\n");
      out.write("  \n");
      out.write("  var deleteButton = document.createElement(\"button\");\n");
      out.write("  deleteButton.textContent = \"Delete\";\n");
      out.write("  deleteButton.onclick = function() {\n");
      out.write("    todoList.removeChild(todoItem);\n");
      out.write("  };\n");
      out.write("  \n");
      out.write("  todoItem.appendChild(deleteButton);\n");
      out.write("  todoList.appendChild(todoItem);\n");
      out.write("  \n");
      out.write("  todoInput.value = \"\";\n");
      out.write("}\n");
      out.write("</script>\n");
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
