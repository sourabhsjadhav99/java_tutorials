import java.util.*;

public class A25_comparator {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "John", 70000));
        employees.add(new Employee(101, "Alice", 90000));
        employees.add(new Employee(102, "Bob", 60000));

        System.out.println("Original");
        System.out.println(employees);

        // Comparable
        Collections.sort(employees);

        System.out.println("\nComparable (ID)");
        System.out.println(employees);

        // Comparator Name
        employees.sort(Comparator.comparing(e -> e.name));

        System.out.println("\nComparator (Name)");
        System.out.println(employees);

        // Comparator Salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("\nComparator (Salary)");
        System.out.println(employees);

        // Descending Salary
        employees.sort(Comparator.comparingDouble((Employee e) -> e.salary).reversed());

        System.out.println("\nSalary Desc");
        System.out.println(employees);
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}