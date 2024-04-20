package practice;

public class StringWordWithEvenLength {
    public static void wordEvenLength(String s){
        // Method to print words with even length in a string
            // Split the string into words
            String[] words = s.split("\\s+");

            // Iterate over each word
            for (String word : words) {
                // Check if the length of the word is even
                if (word.length() % 2 == 0) {
                    System.out.println(word);
                }
            }
    }
    public static void main(String[] args) {
        String st="this my house";
        wordEvenLength(st);
    }
}
