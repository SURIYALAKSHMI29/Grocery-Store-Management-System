<%@ page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false", "root", "Laksh_29");
        Statement st = c.createStatement();
        //out.println("<h2>redirected</h2>");
        String name = request.getParameter("name");
        Double sp = Double.valueOf(request.getParameter("sp"));      
        Double cp = Double.valueOf(request.getParameter("cp"));      
        int qty = Integer.parseInt(request.getParameter("qty"));
        out.println("<h2>"+qty+"</h2>");
        String c_name = request.getParameter("c_name");
//        out.println("<h2>sdelect redirected</h2>");
        ResultSet rs = st.executeQuery("Select cate_id from categories_pro where cate_name='"+c_name+"';");
        rs.next();
        int c_id = rs.getInt(1);
        //out.println("<h2>"+c_id+"</h2>");
        String query = "Insert into products(Category_Id, Name, Sell_Price, Qty_On_Hand, Purchase_Price) Values(?,?,?,?,?);";
        PreparedStatement ps=c.prepareStatement(query);  
//       out.println("<h2>query</h2>");
        ps.setInt(1,c_id);
        ps.setString(2,name);
        ps.setDouble(3,sp);
        ps.setInt(4,qty);
        ps.setDouble(5,cp);
        ps.executeUpdate(); 
        response.sendRedirect("products.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>