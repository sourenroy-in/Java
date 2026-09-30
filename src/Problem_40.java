
public class Problem_40 {

    public static void main(String[] args) {
        // Initializing sample strings
        String str1 = "Hello, Java World!";
        String str2 = "  Learn Programming   ";
        String str3 = "hello, java world!";

        System.out.println("--- Original Strings ---");
        System.out.println("str1: \"" + str1 + "\"");
        System.out.println("str2: \"" + str2 + "\"");
        System.out.println("str3: \"" + str3 + "\"\n");

        System.out.println("--- Demonstrating Standard String Methods ---");
        System.out.println("5. Trimmed str2: \"" + str2.trim() + "\"");

        System.out.println("6. Replace 'World' with 'Universe' in str1: \"" + str1.replace("World", "Universe") + "\"");

        System.out.println("7. Does str1 contain \"Java\"? " + str1.contains("Java"));

        System.out.println("8. First index of 'a' in str1: " + str1.indexOf("a"));

        System.out.println("9. Is str1 exactly equal to str3? " + str1.equals(str3));
        System.out.println("   Is str1 equal to str3 ignoring case? " + str1.equalsIgnoreCase(str3));

        System.out.println("10. Concatenation: " + str1.concat(" Welcome!"));
    }
}
