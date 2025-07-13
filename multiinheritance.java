class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Mammal extends Animal {
    boolean hasFur;

    Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }

    void showFur() {
        if (hasFur) {
            System.out.println(name + " has fur.");
        } else {
            System.out.println(name + " does not have fur.");
        }
    }
}

class Dog extends Mammal {
    String breed;

    Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    void showinfo() {
        System.out.println("Dog Info: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Has Fur: " + hasFur);
    }
}

// Main class for entry point
public class multiinheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, true, "Golden Retriever");
        dog.showinfo();
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.showFur();
        dog.bark();
        dog.fetch();

        System.out.println();

        Animal[] animals = { dog };
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}