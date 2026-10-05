class Vehicle {
    String brand;

    void start() {
        System.out.println(brand + " is starting");
    }
}

public class Car extends Vehicle {
    int seats;

    void openSunroof() {
        System.out.println("Sunroof opened");
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";
        c.seats = 5;

        System.out.println("Brand : " + c.brand);
        System.out.println("Seats : " + c.seats);

        c.start();
        c.openSunroof();
    }
}