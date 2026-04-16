# Library Membership System

## 👩‍💻 Student

Sabirova Zharkynai

## 📌 Project Description

Library Membership System is a console-based Java application that manages library members.
It allows users to register, update, delete, renew, and cancel memberships.

The system uses Object-Oriented Programming principles and stores data in files for persistence.

---

## 🎯 Objectives

* Implement CRUD operations
* Apply OOP principles (Encapsulation, Inheritance, Polymorphism)
* Store and retrieve data from files
* Validate user input
* Provide a simple CLI interface

---

## ✅ Project Requirements

1. Register new member
2. View all members
3. Search member by ID
4. Update member
5. Delete member
6. Renew membership
7. Cancel membership
8. Save data to file
9. Load data from file
10. Input validation

---

## 🧠 OOP Concepts Used

### Encapsulation

* Private fields in Member class
* Getters and setters

### Inheritance

* PremiumMember extends Member

### Polymorphism

* getMembershipDetails() method overridden

---

## 🗂 Project Structure

* models → Member, PremiumMember
* services → MemberService
* utils → FileHandler, Validator
* data → members.txt
* Main.java

---

## 💾 Data Storage

Data is stored in a text file (members.txt) and loaded when the program starts.

---

## ⚠️ Validation

* Email must contain "@" and "."
* Name cannot be empty

---

## 🧪 Test Cases

### Example 1:

Input:
Name: John
Email: [john@gmail.com](mailto:john@gmail.com)

Output:
Member added successfully

---

### Example 2:

Invalid email:
Output:
Invalid email format

---

## 📸 Screenshots

(Add screenshots here with date & time visible)

---

## 🔗 Presentation Link

(https://canva.link/pgtgvcywuhce52f)
