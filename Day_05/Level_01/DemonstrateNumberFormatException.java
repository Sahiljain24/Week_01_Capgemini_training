package Day_05;



/*question 7 : Write a program to demonstrate NumberFormatException
 */
import java.util.Scanner;

public class DemonstrateNumberFormatException {

    // Create a method to generate and throw a NumberFormatException
    public static void generateException(String text) {
        // Attempt to parse a string into an integer, which may throw a NumberFormatException
        int number = Integer.parseInt(text);
    }

    // Create a method to handle NumberFormatException using a try-catch block
    public static void handleGeneratedException(String text) {
        try {
            // Attempt to parse the string into an integer
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException and display a custom error message
            System.out.println("This is a NumberFormatException: " + e.getMessage());
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

        // Call the method that generates a NumberFormatException and handle it in the main method
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException and display a custom error message
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method that handles the NumberFormatException internally
        handleGeneratedException(text);
    }
}
