/*Question 4 : Write a program to demonstrate NullPointerException
 */

 package Day_05;
 public class DemonstrateNullPointerException {

    // Create a method to generate and throw a NullPointerException
    public static void generateException() {
        // Initialize the string variable to null
        String text = null;

        // Attempt to call a method on a null object, which will throw a NullPointerException
        int length = text.length();
    }

    // Create a method to handle NullPointerException using a try-catch block
    public static void handleGeneratedException() {
        // Initialize the string variable to null
        String text = null;

        // Use try-catch to handle the exception
        try {
            // Attempt to call a method on a null object
            int length = text.length();
        } catch (NullPointerException e) {
            // Handle the NullPointerException and display a custom error message
            System.out.println("This is a null pointer exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method that generates a NullPointerException and handle it in the main method
        try {
            generateException();
        } catch (NullPointerException e) {
            // Handle the NullPointerException and display a custom error message
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method that handles the NullPointerException internally
        handleGeneratedException();
    }
}
