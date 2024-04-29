<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Grocery Billing</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: white;
        }

        .container {
            border: 1px solid lightcyan;
            width: 80%;
            margin: 0 auto;
            margin-top: 50px;
            background-color: #f2f2f2;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        }

        h1 {
            color: #333;
            text-align: center;
        }

        select,
        input,
        button {
            margin: 5px;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .dropdown {
            position: relative;
            display: inline-block;
        }

        #item-dropdown {
            position: absolute;
            background-color: #f9f9f9;
            min-width: 200px;
            box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
            z-index: 1;
            display: none; /* Initially hide the dropdown */
        }

        .item-option {
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            cursor: pointer;
        }

        .item-option:hover {
            background-color: #f1f1f1;
        }

        button {
            background-color: orange;
            color: white;
            cursor: pointer;
        }

        button:hover {
            background-color: darkorange;
        }

        #productDetails {
            margin-top: 20px;
        }

        #totalCost {
            margin-top: 20px;
            font-weight: bold;
        }

        #billTable {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        #billTable th,
        #billTable td {
            padding: 8px;
            text-align: left;
        }

        #billTable th {
            background-color: #f2f2f2;
        }

        .flex-container {
            display: flex; /* Display the child elements in a row */
            justify-content: space-between; /* Distribute space between the child elements */
            align-items: center; /* Align the child elements vertically */
        }

        #u {
            font-style: italic;
            display: flex;
            font-size: 16px;
            padding: 30px;
        }

        .topright {
            position: absolute;
            top: 8px;
            right: 16px;
            font-size: 16px;
            text-decoration: none;
            font-weight: bold;
            color: darkcyan;
        }
    </style>
</head>

<body>
    <a href="change.jsp" class="topright">Change Password</a>
    <div class="container">
        <h1>Grocery Billing</h1>
        <div>

            <div class="dropdown">
                <input type="text" id="item-input" name="item" oninput="filterItems()" placeholder="Type to search">
                <div id="item-dropdown" class="dropdown-content">
                    <%
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store?autoReconnect=true&useSSL=false","root","Laksh_29");  
                            Statement st = c.createStatement();
                            ResultSet rs_c = st.executeQuery("SELECT * FROM products where Qty_On_Hand>0;");
                            while(rs_c.next()){  
                    %>    
                    <div class="item-option" onclick="selectItem('<%=rs_c.getInt(2)%>.<%=rs_c.getString(3)%> - <%=rs_c.getDouble(4)%>', <%=rs_c.getInt(5)%>)"><%=rs_c.getInt(2)%>. <%=rs_c.getString(3)%> - <%=rs_c.getDouble(4)%></div>
                    <%  
                            }
                        } catch(Exception e){
                            e.getMessage();
                        }
                    %>
                </div>
            </div>

            <input type="number" id="qty" placeholder="Qty" min="1">
            <button onclick="addItem()">Add</button>
        </div>
        <br><hr><br>
        <form id="billForm" action="bill_final.jsp" method="post">
            <h2>Bill Details</h2>
            <table id="billTable">
                <thead>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody></tbody>
            </table> <br>
            <input type="hidden" name="user" value= "<%=session.getAttribute("user")%>" >
            <input type="hidden" name="total" value="">
            <div class="flex-container">
                <div id="totalCost">Total Cost: Rs. 0 </div> 
                <div id="u">Billed By:<%=session.getAttribute("user")%></div>
            </div>

        </form>
        <button onclick="generateBill()">Generate Bill</button>
    </div>
    <script>
        function filterItems() {
            var input, filter, dropdown, options, i, option;
            input = document.getElementById('item-input');
            filter = input.value.toUpperCase();
            dropdown = document.getElementById('item-dropdown');
            options = dropdown.getElementsByClassName('item-option');
            if (filter.trim() === "") {
                dropdown.style.display = 'none'; // Hide dropdown if input is empty
            } else {
                dropdown.style.display = 'block'; // Show dropdown if input is not empty
                for (i = 0; i < options.length; i++) {
                    option = options[i];
                    if (option.innerText.toUpperCase().indexOf(filter) > -1) {
                        option.style.display = '';
                    } else {
                        option.style.display = 'none';
                    }
                }
            }
        }

        function selectItem(item, availableQty) {
            document.getElementById('item-input').value = item;
            document.getElementById('item-dropdown').style.display = 'none'; // Hide dropdown after selecting item
            document.getElementById('qty').setAttribute('max', availableQty); // Set maximum quantity based on available quantity
        }


        // Function to add item to the bill
        function addItem() {
            const selectedItem = document.getElementById('item-input').value;
            const pro_id = selectedItem.split('.')[0];
            const Item = selectedItem.split('.')[1];
            const qty = document.getElementById('qty').value;
            const subtotal = (parseFloat(selectedItem.split(' - ')[1]) * qty).toFixed(2);

            const newRow = "<tr>" +
                "<td><input type='hidden' name='pro_id' value='" + pro_id + "'>" + pro_id + "</td>" +
                "<td><input type='hidden' name='item' value='" + Item + "'>" + Item + "</td>" +
                "<td><input type='hidden' name='qty' value='" + qty + "'>" + qty + "</td>" +
                "<td>Rs" + subtotal + "</td>" +
                "</tr>";

            document.querySelector("#billTable tbody").innerHTML += newRow;
            updateTotalCost();

            document.getElementById('item-input').value = '';
            document.getElementById('qty').value = '';
        }

        function updateTotalCost() {
            var totalCost = 0;
            var rows = document.querySelectorAll("#billTable tbody tr");

            // Iterate over the rows and calculate total cost
            for (var i = 0; i < rows.length; i++) {
                totalCost += parseFloat(rows[i].cells[3].innerText.split('Rs')[1]); // Update index to 3 for subtotal
            }
            // Update the total cost display
            document.getElementById('totalCost').innerText = "Total Cost: Rs" + totalCost.toFixed(2);
            document.getElementsByName('total')[0].value = totalCost.toFixed(2);
        }

        // Function to generate the bill
        function generateBill() {
            var total = document.getElementById('totalCost').innerText;
            if (total === "Total Cost: Rs. 0")
                alert(" Add atleast 1 Item!");
            else {
                if (confirm("Are you sure you want to bill?")) {
                    // Assuming your table is wrapped within a <form> element with id="billForm"
                    document.getElementById('billForm').submit();
                    alert("Billed Successfully!");
                }
                else{
                    window.location.reload();
                }
            }
        }
    </script>
</body>

</html>
