package Day_05.Level_01;

/*question 9: Write a program to convert the complete text to uppercase and compare the results
 */
// Import the Scanner class for taking user input
import java.util.Scanner;

// Define a class to compare strings after converting them to uppercase
public class CompareUpperCaseString {
    
    // Method to compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            // If characters at any position don't match, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // If all characters match, return true
        return true;
    }

    // Method to manually convert a string to uppercase
    public static String toUpperCaseManual(String text) {
        // Create a StringBuilder to store the uppercase string
        StringBuilder upperCaseText = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is a lowercase letter (between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert the character to uppercase by subtracting 32 from its ASCII value
                upperCaseText.append((char) (ch - 32));
            } else {
                // If the character is not lowercase, append it as-is
                upperCaseText.append(ch);
            }
        }
        // Return the resulting uppercase string
        return upperCaseText.toString();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of the Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter the text");
        String text = sc.nextLine();

        // Convert the input string to uppercase using the manual method
        String upperCaseManual = toUpperCaseManual(text);
        // Convert the input string to uppercase using the built-in method
        String upperCaseInBuilt = text.toUpperCase();

        // Print the converted strings for verification
        System.out.println("Built-in UpperCase: " + upperCaseInBuilt);
        System.out.println("Manual UpperCase: " + upperCaseManual);

        // Compare the manually converted string with the built-in result
        boolean result = compareUsingCharAt(upperCaseManual, upperCaseInBuilt);
        
        // Display whether the two converted strings are equal
        if (result) {
            System.out.println("Both the strings are equal: " + result);
        } else {
            System.out.println("Both the strings are not equal: " + result);
        }
    }
}
