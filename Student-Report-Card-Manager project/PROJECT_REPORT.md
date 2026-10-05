# STUDENT REPORT CARD MANAGER

## 1. Introduction

Student Report Card Manager is a console-based Java application developed to simplify the management of student marks and report cards.

The application allows the user to add, view, search, update and delete student records.

It automatically calculates total marks, percentage, grade and result.

## 2. Problem Statement

Teachers need to maintain student marks and calculate totals, percentages, grades and ranks.

Manual calculation takes time and may cause errors.

Therefore, a simple computerized system is required to manage student records efficiently.

## 3. Objectives

- Store student details.
- Store marks of five subjects.
- Calculate total marks.
- Calculate percentage.
- Assign grades automatically.
- Determine PASS or FAIL.
- Find the class topper.
- Generate a rank list.
- Display grade summary.
- Find subject toppers.

## 4. Technologies Used

- Programming Language: Java
- Programming Concept: Object-Oriented Programming
- Data Structures: Array and ArrayList
- Input: Scanner
- IDE: Eclipse / IntelliJ IDEA

## 5. Classes Used

### Student

Stores:

- Roll number
- Name
- Marks

It calculates:

- Total
- Percentage
- Grade
- Result

### StudentManager

Manages multiple student records.

It performs:

- Add
- Search
- View
- Delete
- Topper
- Rank list
- Grade summary
- Subject toppers

### Main

Contains the menu-driven program and accepts user input using Scanner.

## 6. OOP Concepts

### Class

Student, StudentManager and Main are classes used to organize the program.

### Object

Each student is represented using a Student object.

### Encapsulation

Student data members are declared private and accessed using methods.

### Constructor

The Student constructor initializes the student's roll number, name and marks.

### Methods

Methods perform operations such as calculating total, percentage, grade and result.

## 7. Features

### Add Student

Adds a student after validating roll number, name and marks.

### View All

Displays all student records in a formatted table.

### Search

Searches for a student using the roll number.

### Update

Updates marks of a selected subject.

### Delete

Deletes a student using the roll number.

### Topper

Finds the student with the highest percentage.

### Rank List

Displays students in descending order of percentage.

### Grade Summary

Displays the number of students in each grade.

### Subject Toppers

Finds the student with the highest mark in each subject.

## 8. Grade Calculation

- A: 90% and above
- B: 75% to 89%
- C: 60% to 74%
- D: 40% to 59%
- F: Below 40%

## 9. Result Calculation

A student is marked PASS only when all five subject marks are 35 or above.

If any subject mark is below 35, the result is FAIL.

## 10. Sample Input

Roll No: 101

Name: Asha

Marks: 88 92 79 95 85

## 11. Sample Output

```text
===== REPORT CARD MANAGER =====
1.Add
2.View All
3.Search
4.Update
5.Delete
6.Topper
7.Rank List
8.Grade Summary
9.Subject Toppers
0.Exit

Roll     Name         Total  %        Grade  Result
101      Asha         439    87.80    B      PASS