<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sales Report</title>
    <style>
body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5; /* Light gray background */
            color: #333; /* Dark gray text color */
        }
        .container {
            max-width: 900px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc; /* Light gray border */
            border-radius: 5px;
            background-color: #fff; /* White background */
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .head{
            max-width: 400px;
            text-align: left;
            margin-left: 50px;
        }
        .form-group {
            margin-bottom: 30px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #555; /* Dark gray label color */
        }
        input[type="date"],
        button {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc; /* Light gray border */
            border-radius: 5px;
        }
        button {
            background-color: orange; /* Orange button background color */
            color: #fff; /* White button text color */
            cursor: pointer;
        }
        button:hover {
            background-color: darkorange; /* Darker orange button background color on hover */
        }
        table {
        width: 70%;
        border-collapse: collapse;
        margin: 20px auto; /* Center the table horizontally */
        text-align: center; 
    }
    
    th, td {
        padding: 8px;
        border: 1px solid #ddd;
        text-align: left;
    }
    
    th {
        background-color: lightgoldenrodyellow; /* Light gray background for table header */
    }
    
    tr:nth-child(even) {
        background-color: #f9f9f9; /* Lighter gray background for even rows */
    }
    
    tr:hover {
        background-color: #f2f2f2; /* Darker gray background for hovered rows */
    }
    .heading,h2,h3{
        text-align: center;
        color: orange;
    }
    .container1 {
        font-size: 22px;
        font-weight: bold;
        display: flex;
        justify-content: center; 
        align-items: center; 
        margin-top: 60px;
        margin-bottom: 20px; 
        text-align: center;
    }
    #sa {
    color: orange; 
    margin-right: 10px; 
}

#date {
    color: darkorange; 
    margin-left: 10px; 
    font-size: 18px;
}

    </style>
</head>
<body>
    <h1 class="heading">ABC Grocery Store</h1>
    <div class="container"> 
        <div class="head">
        <h1>Sales Report</h1>
        
        <!-- Form to select date range for the report -->
        <form action="sales.jsp" method="post">
            <div class="form-group">
                <label for="start_date">Start Date:</label>
                <input type="date" id="start_date" name="start_date" required  max="<%=java.time.LocalDate.now()%>">
            </div>
            <div class="form-group">
                <label for="end_date">End Date:</label>
                <input type="date" id="end_date" name="end_date" required max="<%=java.time.LocalDate.now()%>">
            </div>
            <button type="submit">Generate Report</button> <br>
        </form>
        </div>
        <% 
            if (request.getMethod().equals("POST")) {
            // Retrieve data from the database based on the selected date range
            
            String startDate = request.getParameter("start_date");
            String endDate = request.getParameter("end_date");%>
            <br><br><br><hr>
            <div class="container1">
                <div id="sa">Sales Table</div>
                <div id="date">[<%=startDate%> to <%=endDate%>]</div>
            </div>
    <%         try {
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
        %>
    </div>    
</body>
</html>
