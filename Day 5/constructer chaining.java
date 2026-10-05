class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }
}

public class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {

        Dog d = new Dog("Tommy", "Labrador");
    }
}