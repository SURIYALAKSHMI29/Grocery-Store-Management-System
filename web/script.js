// scripts.js

// Sample employee data
let employees = [];

// Function to display employees
function displayEmployees() {
    const employeeList = document.getElementById("employeeList");
    employeeList.innerHTML = "";

    employees.forEach(employee => {
        const div = document.createElement("div");
        div.innerHTML = `
            <p>Employee ID: ${employee.emp_id}</p>
            <p>Name: ${employee.emp_name}</p>
            <p>Email: ${employee.email}</p>
            <p>Phone No: ${employee.phone_no}</p>
            <!-- Add other employee details here -->
            <button onclick="editEmployee(${employee.emp_id})">Edit</button>
            <button onclick="deleteEmployee(${employee.emp_id})">Delete</button>
        `;
        employeeList.appendChild(div);
    });
}

// Function to add new employee
function addEmployee(event) {
    event.preventDefault();
    const empName = document.getElementById("empName").value;
    // Get other employee details similarly
    const newEmployee = {
        emp_id: employees.length + 1, // This is a simple way to generate IDs, not recommended for production
        emp_name: empName,
        // Add other details here
    };
    employees.push(newEmployee);
    displayEmployees();
    document.getElementById("employeeForm").reset();
}

// Function to edit employee
function editEmployee(empId) {
    // Implement edit functionality here
}

// Function to delete employee
function deleteEmployee(empId) {
    // Implement delete functionality here
}

// Initial display
displayEmployees();

// Event listener for form submission
document.getElementById("employeeForm").addEventListener("submit", addEmployee);
