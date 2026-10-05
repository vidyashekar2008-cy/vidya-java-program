class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

public class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public static void main(String[] args) {

        Manager m = new Manager("Ravi", 60000, 10);

        System.out.println("Name : " + m.name);
        System.out.println("Salary : " + m.salary);
        System.out.println("Team Size : " + m.teamSize);
    }
}