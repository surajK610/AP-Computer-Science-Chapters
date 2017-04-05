/*Exercise 2.2
 * ----------------------------------------
 * This reads three numbers and prints their average.
 */
import java.util.Scanner;  

public class Ex_2
{
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       double num1, num2, num3;
       
        System.out.print("Enter number 1:");
        num1 = input.nextDouble(); 
        System.out.print("Enter number 2:");
        num2 = input.nextDouble(); 
        System.out.print("Enter number 3:");
        num3 = input.nextDouble(); 
       
       double average = (num1 + num2 + num3)/3;
       
       System.out.print("The average of " + num1 + ", "+ num2 + ", " + num3 + " is equal to " + average + "." ); 
    }
}
