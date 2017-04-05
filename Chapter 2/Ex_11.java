
/*Exercise 2.11
 * -----------------------------------
 * This program writes an application that computes the number of miles per 
 * gallon for a rip. The total amount of gas is a floating point number and
 * the program accepts two numbers as the odometer readings at start and end.
 */
import java.util.Scanner;

public class Ex_11
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        float amountGasUsed;
        int odomAtStart, odomAtEnd;
        double milesPerGallon;
        int totalMiles; 
        
        System.out.println("What was the total number of gallons of gas used during this trip? ");
        amountGasUsed = input.nextFloat();
        
        System.out.println("What was the odometer reading at the start of the trip? ");
        odomAtStart = input.nextInt();
        
        System.out.println("What was the odometer reading at the end of the trip? ");
        odomAtEnd = input.nextInt();
        
        totalMiles = odomAtEnd - odomAtStart;
        milesPerGallon = totalMiles / amountGasUsed;
        
        System.out.println("The miles per gallon for " + totalMiles + " miles and " + amountGasUsed + " gallons is " + milesPerGallon + " mpg.");
        
        
    }
}
