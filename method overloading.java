class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two integers: " + c.add(10, 20));
        System.out.println("Sum of two doubles: " + c.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + c.add(10, 20, 30));
    }
}