<%-- 
    Document   : admin
    Created on : 11 Apr, 2024, 1:57:50 PM
    Author     : suriya
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Grocery Store Admin</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="admin_style.css">

</head>
<body>
    <nav>
        <h1>Welcome Admin</h1>
        <ul>
            <li><a href="employee/employee.jsp">Employees</a></li>
            <li><a href="inventory/products.jsp">Inventory</a></li>
            <li><a href="retailers.jsp">Retailers</a></li>
            <li><a href="sales.jsp">Sales</a></li>
        </ul>
    </nav>
    <br><br>
    <div class="bg">
    <div class="grocery-shop">
        <div class="store-front"></div>
        <div class="roof"></div>
        <div class="door"></div>
        <div class="window"></div>
        <div class="signboard">Grocery Store</div>
        <div class="tree"></div>
    </div>
        <div class="todo">
            <center>
                <div class="head">
                <div class="date"><%DateFormat df = new SimpleDateFormat("dd/MM/yy"); String date1=df.format(new Date());%>
                    <%=date1%></div>
               <div id="td">To-Do</div>
                </div>
           
            <ul id="todo-list">
                <h4>Electricity bill- 1st may to 10th may<br><br>
                Inventory items reinstalled @4th april,2024</h4>  
            </ul>
             <div>
                   <input type="text" id="todo-input" placeholder="Enter a new todo"> 
                   <button onclick="addTodo()">Add Todo</button>
            </div>
                </center>
        </div>
    </div>
      <h2 id="si">Sales Increased by 4%!</h2>
     <div class="copyright">
            <p>&copy; 2024 Grocery Store. All rights reserved.</p>
    </div>
      
 <script>
          function addTodo() {
  var todoInput = document.getElementById("todo-input");
  var todoText = todoInput.value.trim();
  
  if (todoText === "") {
    alert("Please enter a todo.");
    return;
  }
  
  var todoList = document.getElementById("todo-list");
  var todoItem = document.createElement("h4");
  todoItem.textContent = todoText;
  
  var deleteButton = document.createElement("button");
  deleteButton.textContent = "Delete";
  deleteButton.onclick = function() {
    todoList.removeChild(todoItem);
  };
  
  todoItem.appendChild(deleteButton);
  todoList.appendChild(todoItem);
  
  todoInput.value = "";
}
</script>
</body>
</html>
