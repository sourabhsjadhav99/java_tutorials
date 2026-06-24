import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A5_userInput {
    public static void main(String[] args) throws IOException {
        // using inputStreamReader and bufferedReader


        System.out.println("enter your name: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        String name1 = br.readLine();
        System.out.println("Hello, " + name1 + "!");
        br.close();


   


        // using scanner
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println("Hello, " + name + "! You are " + age + " years old.");


        scanner.close();
    }
}

