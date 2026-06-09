public class A12_string {

    public static void main(String[] args) {

        String name = "Alice";

        // Accessing characters in the string
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Length of the string: " + name.length());

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
    }
}