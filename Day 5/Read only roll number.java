public class Student {
    private final int rollNo;
    private String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Ravi");

        System.out.println("Roll No : " + s.getRollNo());
        System.out.println("Name : " + s.getName());

        s.setName("Kiran");

        System.out.println("Updated Name : " + s.getName());
    }
}