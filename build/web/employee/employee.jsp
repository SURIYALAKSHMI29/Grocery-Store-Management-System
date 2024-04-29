<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>manage_Employee</title>
    <style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    h1, h2 {
        text-align: center;
        color:#F27F0C;
    }
    .employee-list {
        margin: 20px auto;
        width: 80%;
    }
    table {
        width: 100%;
        border-collapse: collapse;
       
    }
    table, th, td {
        border: 2px solid #d4d4d4; /* bg->white border->d4d4d4 */
        padding: 10px;
        text-align: left;
    }
    th {
        text-align: center;
        color:navy;
        background-color: #ECECEC;
    }
    .add-employee {
        margin: 20px auto;
        margin-top: 70px;
        width: 80%;
    }
    .add-employee form{
         margin-left: 130px;
    }
    .add-employee input, .add-employee button {
        margin: 5px;
        padding: 8px;
    }
    
    .edit {
        background-color: #4CAF50;
        padding: 2px 8px;
        margin-left: 10px;
        color: white;
        border: none;
        cursor: pointer;
    }
    .highlight {
        background-color: #F8F6F0;
    }
    .enlarge {
        font-weight: bold;   
    }
    .delete {
        background-color: #f44336;
        padding: 2px 8px;
        margin-right: 5px;
        margin-left: 10px;
        color: white;
        border: none;
        cursor: pointer;
    }
    </style>
</head>
<body>
    <h1>Employee Details</h1>

    <div class="employee-list">
        <table>
            <center>
            <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone No</th>
                <th>Joined Date</th>
                <th>Work Type</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
            </center>
            <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");
                Statement st= c.createStatement();
                ResultSet rs= st.executeQuery("Select * from employees where id<>1;");
                while(rs.next()){ %>
                    <tr>
                        <td><%= rs.getInt(1) %></td>
                        <td contenteditable="false"><%= rs.getString(2) %></td>
                        <td contenteditable="false"><%= rs.getString(3) %></td>
                        <td contenteditable="false"><%= rs.getString(4) %></td>
                        <td contenteditable="false"><%= rs.getString(5) %></td>
                        <td contenteditable="false"><%= rs.getString(6) %></td>
                        <td contenteditable="false"><%= rs.getDouble(7) %></td>
                        <td class="btns">
                            <button class="edit" onclick="editEmployee(this)">Edit</button>
                            <button class="delete" onclick="deleteEmployee(<%= rs.getInt(1) %>)">Delete</button>
                        </td>
                        
                        <td style="display: none;">
                        <form action="edit_emp.jsp" method="post">
                            <input type="hidden" name="employee_id" value="<%= rs.getInt(1) %>">
                            <input type="hidden" name="name">
                            <input type="hidden" name="email">
                            <input type="hidden" name="phone">
                            <input type="hidden" name="joined_date">
                            <input type="hidden" name="work_type">
                            <input type="hidden" name="salary">
                            <button type="submit" style="display: none;"></button> <!-- Hidden submit button -->
                        </form>
                        </td>    
                    </tr>
                  
              <%  }
            }
            catch(Exception e){ e.getMessage(); }
            %>
        </table>
    </div>
        
    <div id="edit_form"></div>
    
    <div class="add-employee">
        <h2>Add New Employee</h2>
        <form action="add_emp.jsp" method="post">
            <input type="text" name="name" placeholder="Name" required>
            <input type="email" name="email" placeholder="Email">
            <input type="text" name="ph_no" placeholder="Phone No">
            <input type="text" name="work_type" placeholder="Work Type" required>
            <input type="text" name="salary" placeholder="Salary">
            <br>
            <button type="submit">Add Employee</button>
            
        </form>
    </div>

    <script>
    function editEmployee(button) {
        var row = button.parentNode.parentNode; //to access the entire row (button ->td ->tr)
        var cells = row.getElementsByTagName('td');
        
        // Toggle contenteditable attribute for each cell
        for (var i = 1; i < cells.length - 1; i++) { // Exclude the first and last cell
            if (cells[i].contentEditable === 'true') {
                cells[i].contentEditable = 'false';
            } else {
                cells[i].contentEditable = 'true';
            }
        }
        row.classList.toggle('highlight');
        row.classList.toggle('enlarge');
        if (button.innerHTML === 'Edit') {
            button.innerHTML = 'Save';
        } 
        else {
            button.innerHTML = 'Edit';           
        // Find the form within the row
            var form = row.querySelector('form');
        // Populate form fields with edited values
            var inputs = form.getElementsByTagName('input');
            for (var i = 1; i < inputs.length; i++) {
                inputs[i].value = cells[i].textContent; // Start from index 1 to skip Employee ID
            }
            form.submit();  
            alert("Edited successfully!");
        }
    }
    function deleteEmployee(employee_Id) {
    if (confirm("Are you sure you want to delete '" + employee_Id + "' employee?")) {
        window.location.href = "del_emp.jsp?emp_id=" + employee_Id;
        alert(employee_Id+" - deleted Successfully!");
         }
    }
    </script>
</body>
</html>