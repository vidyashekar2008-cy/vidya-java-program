class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat says meow");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Dog()
        };

        for (Animal a : animals) {

            a.sound();

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            }
        }
    }
}