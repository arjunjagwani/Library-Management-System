📚 Library Management System

Library Management System is a web-based application that enables users to efficiently manage books in a library. It provides functionalities for adding, updating, searching, and deleting books, as well as viewing all available books. The system is built using Spring Boot for the backend and Thymeleaf with Bootstrap for the frontend.

🎯 Features

✅ Add New Books – Insert books into the system with essential details.✅ Update Book Details – Modify book information (title, author, genre, availability).✅ Search Books – Find books by ID or title using a search bar.✅ Delete Books – Remove books from the system when they are no longer available.✅ View All Books – List all books stored in the library system.✅ Exit Application – Close the browser and stop the application.

🛠️ Technologies Used

Component

Technology Used

Frontend

HTML, CSS, Bootstrap, Thymeleaf

Backend

Java, Spring Boot (MVC, REST API)

Database

H2 Database (In-memory DB)

Build Tool

Maven

🚀 Installation & Setup

1️⃣ Clone the Repository

git clone https://github.com/arjunjagwani/Library-Management-System.git
cd Library-Management-System

2️⃣ Build the Project

Use the Maven Wrapper to build the project:

./mvnw clean install   # For macOS/Linux
mvnw.cmd clean install  # For Windows

3️⃣ Run the Application

./mvnw spring-boot:run   # For macOS/Linux
mvnw.cmd spring-boot:run  # For Windows

4️⃣ Access the Web App

Open your browser and go to:

http://localhost:8080

🎮 Usage Guide

📌 1. Add a New Book

Click "Add Book"

Fill in the book details

Click Submit

🔍 2. Search for a Book

Enter Book ID or Title

Click Search to find the book

✏ 3. Update a Book

Click "Update" next to a book

Modify the details

Click Save Changes

❌ 4. Delete a Book

Click "Delete" next to a book

Confirm the deletion

📖 5. View All Books

Click "View All Books"

❎ 6. Exit the Application

Click "Exit Application"

This will close the browser and stop the backend

📂 Project Structure

Library-Management-System/
│── src/
│   ├── main/
│   │   ├── java/com/library/
│   │   │   ├── controller/        # BookController.java
│   │   │   ├── model/             # Book.java (Entity)
│   │   │   ├── repository/        # BookRepository.java
│   │   ├── resources/
│   │   │   ├── templates/         # HTML (Thymeleaf)
│   │   │   ├── static/css/        # Styling
│   ├── test/                      # Unit tests
│── pom.xml                        # Maven dependencies
│── mvnw, mvnw.cmd                 # Maven Wrapper
│── README.md                      # Project Documentation

🏗️ Future Enhancements

🔹 User Authentication – Implement login/logout functionality for admin access.🔹 Book Borrowing System – Allow users to borrow and return books.🔹 PDF Reports – Generate reports of books in the system.

👥 Contributing

💡 Want to improve this project?

Fork this repository

Create a feature branch

Commit your changes

Submit a pull request

We welcome contributions! 🚀
