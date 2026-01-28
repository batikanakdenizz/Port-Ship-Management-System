# Port & Ship Management System

### ⚓ A Comprehensive Maritime Operations & Logistics Solution

**Port & Ship Management System** is a robust, enterprise-grade desktop application designed to digitize and automate the complex workflow of port authorities, shipping lines, and logistics companies. Developed using **Java** and **MySQL**, this system adheres to Object-Oriented Programming (OOP) principles to ensure modularity, scalability, and data integrity.

This project serves as a full-stack desktop solution, integrating a **Java Swing** graphical user interface (GUI) with a relational **MySQL database** backend to handle high-volume operational data.

---

## 🛠️ Technical Specifications

This system is built on a solid foundation of industry-standard technologies:

### Core Technologies
* **Programming Language:** Java (JDK 21) - Utilized for core logic and backend processing.
* **GUI Framework:** Java Swing - Provides a responsive and user-friendly desktop interface.
* **Database Engine:** MySQL 8.0 - Relational database management system (RDBMS) for persistent data storage.
* **Database Connectivity:** JDBC (Java Database Connectivity) - Implements secure and efficient communication between the Java application and MySQL.

### Development Tools
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub
* **Design Pattern:** Layered Architecture (separation of GUI, Logic, and Data Access).

---

## 🚀 Key Modules & Capabilities

The application is architected into distinct functional modules, each handling a specific aspect of port administration:

### 1. Maritime Operations
* **Ship Management:** Comprehensive registry for vessels, tracking specifications (IMO number, capacity, type) and real-time status.
* **Voyage Planning:** Scheduling and monitoring of ship arrivals, departures, and transit routes.

### 2. Infrastructure Management
* **Port Authority:** Configuration of port parameters and operational capacity.
* **Dock & Berth Allocation:** Dynamic management of docking slots to optimize turnover and prevent congestion.

### 3. Human Resources (HR)
* **Captain & Crew:** Assignment of personnel to vessels, managing certifications and rosters.
* **Ground Staff:** Management of port operators, security, and administrative staff.

### 4. Logistics & Supply Chain
* **Cargo Handling:** Tracking of freight manifests, loading/unloading operations, and storage requirements.
* **Product & Inventory:** Detailed inventory management for goods passing through the port.
* **Corporate Relations:** Database of partner companies, suppliers, and logistics clients.

### 5. Compliance & Analytics
* **Inspection & Audits:** Recording safety inspections and compliance checks for vessels and facilities.
* **Reporting Dashboard:** Generation of operational reports to aid in strategic decision-making.

### 6. Security
* **Authentication:** Secure login gateway ensuring authorized access to sensitive operational data.

---

## 💾 Database Schema

The system relies on a structured relational database. The schema includes tables for `Ships`, `Ports`, `Personnel`, `Cargo`, and `Logs`, linked via foreign keys to maintain referential integrity.
* **Source File:** `PortShipManagement.sql`

---

## ⚙️ Installation & Setup Guide

Follow these steps to deploy the application in a local development environment:

### Prerequisites
* Java Development Kit (JDK) 21 or higher.
* MySQL Server.
* IntelliJ IDEA (or Eclipse/NetBeans).

### Step 1: Database Configuration
1.  Open your MySQL management tool (e.g., MySQL Workbench).
2.  Create a new schema or use the provided script to initialize the database:
    * **File:** `PortShipManagement.sql`
3.  *Note:* Ensure the database name matches the connection string in the Java code.

### Step 2: Application Configuration
1.  Clone the repository:
    ```bash
    git clone [https://github.com/YourUsername/PortShipManagement.git](https://github.com/YourUsername/PortShipManagement.git)
    ```
2.  Open the project in your IDE.
3.  Navigate to `src/DatabaseConnector.java` and update the credentials to match your local MySQL instance:
    ```java
    private static final String URL = "jdbc:mysql://localhost:3306/portshipsecure";
    private static final String USER = "your_username"; // e.g., root
    private static final String PASSWORD = "your_password";
    ```

### Step 3: Execution
1.  Locate the `Main.java` file in the `src` directory.
2.  Run the `main` method to launch the application.
3.  Log in via the dashboard.

---

## 🔮 Future Roadmap

* **Microservices Migration:** Refactoring backend logic into Spring Boot REST APIs.
* **Containerization:** Docker support for easy deployment.
* **Cloud Integration:** Migration of the database to AWS RDS.

---
*© 2026 Port & Ship Management System. All rights reserved.*
