import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert input to lowercase for case-insensitive check
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a HashSet to store unique letters
        HashSet<Character> letters = new HashSet<>();

        // Iterate through the input and add letters to the HashSet
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        // Check if the HashSet contains all 26 letters
        return letters.size() == 26;
    }
}
