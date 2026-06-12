class A11_array {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2d array example
        int [][] matrixx = new int[3][3];

        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[i].length; j++) {
                matrixx[i][j] = (int)(Math.random()*10);
            }
        }


        // or
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Looping through the 2d array
        System.out.println("All elements in the 2d array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // array of objects
        Student[] students = {
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 19)
        };

        // Looping through the array of objects
        System.out.println("All students in the array of objects:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + ", Age: " + students[i].age);
        }

    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}