public class App {
    public static void main(String[] args) {
        String text = "Hello, Java World!";

        // length()
        System.out.println("Length: " + text.length()); // 17

        // toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase()); // HELLO, JAVA WORLD!

        // toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase()); // hello, java world!

        // charAt()
        System.out.println("Char at index 1: " + text.charAt(1)); // e

        // substring()
        System.out.println("Substring (7, 11): " + text.substring(7, 11)); // Java

        // contains()
        System.out.println("Contains 'Java': " + text.contains("Java")); // true

        // indexOf()
        System.out.println("Index of 'World': " + text.indexOf("World")); // 12

        // replace()
        System.out.println("Replace 'Java' with 'String': " + text.replace("Java", "String")); // Hello, String World!

        // trim()
        String padded = "   Hello   ";
        System.out.println("Trimmed: '" + padded.trim() + "'"); // 'Hello'

        // equals()
        System.out.println("Equals 'Hello, Java World!': " + text.equals("Hello, Java World!")); // true

        // split()
        String[] words = text.split(" ");
        System.out.println("First word: " + words[0]); //
    }
}