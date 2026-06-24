import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// ==========================
// CUSTOM EXCEPTION - To handle runtime errors
// ==========================
class InvalidAgeException extends Exception {


    public InvalidAgeException(String message) {
        super(message);
    }
}


// ==========================
// MAIN CLASS
// ==========================
public class A20_exceptions {


    // ==========================
    // METHOD USING THROWS
    // ==========================
    static void readFile() throws FileNotFoundException {


        File file = new File("test.txt");


        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


        scanner.close();
    }


    // ==========================
    // CUSTOM EXCEPTION METHOD
    // Ducking Exception - here checkAge will ask main method to handle the exception
    static void checkAge(int age) throws InvalidAgeException {


        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above");
        }


        System.out.println("Eligible for Voting");
    }


    // ==========================
    // MAIN METHOD
    // ==========================
    public static void main(String[] args) {


        System.out.println("===== PROGRAM STARTED =====");


        // ====================================
        // ArithmeticException
        // ====================================
        try {


            int result = 10 / 0;


            System.out.println(result);


        } catch (ArithmeticException e) {


            System.out.println(
                    "ArithmeticException: "
                            + e.getMessage());
        }


        // ====================================
        // NullPointerException
        // ====================================
        try {


            String name = null;


            System.out.println(name.length());


        } catch (NullPointerException e) {


            System.out.println(
                    "NullPointerException: "
                            + e.getMessage());
        }


        // ====================================
        // ArrayIndexOutOfBoundsException
        // ====================================
        try {


            int[] arr = { 10, 20, 30 };


            System.out.println(arr[5]);


        } catch (ArrayIndexOutOfBoundsException e) {


            System.out.println(
                    "ArrayIndexOutOfBoundsException");
        }


        // ====================================
        // NumberFormatException
        // ====================================
        try {


            int num = Integer.parseInt("ABC");


            System.out.println(num);


        } catch (NumberFormatException e) {


            System.out.println(
                    "NumberFormatException");
        }


        // ====================================
        // MULTIPLE CATCH
        // ====================================
        try {


            String str = null;


            System.out.println(str.length());


        } catch (NullPointerException e) {


            System.out.println(
                    "Handled NullPointerException");


        } catch (Exception e) {


            System.out.println(
                    "Handled General Exception");
        }


        // ====================================
        // FINALLY BLOCK
        // ====================================
        try {


            int num = 100 / 0;


        } catch (Exception e) {


            System.out.println(
                    "Exception Occurred");


        } finally {


            System.out.println(
                    "Finally Block Executed");
        }


        // ====================================
        // THROW KEYWORD
        // ====================================
        try {


            throw new Exception(
                    "Manually Thrown Exception");


        } catch (Exception e) {


            System.out.println(
                    e.getMessage());
        }


        // ====================================
        // CUSTOM EXCEPTION
        // ====================================
        try {


            checkAge(15);


        } catch (InvalidAgeException e) {


            System.out.println(
                    "Custom Exception: "
                            + e.getMessage());
        }


        // ====================================
        // CHECKED EXCEPTION
        // ====================================
        try {


            readFile();


        } catch (FileNotFoundException e) {


            System.out.println(
                    "File Not Found");


            // Stack Trace
            e.printStackTrace();
        }


        // try with resources
        try (Scanner scanner = new Scanner(System.in)) {      
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();


            System.out.print("Enter your age: ");
            int age = scanner.nextInt();


            System.out.println("Hello, " + name + "! You are " + age + " years old.");


        } catch (Exception e) {


            System.out.println(
                    "Exception Occurred: "
                            + e.getMessage());
        }


        System.out.println(
                "===== PROGRAM ENDED =====");
    }
}
