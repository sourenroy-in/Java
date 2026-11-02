public class Problem_57 {

    public static void main(String[] args) {
        String sentence = "I            Lo      ve U        .";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}