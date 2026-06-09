import java.lang.reflect.Method;

public class A7_functions {
    public static void main(String[] args) {
        String name = "Sourabh";
        
        A7_functions A7_functions = new A7_functions();
        String message = A7_functions.greeting(name);
        System.out.println(message); // Hello, Sourabh!

        int result = add(5, 3);
        System.out.println("Addition: " + result); // 8

        int result1 = add(5, 3, 2);
        System.out.println("Addition (three operands): " + result1); // 10

        int result2 = subtract(10, 4);
        System.out.println("Subtraction: " + result2); // 6

        int result3 = multiply(6, 7);
        System.out.println("Multiplication: " + result3); // 42

        double result4 = divide(20, 5);
        System.out.println("Division: " + result4); // 4.0
    }

    String greeting(String name) {
        return "Hello, " + name + "!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Method Overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int subtract(int a, int b) { 
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

}
