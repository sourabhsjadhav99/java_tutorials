public class A9_loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // nested for loop
        System.out.println("\nNested for loop:");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
            }
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);

        // break statement and continue statement
        System.out.println("\nUsing break and continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop when i is 3
            }
            if (i == 7) {
                break; // Exit the loop when i is 7
            }
            System.out.println("Iteration: " + i);
        }
    }
}
