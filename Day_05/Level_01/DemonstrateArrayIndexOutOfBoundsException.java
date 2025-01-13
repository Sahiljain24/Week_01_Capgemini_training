package Day_05;
/*question 8: Write a program to demonstrate ArrayIndexOutOfBoundsException
 */
// Import the Scanner class to take user input
import java.util.Scanner;

// Define a class to demonstrate ArrayIndexOutOfBoundsException
public class DemonstrateArrayIndexOutOfBoundsException {

    // Create a method to generate an exception by accessing an invalid index
    public static void generateException(String[] names) {
        // Access an index equal to the array's length to generate ArrayIndexOutOfBoundsException
        String number = names[names.length];
    }

    // Create a method to handle exceptions using a try-catch block
    public static void handleGeneratedException(String[] names) {
        try {
            // Try to access an invalid index
            String number = names[names.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("This is an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {

        // Create an instance of the Scanner class to read user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of names to be entered
        System.out.println("Enter the number of names:");
        int count = sc.nextInt();

        // Initialize an array to store the names
        String[] names = new String[count];

        // Loop to take input for each name
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name no." + i);
            names[i] = sc.next();
        }

        // Call the method that generates an exception and catch it in the main method
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception in the main method
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method that generates and handles the exception internally
        handleGeneratedException(names);
    }
}
