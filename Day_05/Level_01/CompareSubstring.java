package Day_05;

/*Question 2 : Write a program to create a substring from a String using 
the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
 */
// Import the Scanner class for taking user input
import java.util.Scanner;

// Define a class to compare substrings
public class CompareSubstring {

    // Method to manually create a substring using a loop
    public static String createSubString(String str1, int startIndex, int endIndex) {
        // Create a StringBuilder to store the substring
        StringBuilder substring1 = new StringBuilder();

        // Append characters from the specified range
        for (int i = startIndex; i < endIndex; i++) {
            substring1.append(str1.charAt(i));
        }

        // Convert the StringBuilder to a string and return it
        return substring1.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Iterate through each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            // If any character is different, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // If all characters match, return true
        return true;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of the Scanner class to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for the original string
        System.out.println("Enter the original string:");
        String str1 = sc.next();

        // Take input for the start index of the substring
        System.out.println("Enter the start index:");
        int startIndex = sc.nextInt();

        // Take input for the end index of the substring
        System.out.println("Enter the end index:");
        int endIndex = sc.nextInt();

        // Create a substring manually using the custom method
        String subString1 = createSubString(str1, startIndex, endIndex);

        // Create a substring using the built-in substring method
        String subString2 = str1.substring(startIndex, endIndex);

        // Compare the two substrings using the custom comparison method
        boolean result = compareUsingCharAt(subString1, subString2);

        // Display the comparison result
        if (result) {
            System.out.println("Both the substrings are equal: " + result);
        } else {
            System.out.println("Both the substrings are not equal: " + result);
        }
    }
}
