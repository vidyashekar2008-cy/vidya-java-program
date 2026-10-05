class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void fetch() {
        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Dog()
        };

        for (Animal a : animals) {

            if (a instanceof Dog) {
                Dog d = (Dog) a;   // Downcasting
                d.fetch();
            }
        }
    }
}