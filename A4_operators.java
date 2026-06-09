public class A4_operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // 2. Unary Operators
        int A1 = 5;
        int b1 = ++A1; // 'A1' becomes 6, then 'b1' is assigned 6. (A1=6, b1=6)

        int a2 = 5;
        int b2 = a2++; // 'b2' is assigned 5 first, then 'a2' becomes 6. (a2=6, b2=5)
        System.out.println("A1: " + A1 + ", b1: " + b1);
        System.out.println("a2: " + a2 + ", b2: " + b2);

        System.out.println("a2++: " + ~a2); // Bitwise complement operator, inverts the bits of a2 (which is 6, so ~6 = -7)

        int balance = 100;

        balance += 50; // Equivalent to: balance = balance + 50; (150)
        balance -= 20; // Equivalent to: balance = balance - 20; (130)
        balance *= 2; // Equivalent to: balance = balance * 2; (260)
        balance /= 10; // Equivalent to: balance = balance / 10; (26)
        balance %= 5; // Equivalent to: balance = balance % 5; (1)

        // 3. Assignment Operators
        int c = 10;
        c += 5; // c = c + 5; c is now 15
        System.out.println("c after += 5: " + c);

        c -= 3; // c = c - 3; c is now 12
        System.out.println("c after -= 3: " + c);

        c *= 2; // c = c * 2; c is now 24
        System.out.println("c after *= 2: " + c);

        c /= 4; // c = c / 4; c is now 6
        System.out.println("c after /= 4: " + c);

        // 4. Comparison Operators
        int x = 10;
        int y = 20;

        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y)); // false
        System.out.println("x < y: " + (x < y)); // true
        System.out.println("x >= y: " + (x >= y)); // false
        System.out.println("x <= y: " + (x <= y)); // true

        // 5. Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("p && q: " + (p && q)); // false
        System.out.println("p || q: " + (p || q)); // true
        System.out.println("!p: " + (!p)); // false

    }

}
