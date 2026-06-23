package pack1;

public class AccessDemo {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void showAccess() {
        System.out.println("Inside Same Class");
        System.out.println("Private   : " + privateVar);
        System.out.println("Default   : " + defaultVar);
        System.out.println("Protected : " + protectedVar);
        System.out.println("Public    : " + publicVar);
    }
}

// private - accessible only within the same class
// default - accessible within the same package
// protected - accessible within the same package and subclasses in different packages
// public - accessible from anywhere