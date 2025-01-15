package Day_05.Level_01;

/*Question 3: Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
 */
 
// Import the Scanner class for taking user input
import java.util.Scanner;

// Define a class to compare string characters
public class CompareStringCharacters {

    // Method to convert a string to a character array manually
    public static char[] toCharArray(String text) {
        // Create a character array of the same length as the string
        char[] charArray = new char[text.length()];
        // Populate the character array with characters from the string
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray; // Return the created character array
    }

    // Method to compare two character arrays
    public static boolean compareCharArray(char[] first, char[] second) {
        // Check if the lengths of the arrays are different
        if (first.length != second.length) {
            return false; // Arrays with different lengths cannot be equal
        }
        // Compare each character in the arrays
        for (int i = 0; i < second.length; i++) {
            if (first[i] != second[i]) { // If any character differs, return false
                return false;
            }
        }
        return true; // If all characters match, return true
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String text = sc.next();

        // Convert the string to a character array manually
        char[] characterArray = toCharArray(text);
        // Convert the string to a character array using the built-in method
        char[] characterArrayByBuiltin = text.toCharArray();

        // Compare the manually created array with the built-in array
        boolean result = compareCharArray(characterArray, characterArrayByBuiltin);

        // Display whether the two arrays are equal
        if (result) {
            System.out.println("Both the char arrays are equal: " + result);
        } else {
            System.out.println("Both the char arrays are not equal: " + result);
        }
    }
}
