class Fraction {
    int numerator;
    int denominator;

    // Constructor
    Fraction(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // Method to find GCD
    int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to add two fractions
    Fraction add(Fraction f) {
        int num = this.numerator * f.denominator
                + f.numerator * this.denominator;

        int den = this.denominator * f.denominator;

        return new Fraction(num, den);
    }

    // Display fraction
    void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(3, 6);

        System.out.print("First Fraction: ");
        f1.display();

        System.out.print("Second Fraction: ");
        f2.display();

        Fraction result = f1.add(f2);

        System.out.print("Sum: ");
        result.display();
    }
}