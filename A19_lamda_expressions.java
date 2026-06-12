@FunctionalInterface // it have only one abstract method
interface Calculator {

    int calculate(int a, int b);
}

public class A19_lamda_expressions {

    public static void main(String[] args) {

        // before lambda expressions
        // Calculator add1 = new Calculator() {
        //     @Override
        //     public int calculate(int a, int b) {
        //         return a + b;
        //     }
        // };

        Calculator add = (a, b) -> a + b;

        Calculator sub = (a, b) -> a - b;

        Calculator mul = (a, b) -> a * b;

        Calculator div = (a, b) -> a / b;

        System.out.println("Add: " + add.calculate(20, 10));
        System.out.println("Sub: " + sub.calculate(20, 10));
        System.out.println("Mul: " + mul.calculate(20, 10));
        System.out.println("Div: " + div.calculate(20, 10));
    }
}