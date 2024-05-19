# Grocery Store Management System

Welcome to the Grocery Store Management System repository! This project is designed to manage the operations of a grocery store, including sales, inventory, employees, and retailer details.
The system has a user-friendly front end built with HTML, CSS, and JavaScript, while the backend is powered by Java using JSP (JavaServer Pages) and MySQL for the database.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Database Schema](#database-schema)
- [License](#license)

## Introduction

The Grocery Store Management System is a web-based application designed to streamline the management of a grocery store. It supports functionalities for both administrators and cashiers. 
The cashier can handle billing, while the admin has broader control over inventory, employees, sales, and retailer information.

## Features

### Admin
- View and manage sales data.
- Add, remove, and update employee details.
- Manage product inventory by categories.
  - Add new categories and products.
  - Modify existing inventory.
  - Display out-of-stock products.
- View retailer details.

### Cashier
- Access the payment page to handle customer billing.
- Add items to bills and reduce item amounts from the inventory upon billing.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (JSP)
- **Database**: MySQL

## Installation

To set up this project locally, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/SURIYALAKSHMI29/Grocery-Store-Management-System.git

2. **Set up the database:**

- Install MySQL and create a database named grocery_store.
- Run the SQL script provided in the database folder to create the necessary tables and insert initial data.

3. **Configure the backend:**

- Install a servlet container like Apache Tomcat.
- Deploy the project on the servlet container.
- Configure the database connection settings in the web.xml or a properties file as needed.
- 
4. **Start the server:**

- Start your servlet container (e.g., Apache Tomcat).

5. **Access the application:**

- Open your web browser and navigate to http://localhost:8080/grocery-store-management-system.

## Usage

**Admin Login**
1. Navigate to the admin login page.
2. Enter admin credentials to access the dashboard.
3. Use the dashboard to manage sales, employees, products, and retailer details.

**Cashier Login**
1. Navigate to the cashier login page.
2. Enter cashier credentials to access the payment page.
3. Add items to the bill and process transactions, which will automatically update the inventory.

## Database Schema
The database schema includes tables for:

+ Users: Stores information about admins and cashiers.
+ Products: Contains product details including stock levels.
+ Categories: Manages product categories.
+ Sales: Records sales transactions.
+ Employees: Stores employee details.
+ Retailers: Contains information about product suppliers.

For detailed information, refer to the SQL script in the database folder.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

**Thank you for using the Grocery Store Management System! If you have any questions or feedback, feel free to open an issue or contact.**
