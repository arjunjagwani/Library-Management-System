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

MySQL Database

Build Tool

Maven

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

