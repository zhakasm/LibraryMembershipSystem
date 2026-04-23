# Library Membership System

## 👩‍💻 Student

Sabyrova Zharkynai

## 📌 Project Description

Library Membership System is a console-based Java application designed to manage library members efficiently.
The system allows users to:
register new members
view all members
update member information
delete members
renew memberships
cancel memberships
export data to CSV files
All data is stored in files, ensuring persistence between program runs.

---

## 🎯 Objectives

* Implement CRUD operations
* Apply OOP principles (Encapsulation, Inheritance, Polymorphism)
* Store and retrieve data from files
* Validate user input
* Provide a simple CLI interface

---

## ✅ Project Requirements

1. Create (register member)
2. Read (view members)
3. Update member
4. Delete member
5. Renew membership
6. Cancel membership
7. Data persistence using file storage
8. Input validation
9. Modular code structure
10. Export data to CSVSearch member by ID

---

## 🧠 OOP Principles

### 🔹 Encapsulation

* All fields in classes are private
* Access controlled using getters and setters

### 🔹 Inheritance

* `PremiumMember` class extends `Member`

### 🔹 Polymorphism

* Method `getMembershipDetails()` is overridden in child class

---

## 🏗 Project Structure

```
models/
 ├── Member.java
 ├── PremiumMember.java

services/
 ├── MemberService.java

utils/
 ├── FileHandler.java
 ├── Validator.java

data/
 ├── members.txt
 ├── members.csv

Main.java
README.md
```

---

## 💾 Data Storage

* Data is stored in `members.txt`
* Automatically loaded when the program starts
* Automatically saved when exiting

---

## 📤 CSV Export

The system allows exporting all members to a CSV file (`members.csv`), which can be opened in Excel.

---

## ⚠️ Input Validation

* Name cannot be empty
* Email must contain "@" and "."

---

## 🧪 Test Cases

### ✔ Valid Input

Input:
Name: John
Email: [john@gmail.com](mailto:john@gmail.com)

Output:
Member added successfully

---

### ❌ Invalid Email

Input:
Email: johnmail

Output:
Invalid email format

---

### ✔ Delete Member

Input:
ID: 1

Output:
Member deleted

---
## 📸 Screenshots

(https://drive.google.com/drive/folders/1RUQ7x5hvlO6Gzwm5eO9n-OAlIogxCwjs?usp=sharing)

---

## 🔗 Presentation Link

(https://canva.link/pgtgvcywuhce52f)

---

## 🚀 Conclusion

This project successfully demonstrates the use of Java, OOP principles, file handling, and user input validation to build a functional real-world system.
