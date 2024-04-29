<!-- 
Inventory Management page
-->

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inventory Management</title>
    <style>
        
 body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}
html {
  scroll-behavior: smooth;
}
h1{
    text-align: center;
    color: #d42929;
}
#container {
    display: flex;
    position: relative;
    transition: margin-left .5s;
    padding: 20px;
}

.sidenav {
  height: 100%; 
  width: 0; 
  position: fixed;
  z-index: 1; 
  top: 0; 
  left: 0;
  background-color:  black; 
  overflow-x: hidden; 
  padding-top: 60px; 
  transition: 0.5s; 
}

.sidenav a,h2 {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #fff;
  display: block;
  transition: 0.3s;
}

.sidenav h1,p{
    color:  #fff;
}

.sidenav h4{
    color:red;
    font-style: italic;
}
/* When you mouse over the navigation links, change their color */
.sidenav a:hover {
  color: #f5f5f5;
}

/* Position and style the close button (top right corner) */
.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
  color: #fff; /* White text color */
}
/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

#open {
    position: absolute;
    top: 30px; 
    left: 20px; 
    cursor: pointer;
    z-index: 999; 
    color: navy;
    font-family: TimesNewRoman;
    font-size: 1.2em;
    font-style: oblique;
}
        
.main-content {
    margin-left: 50px;
    text-align: center;
    padding: 20px;
}
.head {
        display: flex;
        justify-content: space-between;
        align-items: center;
}
.head h1 {
    text-align: center;
    flex-grow: 1;
    margin: 0;
}
.head a{
    color:purple;
    font-size: larger;
    font-style: italic;
}
.horizontal-bar {
    float: left;
    margin-right: 20px;
    text-align: center;
}

.horizontal-bar ul {
    list-style-type: none;
    display: flex;
    justify-content: space-between;
    height: 42px;
    width: 1300px;
    background-color: #f27f0c;
    font-size: 22px;
    padding: 12px;
}

.horizontal-bar ul li a {
    margin-bottom: 10px;
    color: #fff;
    text-decoration: none;
}
.horizontal-bar ul li a:hover{
    color:darkslategray;
}
.category {
    margin-top: 40px;
}

.category h2{
    border: 2px solid #CCCCC6;
    padding: 30px;
    background-color: darkcyan;
    text-align: left;
    color:  #fff;
    z-index: 99;
}
.product-container {
    display: flex;
    flex-wrap: wrap; 
    justify-content: center; 
    align-items: flex-start; 
    gap: 20px; 
}

.product-card {
    border: 1px solid #ccc;
    border-radius: 5px;
    padding: 10px;
    background-color: lightgray;
    width: 250px; 
    border-radius: 5px;
    margin: 10px;
    text-align: center;
    transition: transform 0.2s;
}
.product-card:hover {
    transform: scale(1.1); 
}

.product-options {
    position: absolute;
    top: 105px;
    right: 10px;
    display: none; 
}

.product-card:hover .product-options {
    display: block; 
}
        
/* Product name */
.product-card h3 {
    margin-top: 0;
    font-size: 1.2em;
    color: #333;
}
/* Product description */
.product-card p {
    color: #666;
    font-size:16px;
    font-weight: bold; 
}
/* Product price */
.product-card p.price {
    color: #333;
    font-weight: bold;
}
@keyframes slideIn {
    from { width: 0; }
    to { width: 250px; }
}

@keyframes slideOut {
    from { width: 250px; }
    to { width: 0; }
}
.add-container{
    margin-top: 100px;
    height: auto;
    width: 100%;
    background-color: #ffffff; /* Set your desired background color */
    box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.5);
    padding-bottom: 30px;
}
.add h2{
    border: 2px solid #CCCCC6;
    padding: 30px;
    text-align: center;
    background-color:black;
    text-align: left;
    color:white;
    z-index: 99;
}

.add-container .add input,.add-container .add select,.add-container .add button {
        margin: 10px;
        padding: 8px;
        font-size: 16px;
}
.add h3{
    color: #F27F0C;
    text-align: center;
    padding: 8px;
  
    font-size: 24px;
}
.add button{
    background-color: #F27F0C;
    border: #F27F0C;
    color: white;
}
.add select:hover {
    border-color: #999;
}
.add select:focus {
    outline: none; 
    border-color: #007bff; 
}
    </style>
 
</head>
<body>
    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  
        <h1>Notice</h1> <br>
        <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select pro_id,Name from products where Qty_On_Hand<1;");
            if(rs.next()){ 
                out.println("<h4>Out of Stock! Need Replacement...</h4>");
                  do{%>
                    <p><%=rs.getInt(1)%> - <%=rs.getString(2)%></p>
                <%}  while(rs.next());
            }
            else{
                out.println("<p>No alerts...</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        %>
    </div>

    <strong onclick="openNav()" id="open">NOTICE</strong>
    <%
        if (request.getAttribute("message") != null) {
            String message = (String) request.getAttribute("message");
    %>
    <div>
        <p><%= message %></p>
    </div>
    <%
        }
    %> 
    <div id="container">
        <div class="main-content">
            <div class="head">        
            <h1>Inventory Information</h1>
            <a class="new" href="javascript:void(0)" onclick="scrollToAddProduct()">Add New...</a>
            </div>
            <div class="horizontal-bar">
                <ul>
                    <li><a href="#Rice & Cereal" onclick="scrollToCategory('category1')">Rice & Cereals</a></li>
                    <li><a href="#Pulses - paruppu" >Dals</a></li>
                    <li><a href="#Snacks" >Snacks</a></li>
                    <li><a href="#Beverages" >Beverages</a></li>
                    <li><a href="#Dairy" >Dairy</a></li>
                    <li><a href="#Condiments & Spices" >Condiments & Spices</a></li>
                    <li><a href="#Personal Care" >Personal Care</a></li>
                    <li><a href="#Cleaning Supplies" >Cleaning</a></li>
                    <li><a href="#Flour" >Flour</a></li>
                    <li><a href="#Cans & Jars">Cans & Jars</a></li>
                </ul>
            </div>
            <br><br><br><br>
             <%try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                    Statement st = c.createStatement();
                    ResultSet rs_c = st.executeQuery("SELECT * FROM categories_pro;");
                    if(rs_c.next()){
                        do{
                            String c_name= rs_c.getString("cate_name");
                            int c_id = rs_c.getInt("cate_id");
             %>
                    <div id="<%=c_name%>" class="category">
                        <h2><%=c_name%></h2>
                        <div class="product-container">
             <%
                    Statement st1 = c.createStatement();
                    ResultSet rs = st1.executeQuery("SELECT  Name,pro_id, Sell_Price, Qty_On_Hand FROM products WHERE Category_id ="+c_id);
                    out.println("<p>"+c_id+"</p>");
                
                    while(rs.next()){
            %>
            
                        <div class="product-card" data-product-id=<%= rs.getInt("pro_id") %> data-category-id=<%= c_id %>>
                            <h3><%= rs.getInt("pro_id") %> - <%= rs.getString("Name") %></h3>
        
                            <p>Selling Price: <%= rs.getDouble("Sell_Price") %></p>
                            <p>Available: <%= rs.getInt("Qty_On_Hand") %></p>
                            <div class="product-options">
                                <a href="#" onclick="edit_pro(<%=rs.getInt(2)%>)">Edit</a>
                                <a href="#" onclick="delete_pro(<%=rs.getInt(2)%>)">Delete</a>
                            </div>
                        </div>
             <%      
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
             %>                
            </div>
            </div>
        </div
        </div> 
        <div class="add-container" id="add">
            <div class="add" id="add_product">
                <h2>Add New Product / Category</h2>
                <form action="add_pro.jsp" method="post">
                    <h3>New Product</h3>
                    <select name="c_name"required> 
                        <option selected disabled>Category_name</option>
                <%
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                        Statement st = c.createStatement();
                        ResultSet rs_c = st.executeQuery("SELECT * FROM categories_pro;");
                        while(rs_c.next()){  %>    
                        <option value=<%=rs_c.getString(2)%>><%=rs_c.getString(2)%></option>
                <%    }
                    }
                    catch(Exception e){
                        e.getMessage();
                    }
               %></select>
                    <input type="text" name="name" placeholder="Name" required>
                    <input type="number" step="0.01" name="sp" placeholder="Selling Price"required>
                    <input type="number" step="0.01" name="cp" placeholder="Cost Price"required>
                    <input type="number" name="qty" placeholder="Quantity On Hand">
                    <button type="submit">Add Product</button>
                </form>
                    <br><br><br>
                <form action="create_cate.jsp" method="post">
                    <h3>New Category</h3>
                    <input type="text" name="c_name" placeholder="CategoryName" required>  
                    <input type="checkbox" id="myCheckbox" name="myCheckbox" checked>
                    <label for="myCheckbox">Installed stocks today</label>
                    <button type="submit">Add Category</button>
                </form>
            </div>
        </div>
    
    <script>
        var message = '<%= request.getAttribute("message") %>';
        console.log("Message received from server: " + message); // Debug statement
        if (message!=='null' && message.trim() !== null) {
            alert(message);
            message='null';
            window.location.href = "products.jsp";
        setTimeout(function() {
     
        }, 5000); // 5000 = 5 seconds
        }     
        function openNav() {
            document.getElementById("mySidenav").style.width = "250px";
            document.getElementById("container").style.marginLeft = "250px";
            document.getElementById("open").style.visibility = "hidden";
            document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
        }

        function closeNav() {
            document.getElementById("mySidenav").style.width = "0";
            document.getElementById("container").style.marginLeft = "0";
            document.getElementById("open").style.visibility = "visible";
            document.body.style.backgroundColor = "white";
        }
        function handleProductCardClick(event) {
            // Toggle the visibility of product options
            const productOptions = event.currentTarget.querySelector('.product-options');
            productOptions.style.display = productOptions.style.display === 'block' ? 'none' : 'block';
        }

        // Attach click event listener to each product card
        const productCards = document.querySelectorAll('.product-card');
        productCards.forEach(productCard => {
            productCard.addEventListener('click', handleProductCardClick);
        });
        
        function delete_pro(pro_Id) {
            if (confirm("Are you sure you want to product with product Id - '" + pro_Id + "'?")) {
                window.location.href = "del_pro.jsp?pro_id=" + pro_Id;
                alert(pro_Id+" - deleted Successfully!");
            }
        }      
        function edit_pro(pro_Id) {
            var formUrl = "edit_pro.jsp?pro_id="+pro_Id;
            var width = 650;
            var height = 580;
            var left = (screen.width - width) / 2;
            var top = (screen.height - height) / 2;
            var windowFeatures = "width=" + width + ",height=" + height + ",toolbar=no,menubar=no,location=no,status=no,left=" + left + ",top=" + top;
            var newWindow = window.open(formUrl, "_blank", windowFeatures);
            newWindow.focus();
        } 
        function scrollToAddProduct() {
            document.getElementById('add').scrollIntoView({ behavior: 'smooth' });
        }
    
    </script>
</body>
</html>