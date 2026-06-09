public class A6_condition {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // nested if statement
        int num = 10;
        if (num > 0) {
            System.out.println("The number is positive.");
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // ternary operator
        int a = 5, b = 10;
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
        System.out.println(result);
    }

}
