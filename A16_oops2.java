// ==========================
// FINAL CLASS - Cannot be inherited
// ==========================


final class Utility {


    static void showMessage() {
        System.out.println("This is a final class");
    }
}


// ==========================
// PARENT CLASS
// ==========================


class Person1 {


    // final variable - Cannot be changed
    final String COUNTRY = "India";
    String address = "Mumbai";




    String name;


    Person1() {
        this("Unknown");
    }


    Person1(String name) {
        this.name = name;
    }


    // final method - Cannot be overridden
    final void showCountry() {
        System.out.println("Country: " + COUNTRY);
    }


    void display() {
        System.out.println("Person1 Name: " + name);
    }
}


// ==========================
// CHILD CLASS
// ==========================


class Student1 extends Person1 {


    private int age;


    String address = "Delhi";


    Student1() {
        this("Sourabh", 25); // constructor chaining
    }


    Student1(String name, int age) {
        super(name); // call parent constructor
        this.age = age;
    }


    // Getter
    public int getAge() {
        return age;
    }


    // Setter
    public void setAge(int age) {
        this.age = age;
    }


    // Method Overriding
    @Override
    void display() {
        System.out.println("Student1 Name: " + name);
        System.out.println("Age: " + age);
    }


    // equals() - it is coming from Object class - it is used to compare two objects
    @Override
    public boolean equals(Object obj) {


        if (this == obj)
            return true;


        if (!(obj instanceof Student1))
            return false;


        Student1 s = (Student1) obj;


        return this.name.equals(s.name)
                && this.age == s.age;
    }


    // hashCode() - it is coming from Object class - it is used to return hashcode of object
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }


    // toString() - it is coming from Object class - it is used to return string representation of object
    @Override
    public String toString() {
        return "Student1{name='" + name +
                "', age=" + age + "}";
    }


    // super keyword
    void showAddress() {
        System.out.println("My Address: " + this.address);
        System.out.println("Parent Address: " + super.address);
    }
}


// ==========================
// MAIN CLASS
// ==========================


public class A16_oops2 {


    public static void main(String[] args) {


        // ==========================
        // FINAL CLASS
        // ==========================


        Utility.showMessage();


        // ==========================
        // FINAL VARIABLE
        // ==========================


        Student1 s1 = new Student1();


        System.out.println("\nFinal Variable:");
        System.out.println(s1.COUNTRY);


        // s1.COUNTRY = "USA"; // ❌ Error


        // ==========================
        // FINAL METHOD
        // ==========================


        System.out.println("\nFinal Method:");
        s1.showCountry();


        // ==========================
        // GETTER / SETTER
        // ==========================


        System.out.println("\nGetter & Setter:");


        s1.setAge(30);


        System.out.println(s1.getAge());


        // ==========================
        // toString()
        // ==========================


        System.out.println("\ntoString():");
        // System.out.println(s1) = System.out.println(s1.toString()); - Both are same
        System.out.println(s1);


        // ==========================
        // equals()
        // ==========================


        System.out.println("\nequals():");


        Student1 s2 = new Student1("Sourabh", 30);


        System.out.println(s1.equals(s2));


        // ==========================
        // hashCode()
        // ==========================


        System.out.println("\nhashCode():");


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        // ==========================
        // ANONYMOUS OBJECT
        // ==========================


        System.out.println("\nAnonymous Object:");


        System.out.println(new Student1("Rahul", 22));


        // ==========================
        // AUTOBOXING


        System.out.println("\nAutoboxing:");


        int num = 100;


        Integer obj = num;


        System.out.println(obj);


        // ==========================
        // AUTO-UNBOXING


        System.out.println("\nAuto-Unboxing:");


        Integer value = 200;


        int primitive = value;


        System.out.println(primitive);


        // ==========================
        // parseInt()


        System.out.println("\nparseInt():");


        String str = "500";


        int number = Integer.parseInt(str);


        System.out.println(number);


        // ==========================
        // UPCASTING - Parent reference variable can refer to child object


        System.out.println("\nUpcasting:");


        Person1 p = new Student1("Amit", 24);


        p.display();


        // ==========================
        // DOWNCASTING - Child reference variable can refer to parent object


        System.out.println("\nDowncasting:");


        Student1 st = (Student1) p; // Downcasting


        st.display();


        System.out.println(st.getAge());


        // ==========================
        // instanceof


        System.out.println("\ninstanceof:");


        System.out.println(p instanceof Student1);
        System.out.println(st instanceof Person1);


        // ==========================
        // super keyword


        System.out.println("\nsuper keyword:");
        st.showAddress();
    }
}


