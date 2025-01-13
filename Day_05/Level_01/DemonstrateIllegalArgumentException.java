package Day_05;
/*Question 6 : Write a program to demonstrate IllegalArgumentException. 
 */

 //Import the Scanner class
import java.util.Scanner;

//create a class DemonstrateIllegalArgumentException
public class DemonstrateIllegalArgumentException {
    
    //create a method to for throwing exception
    public static void generateException(String text){
        String  subString = text.substring(text.length()-1,0);
    }
    // create a method to for throwing and catching exception
    public static void handleGeneratedException(String text){

       try {
        String  subString = text.substring(text.length()-1,0);

       }catch(IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
       } catch (IllegalArgumentException e) {
         //handle exception
         System.out.println("this is an IllegalArgumentException " + e.getMessage());
         
       }catch (RuntimeException e) {
        // Handle any other runtime exception
        System.out.println("Caught a RuntimeException: " + e.getMessage());
    }
    }


    public static void main(String[] args) {
        // Create an instance of the Scanner class to take user input
        Scanner sc = new Scanner(System.in);
    
        // Prompt the user to enter a string
        System.out.println("Enter a string text");
        String text = sc.next();
    
        // Call the method that generates an exception and handle it in a try-catch block
        try {
            // Attempt to generate an exception using the text input
            generateException(text);
        } catch (IndexOutOfBoundsException e) {
            // Handle IndexOutOfBoundsException and print the exception message
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException and print a custom exception message
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    
        // Call the method that generates and handles the exception internally
        handleGeneratedException(text);
    }
    