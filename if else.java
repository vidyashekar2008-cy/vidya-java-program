import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println(marks + " → Grade A");
        }
        else if (marks >= 75) {
            System.out.println(marks + " → Grade B");
        }
        else if (marks >= 50) {
            System.out.println(marks + " → Grade C");
        }
        else {
            System.out.println(marks + " → Grade F");
        }

        sc.close();
    }
}