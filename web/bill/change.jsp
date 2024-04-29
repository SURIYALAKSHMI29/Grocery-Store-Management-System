<!-- change_password.jsp -->

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
    <style>
 /* styles.css */

body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5; 
    color: #333; 
}

.container {
    max-width: 400px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #fff; 
}

.form-group {
    margin-bottom: 20px;
}

label {
    display: block;
    margin-bottom: 5px;
    color: #555; 
}

input[type="text"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

button {
    padding: 10px 20px;
    background-color: orange; 
    color: #fff; 
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: darkorange; 
}

.error-message {
    color: #dc3545; /* Red error message color */
}

    </style>
</head>
<body>
    <div class="container">
        <h2>Change Password</h2>
        <form action="update_password.jsp"  id="form" method="post">
            <div class="form-group">
                <label for="userid">User ID:</label>
                <input type="text" id="userid" name="userid" required>
            </div>
            <div class="form-group">
                <label for="oldpassword">Old Password:</label>
                <input type="password" id="oldpassword" name="oldpassword" required>
            </div>
            <div class="form-group">
                <label for="newpassword">New Password:</label>
                <input type="password" id="newpassword" name="newpassword" required>
            </div>
            <div class="form-group">
                <label for="confirmpassword">Confirm Password:</label>
                <input type="password" id="confirmpassword" name="confirmpassword" required>
            </div>
        </form>
        <button type="submit" onclick="check()">Change Password</button>
        </form>
    </div>
    
    <script>
        function check(){
            const n_pass = document.getElementById("newpassword").value; // Use value instead of innerText
            const c_pass = document.getElementById("confirmpassword").value; 
            if(n_pass===c_pass){
                document.getElementById('form').submit();
                alert("Changed Successfully!");
            }
            else{
                alert("Passwords Mismatch!");
                window.location.href = "../login.jsp";
            }
        }
        
    </script>
</body>
</html>
