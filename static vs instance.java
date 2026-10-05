class Rectangle {

    int length;
    int width;

    // Instance method
    int area() {
        return length * width;
    }

    // Static method
    static boolean isSquare(int l, int w) {
        return l == w;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create object
        Rectangle r = new Rectangle();

        // Set fields
        r.length = 10;
        r.width = 5;

        // Call instance method using object
        System.out.println("Area = " + r.area());

        // Call static method using class name
        System.out.println("Is square? " + Rectangle.isSquare(10, 5));
    }
}