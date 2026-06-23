// =========================
// ABSTRACTION
// =========================


// Abstract class - cannot be instantiated, can have abstract methods
abstract class Vehicle {


    // Abstract method - must be implemented by subclasses
    abstract void start();


    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}


// =========================
// ENCAPSULATION
// =========================


class Car extends Vehicle {


    // Private variables
    private String brand;
    private int speed;


    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    // =========================
    // GETTER
    // =========================


    public String getBrand() {
        return brand;
    }


    public int getSpeed() {
        return speed;
    }


    // =========================
    // SETTER
    // =========================


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setSpeed(int speed) {


        // Validation example
        if (speed >= 0) {
            this.speed = speed;
        }
    }


    // =========================
    // METHOD OVERRIDING
    // =========================


    @Override
    void start() {
        System.out.println(brand + " car started");
    }


    // =========================
    // METHOD OVERLOADING
    // Same method name
    // Different parameters
    // =========================


    void drive() {
        System.out.println("Driving normally");
    }


    void drive(int speed) {
        System.out.println("Driving at " + speed + " km/h");
    }


    void drive(String mode) {
        System.out.println("Driving in " + mode + " mode");
    }


    // =========================
    // STATIC METHOD
    // Belongs to class
    // =========================


    static void companyInfo() {
        System.out.println("Car Company Information");
    }
}


// =========================
// ANOTHER CHILD CLASS
// =========================


class Bike extends Vehicle {


    @Override
    void start() {
        System.out.println("Bike started");
    }
}


// =========================
// MAIN CLASS
// =========================


public class A14_oops {


    public static void main(String[] args) {


        // ==================================
        // ENCAPSULATION + GETTER + SETTER
        // ==================================


        Car car = new Car("Toyota", 100);


        System.out.println("Brand: " + car.getBrand());
        System.out.println("Speed: " + car.getSpeed());


        car.setBrand("Honda");
        car.setSpeed(120);


        System.out.println("Updated Brand: " + car.getBrand());
        System.out.println("Updated Speed: " + car.getSpeed());


        // ==================================
        // ABSTRACTION
        // ==================================


        car.start(); // Abstract method implementation
        car.stop(); // Concrete method


        // ==================================
        // METHOD OVERLOADING
        // ==================================


        car.drive();
        car.drive(80);
        car.drive("Sport");


        // ==================================
        // STATIC METHOD
        // ==================================


        Car.companyInfo();


        // ==================================
        // Runtime Polymorphism
        // DYNAMIC METHOD DISPATCH - parent's class reference, child class object
        // ==================================


        Vehicle v1 = new Car("BMW", 150);
        Vehicle v2 = new Bike();


        v1.start(); // Calls Car's start()
        v2.start(); // Calls Bike's start()
    }
}

