/* File: Exercise 2.5
 * ---------------------------------------
 * This program converts miles to kilometers.
 */
import java.util.Scanner;
public class Ex_5
{
   //-----------------------------------------------------------------
   // 1 mi = 1.60935 kilometers
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      final double CONVERSION_FACTOR = 1.60935;
      System.out.print("Number of miles to be converted to kilometers: ");
      double miles = input.nextDouble(); 
      double kilometers;

      kilometers = miles *CONVERSION_FACTOR;

      System.out.println (miles + " miles is equal to " + kilometers + " kilometers.");
   }
}