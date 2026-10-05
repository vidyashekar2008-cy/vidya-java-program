public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle(7);

        System.out.printf("Area = %.2f%n", c.area());
        System.out.printf("Circumference = %.2f%n", c.circumference());
    }
}