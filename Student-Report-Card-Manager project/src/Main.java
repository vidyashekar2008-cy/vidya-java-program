import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== REPORT CARD MANAGER =====");
            System.out.println("1.Add");
            System.out.println("2.View All");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Topper");
            System.out.println("7.Rank List");
            System.out.println("8.Grade Summary");
            System.out.println("9.Subject Toppers");
            System.out.println("0.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    manager.printAll();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    showTopper();
                    break;

                case 7:
                    showRankList();
                    break;

                case 8:
                    manager.gradeSummary();
                    break;

                case 9:
                    manager.subjectToppers();
                    break;

                case 0:
                    System.out.println("Exiting Report Card Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    static void addStudent() {

        System.out.print("Roll No : ");
        int roll = sc.nextInt();

        if (manager.findByRoll(roll) != null) {
            System.out.println(
                    "Duplicate roll number! Student already exists."
            );
            return;
        }

        sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        int[] marks = new int[5];

        System.out.print("Marks (5 subjects): ");

        for (int i = 0; i < 5; i++) {

            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println(
                        "Marks must be between 0 and 100."
                );
                return;
            }
        }

        Student s = new Student(roll, name, marks);

        manager.add(s);

        System.out.println("Student added successfully!");
    }

    static void searchStudent() {

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Student s = manager.findByRoll(roll);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("\n===== REPORT CARD =====");

        System.out.println("Roll No     : " + s.getRollNo());
        System.out.println("Name        : " + s.getName());

        for (int i = 0; i < 5; i++) {

            System.out.println(
                    "Subject " + (i + 1) +
                    " : " + s.getMarks()[i]
            );
        }

        System.out.println("Total       : " + s.getTotal());

        System.out.printf(
                "Percentage  : %.2f%%%n",
                s.getPercentage()
        );

        System.out.println("Grade       : " + s.getGrade());

        System.out.println(
                "Result      : " +
                (s.isPass() ? "PASS" : "FAIL")
        );
    }

    static void updateStudent() {

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Student s = manager.findByRoll(roll);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter subject number (1-5): ");
        int subject = sc.nextInt();

        if (subject < 1 || subject > 5) {
            System.out.println("Invalid subject.");
            return;
        }

        System.out.print("Enter new marks: ");
        int mark = sc.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println(
                    "Marks must be between 0 and 100."
            );
            return;
        }

        s.setMark(subject - 1, mark);

        System.out.println("Marks updated successfully!");
    }

    static void deleteStudent() {

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        if (manager.delete(roll)) {
            System.out.println(
                    "Student deleted successfully!"
            );
        } else {
            System.out.println("Student not found.");
        }
    }

    static void showTopper() {

        Student topper = manager.getTopper();

        if (topper == null) {
            System.out.println("No students available.");
            return;
        }

        System.out.printf(
                "Topper: %s (Roll %d) with %.2f%%%n",
                topper.getName(),
                topper.getRollNo(),
                topper.getPercentage()
        );
    }

    static void showRankList() {

        ArrayList<Student> sorted =
                manager.sortByPercent();

        System.out.println("\n===== RANK LIST =====");

        int rank = 1;

        for (Student s : sorted) {

            System.out.printf(
                    "%d. %s (Roll %d) - %.2f%%%n",
                    rank,
                    s.getName(),
                    s.getRollNo(),
                    s.getPercentage()
            );

            rank++;
        }
    }
}