public class Student {

    private int rollNo;
    private String name;
    private int[] marks;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMark(int subject, int mark) {
        marks[subject] = mark;
    }

    public int getTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double getPercentage() {
        return getTotal() / 5.0;
    }

    public String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 90)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";
        else
            return "F";
    }

    public boolean isPass() {
        for (int mark : marks) {
            if (mark < 35) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "%-8d %-12s %-6d %-8.2f %-6s %-6s",
                rollNo,
                name,
                getTotal(),
                getPercentage(),
                getGrade(),
                isPass() ? "PASS" : "FAIL"
        );
    }
}