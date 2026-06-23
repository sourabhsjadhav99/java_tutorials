public class A3_dataTypes {
    public static void main(String[] args) {
        // Data types in Java

        // Primitive data types
        byte myByte = 100; // 1 byte, range: -128 to 127, default value: 0
        short myShort = 10000; // 2 bytes, range: -32,768 to 32,767, default value: 0
        int myInt = 100000; // 4 bytes, range: -2^31 to 2^31-1, default value: 0
        long myLong = 100000L; // 8 bytes, range: -2^63 to 2^63-1, default value: 0

        float myFloat = 5.99f; // 4 bytes, single precision, default value: 0.0f
        double myDouble = 19.99; // 8 bytes, double precision, default value: 0.0d

        char myChar = 'A'; // 2 bytes, single character, default value: '\u0000'
        boolean myBoolean = true; // 1 byte, true or false, default value: false

        // Non-primitive data type
        String myString = "Hello World"; // A sequence of characters

        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
        System.out.println("String value: " + myString);

        // implicit and explicit type casting
        int myInt2 = 9;
        double myDouble2 = myInt2; // implicit casting

        double myDouble3 = 9.78;
        int myInt3 = (int) myDouble3; // explicit casting

        System.out.println("Implicit casting: " + myDouble2);
        System.out.println("Explicit casting: " + myInt3);

        int x = 300;
        byte b = (byte) x;
        // 300 % 256 = 44
        // If n is outside -128 to 127, keep only the last 8 bits.

        // For positive numbers:
        // Result ≈ n % 256
        // If result > 127,
        // result = result - 256

        System.out.println(b);

        // Type Promotion -
        byte a1 = 100;
        byte b1 = 100;

        int c = a1 * b1; // a1 and b1 are promoted to int before multiplication
        System.out.println(c);

    }
}
