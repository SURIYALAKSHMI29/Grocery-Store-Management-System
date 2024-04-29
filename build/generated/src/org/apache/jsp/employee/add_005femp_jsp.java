package org.apache.jsp.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_005femp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        Statement st = c.createStatement();
        out.println("<h2>redirected</h2>");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String ph_no = request.getParameter("ph_no");
        String w_type = request.getParameter("work_type");
        String sal = request.getParameter("salary");
        out.println("<h2>"+email+"</h2>");
        Double salary = Double.valueOf(sal);
        
        String query = "Insert into employees(name, email,phone_no,date_of_join,work_type,salary) Values(?,?,?,curDate(),?,?);";
        PreparedStatement ps=c.prepareStatement(query);  
        out.println("<h2>query</h2>");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,ph_no);
        ps.setString(4,w_type);
        ps.setDouble(5,salary);
        out.println("<h2>executed</h2>");
        int i=ps.executeUpdate(); 
        out.println("<h2>"+i +" redirected</h2>");
        response.sendRedirect("employee.jsp");
    } catch (Exception e) {
        e.printStackTrace();
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
