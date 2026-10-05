interface Vehicle {

    void wheels();

    default void honk() {
        System.out.println("Vehicle honks");
    }

    static void info() {
        System.out.println("Vehicles are used for transportation");
    }
}

class Car implements Vehicle {

    public void wheels() {
        System.out.println("Car has 4 wheels");
    }

    @Override
    public void honk() {
        System.out.println("Car horn sounds");
    }
}

class Bike implements Vehicle {

    public void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.wheels();
        c.honk();

        Bike b = new Bike();
        b.wheels();
        b.honk();

        Vehicle.info();
    }
}