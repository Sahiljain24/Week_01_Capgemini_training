package Day_05;
/*Question 11:Write a program to split the text into words and return the words along with their lengths in a 2D array */
import java.util.Scanner;

public class SplitText {

    // Method to split text into words manually using charAt() method
    public static String[] splitTextIntoWords(String text) {
        // Initialize an ArrayList to store the words
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];
        int wordCount = 0;

        // Loop through the text using charAt() to manually split words
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // If the character is a space or punctuation, treat it as a word separator
            if (ch == ' ' || ch == '.' || ch == ',' || ch == ';' || ch == '!' || ch == '?') {
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0);  // Reset the word for next word
                }
            } else {
                // Append the character to the current word
                word.append(ch);
            }
        }
        
        // Add the last word if any
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }
        
        // Trim the array to contain only actual words
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        
        return result;
    }

    // Method to find and return the length of a string without using length() method
    public static int findStringLength(String text) {
        int length = 0;
        // Loop through the text using charAt() to count the number of characters
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to return 2D String array of words and their corresponding lengths
    public static String[][] getWordAndLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); // Store the length as String
        }
        
        return wordLengthArray;
    }

    public static void main(String[] args) {
        // Create a scanner instance to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string of text
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        // Step 1: Split the text into words
        String[] words = splitTextIntoWords(text);
        
        // Step 2: Get the word and length details in 2D array
        String[][] wordLengthDetails = getWordAndLength(words);
        
        // Step 3: Display the results in a tabular format
        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        
        // Display words and their corresponding lengths
        for (int i = 0; i < wordLengthDetails.length; i++) {
            // Convert the length from String to Integer for proper display
            int length = Integer.parseInt(wordLengthDetails[i][1]);
            System.out.println(wordLengthDetails[i][0] + "\t\t" + length);
        }
    }
}
