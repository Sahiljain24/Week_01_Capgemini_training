package Day_05.Level_01;
/*Question 10:Write a program to convert the complete text to lowercase and compare the results
 */
import java.util.Scanner;

public class ConvertTextToLowerCase {

    // Method to convert text to lowercase manually using charAt() method
    public static String toLowerCaseManual(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        
        // Loop through each character in the string and convert it to lowercase if it is uppercase
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is uppercase (ASCII range of 'A' to 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII value difference (add 32 to convert to lowercase)
                lowerCaseText.append((char) (ch + 32));
            } else {
                // If it's already lowercase or non-alphabetical, append as-is
                lowerCaseText.append(ch);
            }
        }
        
        return lowerCaseText.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are not equal, the strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character of the two strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        // Create a scanner instance to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string of text
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        // Convert the text to lowercase manually using our method
        String lowerCaseManual = toLowerCaseManual(text);
        
        // Convert the text to lowercase using the built-in method
        String lowerCaseInBuilt = text.toLowerCase();

        // Compare the two results using the compareStrings method
        boolean result = compareStrings(lowerCaseManual, lowerCaseInBuilt);
        
        // Display the result of the comparison
        if (result) {
            System.out.println("Both the strings are equal: " + result);
        } else {
            System.out.println("Both the strings are not equal: " + result);
        }
    }
}
