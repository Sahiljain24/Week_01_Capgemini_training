/*Question 6 : Write a program SpringSeason that takes two int values 
month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”  */

import java.util.Scanner;

public class SpringSeason {
    
    public static boolean checkSpring(String month, int date){
        
         if(month=="MARCH" && date >=20 && date<=31){
            return true;
        }else if(month=="APRIL" && date >=1 && date<=30){
            return true;
        }else if (month=="MAY" && date >=1 && date<=31){
            return true;
        }else if(month=="JUNE" && date >=1 && date<=20){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month name");
        String month = sc.next();
        
        System.out.println("Enter date");
        int date = sc.nextInt();

        boolean result = checkSpring(month.toUpperCase(),date);

        if(result == true ){
            System.out.println("Its a Spring Season ");
        }else{
            System.out.println("Not a spring Season");
        }
    }
}
