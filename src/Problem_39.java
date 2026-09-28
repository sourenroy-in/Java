public class Problem_39 {
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

        // 1. length() - Returns the total number of characters
        System.out.println("1. Length of str1: " + str1.length());

        // 2. charAt(index) - Returns the character at a specific position (0-indexed)
        System.out.println("2. Character at index 7 in str1: '" + str1.charAt(7) + "'");

        // 3. substring(start, end) - Extracts a portion of the string
        // Note: start index is inclusive, end index is exclusive
        System.out.println("3. Substring of str1 (index 7 to 11): \"" + str1.substring(7, 11) + "\"");

        // 4. toLowerCase() & toUpperCase() - Case conversions
        System.out.println("4. str1 in Upper Case: \"" + str1.toUpperCase() + "\"");
        System.out.println("   str1 in Lower Case: \"" + str1.toLowerCase() + "\"");

        // 5. trim() - Removes leading and trailing whitespace
        System.out.println("5. Trimmed str2: \"" + str2.trim() + "\"");

        // 6. replace(oldChar, newChar) - Replaces characters or substrings
        System.out.println("6. Replace 'World' with 'Universe' in str1: \"" + str1.replace("World", "Universe") + "\"");

        // 7. contains(sequence) - Checks if a sequence exists in the string (Returns
        // boolean)
        System.out.println("7. Does str1 contain \"Java\"? " + str1.contains("Java"));

        // 8. indexOf(str) - Finds the first occurrence of a substring (-1 if not found)
        System.out.println("8. First index of 'a' in str1: " + str1.indexOf("a"));

        // 9. equals() & equalsIgnoreCase() - Content comparison
        System.out.println("9. Is str1 exactly equal to str3? " + str1.equals(str3));
        System.out.println("   Is str1 equal to str3 ignoring case? " + str1.equalsIgnoreCase(str3));

        // 10. concat(str) - Appends one string to another
        System.out.println("10. Concatenation: " + str1.concat(" Welcome!"));
    }
}


