public class A12_string {

    public static void main(String[] args) {

        String name = "Alice";

        // Accessing characters in the string
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Length of the string: " + name.length());

        // string class
        String anotherString = new String("Hello, World!");
        System.out.println("Another string: " + anotherString);

        // Concatenating strings
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // Comparing strings
        String anotherName = "Bob";
        if (name.equals(anotherName)) {
            System.out.println("Names are the same.");
        } else {
            System.out.println("Names are different.");
        }

        // String methods
        String upperCaseName = name.toUpperCase();
        System.out.println("Upper case name: " + upperCaseName);

        String lowerCaseName = name.toLowerCase();
        System.out.println("Lower case name: " + lowerCaseName);

        String substringName = name.substring(1, 4);
        System.out.println("Substring of name: " + substringName);

        String replacedName = name.replace('A', 'E');
        System.out.println("Replaced name: " + replacedName);

        String trimmedName = "  " + name + "  ";
        System.out.println("Trimmed name: '" + trimmedName.trim() + "'");

        String formattedString = String.format(
                "My name is %s and I am %d years old.",
                name, 30);
        System.out.println(formattedString);

        String[] nameParts = name.split("c");
        System.out.println("Name parts:");

        for (String part : nameParts) {
            System.out.println(part);
        }

        String joinedString = String.join("-", nameParts);
        System.out.println("Joined string: " + joinedString);

        String repeatedString = name.repeat(3);
        System.out.println("Repeated string: " + repeatedString);

        String reversedString = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        // mutable string using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        System.out.println("StringBuilder result: " + stringBuilder.toString());

        stringBuilder.insert(5, " Java");
        System.out.println("StringBuilder after insert: " + stringBuilder.toString());

        stringBuilder.delete(5, 10);
        System.out.println("StringBuilder after delete: " + stringBuilder.toString());

        stringBuilder.replace(0, 5, "Hi");
        System.out.println("StringBuilder after replace: " + stringBuilder.toString());

        stringBuilder.reverse();
        System.out.println("StringBuilder after reverse: " + stringBuilder.toString());
        // ----------

        // =========================
        // String (Immutable)
        // =========================

        String str = "Hello";

        System.out.println("Before String: " + str);

        str = str + " Java";

        System.out.println("After String : " + str);

        // =========================
        // StringBuffer (Mutable)
        // Thread Safe
        // =========================

        StringBuffer sbf = new StringBuffer("Hello");

        System.out.println("\nBefore StringBuffer: " + sbf);

        sbf.append(" Java");
        sbf.append(" World");

        System.out.println("After StringBuffer : " + sbf);

        // =========================
        // StringBuilder (Mutable)
        // Faster, Not Thread Safe
        // =========================

        StringBuilder sbd = new StringBuilder("Hello");

        System.out.println("\nBefore StringBuilder: " + sbd);

        sbd.append(" Java");
        sbd.append(" World");

        System.out.println("After StringBuilder : " + sbd);

        // =========================
        // Common Methods
        // =========================

        sbd.insert(5, " Core");
        System.out.println("\nAfter Insert : " + sbd);

        sbd.replace(6, 10, "Advanced");
        System.out.println("After Replace: " + sbd);

        sbd.delete(6, 14);
        System.out.println("After Delete : " + sbd);

        sbd.reverse();
        System.out.println("After Reverse: " + sbd);

    }
}