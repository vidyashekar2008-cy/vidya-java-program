import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> list;

    public StudentManager() {
        list = new ArrayList<>();
    }

    public boolean add(Student s) {

        if (findByRoll(s.getRollNo()) != null) {
            return false;
        }

        list.add(s);
        return true;
    }

    public Student findByRoll(int rollNo) {

        for (Student s : list) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }

        return null;
    }

    public void printAll() {

        if (list.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.printf(
                "%-8s %-12s %-6s %-8s %-6s %-6s%n",
                "Roll", "Name", "Total", "%", "Grade", "Result"
        );

        for (Student s : list) {
            System.out.println(s);
        }
    }

    public boolean delete(int rollNo) {

        Student s = findByRoll(rollNo);

        if (s != null) {
            list.remove(s);
            return true;
        }

        return false;
    }

    public Student getTopper() {

        if (list.isEmpty()) {
            return null;
        }

        Student topper = list.get(0);

        for (Student s : list) {

            if (s.getPercentage() > topper.getPercentage()) {
                topper = s;
            }
        }

        return topper;
    }

    public ArrayList<Student> sortByPercent() {

        ArrayList<Student> sorted = new ArrayList<>(list);

        for (int i = 0; i < sorted.size() - 1; i++) {

            for (int j = 0; j < sorted.size() - i - 1; j++) {

                if (sorted.get(j).getPercentage()
                        < sorted.get(j + 1).getPercentage()) {

                    Student temp = sorted.get(j);

                    sorted.set(j, sorted.get(j + 1));

                    sorted.set(j + 1, temp);
                }
            }
        }

        return sorted;
    }

    public void gradeSummary() {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (Student s : list) {

            switch (s.getGrade()) {

                case "A":
                    a++;
                    break;

                case "B":
                    b++;
                    break;

                case "C":
                    c++;
                    break;

                case "D":
                    d++;
                    break;

                case "F":
                    f++;
                    break;
            }
        }

        System.out.println("\n===== GRADE SUMMARY =====");
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("F : " + f);
    }

    public void subjectToppers() {

        if (list.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n===== SUBJECT TOPPERS =====");

        for (int subject = 0; subject < 5; subject++) {

            Student topper = list.get(0);

            for (Student s : list) {

                if (s.getMarks()[subject]
                        > topper.getMarks()[subject]) {

                    topper = s;
                }
            }

            System.out.println(
                    "Subject " + (subject + 1) +
                    " : " + topper.getName() +
                    " (" + topper.getMarks()[subject] + ")"
            );
        }
    }
}