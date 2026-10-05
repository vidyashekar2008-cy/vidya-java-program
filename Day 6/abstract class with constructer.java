abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePay();

    void printSlip() {
        System.out.println("Employee : " + name);
        System.out.println("Pay : " + calculatePay());
    }
}

class FullTime extends Employee {
    double monthlySalary;

    FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculatePay() {
        return monthlySalary;
    }
}

class PartTime extends Employee {
    double hours;
    double rate;

    PartTime(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculatePay() {
        return hours * rate;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        FullTime f = new FullTime("Ravi", 30000);
        PartTime p = new PartTime("Anu", 40, 200);

        f.printSlip();
        System.out.println();

        p.printSlip();
    }
}