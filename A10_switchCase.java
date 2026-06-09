public class A10_switchCase {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // new syntax without break statement
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Invalid day");
        }
        ;

        // Multiple Cases Together
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day");
        }

        // Switch Expression
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Day";
        };
        System.out.println(result);

        // yeild
        String result1 = switch (day) {
            case 1 -> {
                System.out.println("Day 1 selected");
                yield "Monday";
            }
            default -> {
                yield "Invalid";
            }
        };

        System.out.println(result1);

    }
}
