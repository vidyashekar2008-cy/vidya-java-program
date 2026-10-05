class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    // Getter method
    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public double getTotalPay() {
        return getSalary() + bonus;   // Using getter, not salary field
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager(50000, 10000);

        System.out.println("Salary: " + m.getSalary());
        System.out.println("Bonus: " + 10000);
        System.out.println("Total Pay: " + m.getTotalPay());
    }
}