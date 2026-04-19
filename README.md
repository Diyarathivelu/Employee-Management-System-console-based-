
# Employee Management System (Java + JDBC + MySQL)-console based

## 📌 Project Overview

This is a **console-based Employee Management System** developed using **Java, JDBC, and MySQL**.
The application allows users to perform basic **CRUD operations (Create, Read, Update, Delete)** on employee records stored in a MySQL database.

The project follows a **layered architecture** with separate packages for the model, service, repository, and database connection.

This project was created to practice:

* Java programming
* JDBC database connectivity
* CRUD operations
* Layered backend architecture
* Input validation

---

## 🛠 Technologies Used

* **Java (JDK 21)**
* **JDBC (Java Database Connectivity)**
* **MySQL**
* **Console-based UI**
* **Eclipse / VS Code**

---

## 📂 Project Structure

```
EmployeeManagementSystem
│
├── app
│   └── main.java
│
├── model
│   └── employee.java
│
├── service
│   └── employeeService.java
│
├── repository
│   └── employeeRepository.java
│
├── util
│   └── Dbconnection.java
```

### Package Description

**app**

* Contains the main class that starts the application.

**model**

* Contains the `employee` class representing employee data.

**service**

* Handles user interaction, menu logic, and input validation.

**repository**

* Contains database operations using JDBC.

**util**

* Handles database connection logic.

---

## 🗄 Database Table

Example MySQL table used in this project:

```sql
CREATE TABLE employeetable (
    empId INT PRIMARY KEY,
    empName VARCHAR(50),
    empDes VARCHAR(50),
    empDept VARCHAR(50),
    empSal INT
);
```

---

## ⚙ Features

The system supports the following operations:

1. **Add Employee**
2. **View All Employees**
3. **Update Employee Details**
4. **Delete Employee**
5. **Find Employee by ID**
6. **View Total Number of Employees**
7. **Exit Application**

---

## 🔎 Input Validation

The application includes validation to ensure correct input such as:

* Employee ID must be positive
* Employee salary must be valid
* Duplicate employee IDs are not allowed
* Required fields cannot be empty

---

## 🔄 Application Flow

```
User Input
   ↓
Service Layer
   ↓
Repository Layer
   ↓
JDBC
   ↓
MySQL Database
```

---

## ▶ How to Run the Project

1. Install **Java (JDK 17 or above)**
2. Install **MySQL**
3. Create the database and table
4. Update database credentials in `Dbconnection.java`
5. Run the `main` class

Example:

```java
public class main {
    public static void main(String[] args) {
        employeeService emp = new employeeService();
        emp.start();
    }
}
```

---

## 📖 Learning Outcomes

From this project, the following concepts were practiced:

* Java Classes and Objects
* Layered Architecture
* JDBC Connection
* PreparedStatement and ResultSet
* SQL CRUD Operations
* Input Validation
* Console-based Application Development

---

## 🚀 Future Improvements

Possible improvements for the project:

* Add logging
* Improve exception handling
* Implement try-with-resources
* Convert project to **Spring Boot REST API**
* Add web interface using **Spring MVC or React**

---
## 👩‍💻 Author

Dhivya Bharathi

Computer Science  and Engineering Graduate  
Interested in Backend Development, Databases.
