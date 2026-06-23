package pack2;

import pack1.AccessDemo;

public class ChildClass extends AccessDemo {

    public void display() {

        System.out.println("=== SUBCLASS DIFFERENT PACKAGE ===");

        // System.out.println(privateVar); // ERROR
        // System.out.println(defaultVar); // ERROR

        System.out.println("Protected : " + protectedVar);
        System.out.println("Public    : " + publicVar);
    }
}