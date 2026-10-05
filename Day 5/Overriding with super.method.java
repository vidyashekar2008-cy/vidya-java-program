class Shape {

    void describe() {
        System.out.println("This is a shape");
    }
}

public class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void describe() {
        super.describe();
        System.out.println("This is a square");
        System.out.println("Side = " + side);
    }

    public static void main(String[] args) {

        Square s = new Square(5);
        s.describe();
    }
}