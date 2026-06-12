// =======================
// INTERFACES
// =======================

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// =======================
// PARENT CLASS
// =======================

class Animal {

    // Method available to all child classes
    void eat() {
        System.out.println("Animal is eating");
    }
}

// =======================
// SINGLE INHERITANCE
// Dog inherits Animal
// =======================

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// =======================
// MULTILEVEL INHERITANCE
// Puppy inherits Dog
// Dog inherits Animal
// =======================

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// =======================
// HIERARCHICAL INHERITANCE
// Cat also inherits Animal
// =======================

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

// =======================
// MULTIPLE INHERITANCE
// Java does not support:
//
// class Duck extends Flyable, Swimmable
//
// Instead we use interfaces.
// =======================

class Duck extends Animal implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

// =======================
// HYBRID INHERITANCE
// Combination of Class + Interface inheritance
// =======================

class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {

    void hunt() {
        System.out.println("Eagle is hunting");
    }
}

// =======================
// MAIN CLASS
// =======================

public class A15_inheritance {

    public static void main(String[] args) {

        // ====================================
        // SINGLE INHERITANCE
        // ====================================
        System.out.println("=== Single Inheritance ===");

        Dog dog = new Dog();

        dog.eat();   // inherited from Animal
        dog.bark();  // Dog's own method

        // ====================================
        // MULTILEVEL INHERITANCE
        // ====================================
        System.out.println("\n=== Multilevel Inheritance ===");

        Puppy puppy = new Puppy();

        puppy.eat();   // Animal
        puppy.bark();  // Dog
        puppy.weep();  // Puppy

        // ====================================
        // HIERARCHICAL INHERITANCE
        // ====================================
        System.out.println("\n=== Hierarchical Inheritance ===");

        Cat cat = new Cat();

        cat.eat();   // inherited from Animal
        cat.meow();  // Cat's own method

        // ====================================
        // MULTIPLE INHERITANCE USING INTERFACES
        // ====================================
        System.out.println("\n=== Multiple Inheritance (Interfaces) ===");

        Duck duck = new Duck();

        duck.eat();   // Animal
        duck.fly();   // Flyable
        duck.swim();  // Swimmable

        // ====================================
        // HYBRID INHERITANCE
        // ====================================
        System.out.println("\n=== Hybrid Inheritance ===");

        Eagle eagle = new Eagle();

        eagle.eat();   // Animal
        eagle.fly();   // Bird implements Flyable
        eagle.hunt();  // Eagle's own method
    }
}