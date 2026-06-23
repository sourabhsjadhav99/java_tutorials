package pack2;

import pack1.AccessDemo;

public class DifferentPackageTest {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("=== DIFFERENT PACKAGE ===");

        // System.out.println(obj.privateVar);   // ERROR
        // System.out.println(obj.defaultVar);   // ERROR
        // System.out.println(obj.protectedVar); // ERROR

        System.out.println("Public : " + obj.publicVar);

        ChildClass child = new ChildClass();
        child.display();
    }
}