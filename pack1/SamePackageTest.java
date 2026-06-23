package pack1;

public class SamePackageTest {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("=== SAME PACKAGE ===");

        // System.out.println(obj.privateVar); // ERROR

        System.out.println("Default   : " + obj.defaultVar);
        System.out.println("Protected : " + obj.protectedVar);
        System.out.println("Public    : " + obj.publicVar);

        // privateVar is not accessible here
        //  System.out.println("Private   : " + obj.privateVar); 
    }
}