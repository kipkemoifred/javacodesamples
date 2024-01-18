package tutorials.string;

public class StringStringBuilder {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = new String("World");


        // Concatenation (creates a new string)
        String result = str1 + " " + str2;

        // Substring (creates a new string)
        String substring = result.substring(6);

        // Length
        int length = result.length();

        System.out.println(result);      // Output: Hello World
        System.out.println(substring);   // Output: World
        System.out.println(length);      // Output: 11


        // Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Appending (modifies the same StringBuilder object)
        stringBuilder.append(" ").append("World");

        // Inserting at a specific position (modifies the same StringBuilder object)
        stringBuilder.insert(5, "Awesome ");

        System.out.println(stringBuilder);

        // Deleting characters (modifies the same StringBuilder object)
        stringBuilder.delete(11, 15);
        System.out.println(stringBuilder);

        // Reversing the string (modifies the same StringBuilder object)
        stringBuilder.reverse();

        // Converting to a String
        String result1 = stringBuilder.toString();

        System.out.println(result1);  // Output: emosA dlroW
    }
}
