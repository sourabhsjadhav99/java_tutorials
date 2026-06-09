
// Defining a class named Car
class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;
    // static variable shared by all Car instances
    static int numberOfCars = 0;

    // Constructor to initialize the attributes
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    int counter() {
        // increment count when a new Car is created
        numberOfCars++;
        return numberOfCars;
    }

    // Method to simulate starting the engine
    void startEngine() {
        System.out.println("The " + make + " " + model + " engine has started.");
    }

    // nested class example
    class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }

        void displayEngineType() {
            System.out.println("Engine Type: " + type);
        }
    }

    void nestedClassExample() {
        Engine myEngine = new Engine("V6");
        myEngine.displayEngineType();
    }

    // static nested class example
    static class StaticNestedClass {
        void displayMessage() {
            System.out.println("This is a static nested class.");
        }
    }
}

public class A14_oops {

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        Car myCar2 = new Car("Honda", "Civic", 2021);

        // Accessing the attributes of the Car object
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);

        // Calling a method of the Car object
        myCar.startEngine();

        // static variable example - use one memory location for all objects
        System.out.println("Number of Cars: " + Car.numberOfCars); // Accessing static variable directly through the
                                                                   // class name
        // numberOfCars is declared in the Car class
        System.out.println("Number of Cars1: " + myCar.counter());

        System.out.println("Number of Cars2: " + myCar2.counter());

        // nested class example
        myCar.nestedClassExample();

        // static nested class example
        Car.StaticNestedClass staticNestedClass = new Car.StaticNestedClass();
        staticNestedClass.displayMessage();

    }

}
