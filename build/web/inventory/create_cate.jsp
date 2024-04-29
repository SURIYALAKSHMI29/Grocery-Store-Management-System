<%@ page import="java.sql.*" %>
<%
                String checkboxValue = request.getParameter("myCheckbox");
                if(checkboxValue==null){ 
                    request.setAttribute("message","Could not create a Category that have not installed yet!");
                }
              else{
                try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                Statement st = c.createStatement();
                
                String c_name = request.getParameter("c_name").toUpperCase();

                ResultSet rs = st.executeQuery("Select cate_id from categories_pro where upper(cate_name)='"+c_name+"';");
                if(!rs.next()){
                    PreparedStatement ps = c.prepareStatement("Insert into categories_pro(cate_name, reinstalled_at) values(?,curdate());");
                    ps.setString(1, c_name); 
                    ps.executeUpdate();
                    request.setAttribute("message", "New category has been created successfully");
                }
                else{  
                    request.setAttribute("message", "Already a category exists with the same name!");
                }
            }
            catch(Exception e){
                e.getMessage();
                request.setAttribute("message", "An error occurred while creating the category: " + e.getMessage());
              }
            }
            request.getRequestDispatcher("products.jsp").forward(request, response);
%>