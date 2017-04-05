/*File:Exercise 2.3
 *----------------------------------------
 *Reads two floating point numbers and writes their
 *sum, difference, and product.
 */
import java.util.Scanner;  

public class Ex_3
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter num 1: ");
        double one = input.nextDouble(); 
        System.out.print("Enter num 2: ");
        double two = input.nextDouble();
        
        double sum = one + two;
        double difference = one - two;
        double product = one * two;
        
        System.out.println("The sum of " + one + " and " + two + " is " + sum + ".");
        System.out.println("The difference of " + one + " and " + two + " is " + difference + ".");
        System.out.println("The product of " + one + " and " + two + " is " + product + ".");
        
    }
}
 