public class A8_class {
    // Class - a blueprint for creating objects
    // Object - an instance of a class

    // Define a class named Car
    static class Car {
        String brand;
        String model;
        int year;

        // Constructor to initialize the Car object
        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Method to display car information
        void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Call the method to display car information
        myCar.displayInfo();

        myCar.brand = "BMW";
        myCar.model = "X5";
        myCar.year = 2021;
        myCar.displayInfo();
    }

}
