package Day_05.Level_01;
/*question 5 :Write a program to demonstrate StringIndexOutOfBoundsException
 */
import java.util.Scanner;

public class DemonstrateStringIndexOutOfBoundsException {

    // Create a method to generate and throw a StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Attempt to access a character at an invalid index, which will throw an exception
        int index = text.charAt(text.length());
    }

    // Create a method to handle StringIndexOutOfBoundsException using a try-catch block
    public static void handleGeneratedException(String text) {
        try {
            // Attempt to access a character at an invalid index
            int index = text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException and display a custom error message
            System.out.println("This is a StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Scanner class to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string text");
        String text = sc.next();

        // Call the method that generates a StringIndexOutOfBoundsException and handle it in the main method
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException and display a custom error message
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method that handles the StringIndexOutOfBoundsException internally
        handleGeneratedException(text);
    }
}
