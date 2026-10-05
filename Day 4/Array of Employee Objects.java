public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new Employee("Ravi", 30000);
        employees[1] = new Employee("Anu", 45000);
        employees[2] = new Employee("Kiran", 35000);
        employees[3] = new Employee("Vidya", 50000);

        Employee highest = employees[0];
        double total = 0;

        for (Employee e : employees) {
            total = total + e.salary;

            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        double average = total / employees.length;

        System.out.println("Highest-paid employee : " 
                           + highest.name);
        System.out.println("Salary : " + highest.salary);
        System.out.println("Average salary : " + average);
    }
}