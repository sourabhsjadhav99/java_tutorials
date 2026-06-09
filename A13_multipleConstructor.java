class Cars {
    String brand;
    String model;
    int year;

    // Default constructor
    Cars() {
        brand = "Toyota";
        model = "Corolla";
        year = 2020;
    }

    // Parameterized constructor
    Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2020;
    }

    // Constructor chaining using this()
    Cars(String brand, String model, int year) {
        this(brand, model); // must be first statement
        this.year = year;
    }

    // Method using this keyword
    void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println();
    }
}

public class A13_multipleConstructor {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        Cars c2 = new Cars("Honda", "City");
        Cars c3 = new Cars("BMW", "X5", 2024);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}