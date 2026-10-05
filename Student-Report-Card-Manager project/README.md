# Student Report Card Manager

## Project Description

Student Report Card Manager is a Java console application used to manage student marks and report cards.

The application stores marks for five subjects and automatically calculates total marks, percentage, grade and result.

## Features

1. Add student
2. View all students
3. Search student by roll number
4. Update subject marks
5. Delete student
6. Find class topper
7. Generate rank list
8. Display grade summary
9. Find subject toppers
10. Exit

## Concepts Used

- Java
- Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Arrays
- ArrayList
- Scanner
- String Formatting
- Bubble Sort

## Data Structures

### int[]

An integer array stores marks of five subjects for each student.

### ArrayList

ArrayList stores multiple Student objects.

## Grade System

| Percentage | Grade |
|---|---|
| 90 and above | A |
| 75–89 | B |
| 60–74 | C |
| 40–59 | D |
| Below 40 | F |

## Result Rule

A student passes only when every subject mark is at least 35.

## Validation

- Roll numbers must be unique.
- Marks must be between 0 and 100.
- Student name cannot be empty.
- Invalid menu choices are handled.
- Unknown roll numbers show "Student not found".

## How to Run

1. Open the Java project in Eclipse or IntelliJ IDEA.
2. Add the three Java files from the `src` folder.
3. Compile the program.
4. Run `Main.java`.
5. Select options from the menu.

## Project Structure

```text
Student-Report-Card-Manager
└── src
    ├── Main.java
    ├── Student.java
    └── StudentManager.java