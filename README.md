Student Management System (Java, OOP, File Handling)

A simple and lightweight console-based Student & Course Management System built using Java, applying Object-Oriented Programming (OOP) principles, with persistent storage implemented using text files.

This project is perfect for beginners who want to understand OOP, CRUD operations, file handling, and clean project architecture.

🚀 Features

Add, view, update, and delete students

Add, view, update, and delete courses

Persistent storage using .txt files (no database required)

Clean OOP structure

Basic role-based access style separation (services, models, utilities)

Modular and easy to extend

🛠 Tech Stack

Java 17+

OOP Principles

File Handling (BufferedReader, FileWriter, etc.)

Console-based UI

📁 Project Structure
StudentManagementSystem/
├── src/
│   ├── Main.java
│   ├── models/
│   │     ├── Student.java
│   │     └── Course.java
│   ├── services/
│   │     ├── StudentService.java
│   │     └── CourseService.java
│   └── utils/
│         └── FileHandler.java
│
└── data/
      ├── students.txt
      └── courses.txt

▶️ How to Run the Project
1. Compile the code

Open terminal inside project folder:

cd src
javac Main.java

2. Run the project
java Main

📌 File Storage

All data is saved in:

data/students.txt
data/courses.txt


If the folder does not exist, the program automatically creates it.

📚 Concepts Used

Encapsulation

Abstraction

Service Layer Architecture

File Handling

Modular Java Project Design

🌱 Future Improvements

Add Admin/Student login system

Move storage to JSON or CSV

GUI using JavaFX or Swing

Add search and filtering features

🤝 Contributions

Pull requests are welcome!
Feel free to fork the repo and improve it.
