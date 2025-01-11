//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights


// Import the scanner class 
// Import the scanner class 
import java.util.Scanner;

// Create class name YoungestAndTallest 
public class YoungestAndTallest {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input ages for Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Input heights for Amar, Akbar, and Anthony
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend
        if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("The youngest friend is Anthony with age " + anthonyAge + " years.");
        } else if (amarAge < anthonyAge && amarAge < akbarAge) {
            System.out.println("The youngest friend is Amar with age " + amarAge + " years.");
        } else {
            System.out.println("The youngest friend is Akbar with age " + akbarAge + " years.");
        }

        // Find the tallest friend
        if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("The tallest friend is Anthony with height " + anthonyHeight + " cm.");
        } else if (amarHeight > anthonyHeight && amarHeight > akbarHeight) {
            System.out.println("The tallest friend is Amar with height " + amarHeight + " cm.");
        } else {
            System.out.println("The tallest friend is Akbar with height " + akbarHeight + " cm.");
        }

        // Close the scanner
        scanner.close();
    }
}
