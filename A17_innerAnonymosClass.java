// ==========================
// ABSTRACT CLASS - cannot be instantiated, can have abstract methods
// ==========================
abstract class Animals {


    Animals() {
        System.out.println("Animals Constructor Called");
    }


    void eat() {
        System.out.println("Animals is eating");
    }


    abstract void sound(); // Abstract method - must be implemented by subclasses
}


// ==========================
// OUTER CLASS
// ==========================
class Outer {


    String message = "Hello from Outer Class";


    // ==========================
    // MEMBER INNER CLASS
    // ==========================
    class Inner {


        void display() {
            System.out.println("Member Inner Class");
            System.out.println(message);
        }
    }


    // ==========================
    // STATIC NESTED CLASS
    // ==========================
    static class StaticInner {


        void show() {
            System.out.println("Static Nested Class");
        }
    }


    // ==========================
    // LOCAL INNER CLASS
    // ==========================
    void localInnerDemo() {


        class LocalInner {


            void print() {
                System.out.println("Local Inner Class");
            }
        }


        LocalInner obj = new LocalInner();
        obj.print();
    }
}


// ==========================
// CHILD CLASS
// ==========================
class Dogs extends Animals {


    Dogs() {
        System.out.println("Dogs Constructor Called");
    }


    @Override
    void sound() {
        System.out.println("Dogs says Bark");
    }
}


// ==========================
// MAIN CLASS
// ==========================
public class A17_innerAnonymosClass {


    public static void main(String[] args) {


        System.out.println("===== ABSTRACT CLASS =====");


        Animals dog = new Dogs();


        dog.eat();
        dog.sound();


        System.out.println();


        System.out.println("===== MEMBER INNER CLASS =====");


        Outer outer = new Outer();


        Outer.Inner inner = outer.new Inner();
        inner.display();


        System.out.println();


        System.out.println("===== STATIC NESTED CLASS =====");


        Outer.StaticInner staticObj = new Outer.StaticInner();
        staticObj.show();


        System.out.println();


        System.out.println("===== LOCAL INNER CLASS =====");


        outer.localInnerDemo();


        System.out.println();


        System.out.println("===== ANONYMOUS INNER CLASS =====");


        Animals cat = new Animals() {


            @Override
            void sound() {
                System.out.println("Cat says Meow");
            }
        };


        cat.eat();
        cat.sound();
    }
}

