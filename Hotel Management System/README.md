Hotel Management System
Overview
The Hotel Management System is a Java-based application designed to assist in managing hotel operations such as guest check-in, check-out, reservations, and room availability. This system uses Java Swing for the graphical user interface (GUI), JDBC for database interaction, and MySQL as the relational database management system (RDBMS) for storing data.

Features
Guest Registration: Add new guests to the system with personal information.
Room Booking: Book rooms for guests by selecting available rooms.
Room Availability: Check available rooms for booking.
Billing: Generate bills and manage payments.
Check-In/Check-Out: Register guest check-in and check-out details.
View Reports: Generate reports of bookings, check-ins, and check-outs.
Technologies Used
Java Swing: For creating the graphical user interface.
JDBC (Java Database Connectivity): For connecting Java with MySQL database.
MySQL: Database management system for storing hotel data.
NetBeans/IntelliJ IDEA: (Optional) IDE used for development.
Prerequisites
Before running the project, ensure you have the following installed:

Java Development Kit (JDK) – Version 8 or above.
MySQL Database – For storing the hotel data.
JDBC Driver – Required for connecting Java to MySQL.
IDE (Optional) – Such as IntelliJ IDEA or NetBeans.
Setup Instructions
Clone the Repository:

bash
Copy code
git clone <repository_url>
Setup MySQL Database:

Create a new MySQL database and configure the tables using the provided SQL scripts.
Example script (database.sql):
sql
Copy code
CREATE DATABASE hotel_management;
USE hotel_management;

CREATE TABLE rooms (
    room_id INT PRIMARY KEY AUTO_INCREMENT,
    room_type VARCHAR(50),
    status VARCHAR(20)
);

CREATE TABLE guests (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    address TEXT,
    contact_number VARCHAR(20)
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    room_id INT,
    check_in_date DATE,
    check_out_date DATE,
    FOREIGN KEY (guest_id) REFERENCES guests(guest_id),
    FOREIGN KEY (room_id) REFERENCES rooms(room_id)
);
Configure Database Connection:

Update the database connection details (db_config.properties or directly in the code):
properties
Copy code
db.url=jdbc:mysql://localhost:3306/hotel_management
db.username=root
db.password="Nischay@123"
Run the Project:

Open the project in your preferred IDE (NetBeans, IntelliJ, etc.).
Run the project as a Java application.
How to Use
Launch the Application:

Open the GUI and start interacting with the hotel management system.
Add Guests:

Use the "Add Guest" form to register a new guest.
Book Rooms:

Check room availability and book a room for guests.
Check-In/Check-Out:

Manage guest check-ins and check-outs through the relevant forms.
Generate Bills:

Generate a bill for guests during check-out.


Contributing
Feel free to fork the repository, make changes, and submit pull requests. Contributions and suggestions are always welcome.