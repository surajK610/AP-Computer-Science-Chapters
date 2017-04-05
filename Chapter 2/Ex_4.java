/* File: Exercise 2.4
 * ---------------------------------------
 * This program converts from Fahrenheit to 
 * Celsius reading the Fahrenheit temp from the user.
 */
import java.util.Scanner;
public class Ex_4
{
   //-----------------------------------------------------------------
   //  Computes the Celsius equivalent of a specific Fahrenheit
   //  value using the formula C = (F-32)/(9/5).
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      final double BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;
      
      System.out.print("Fahrenheit temperature to be converted to Celsius: ");
      double fahrenheitTemp = input.nextDouble(); 
      double celsiusTemp;

      celsiusTemp = (fahrenheitTemp- BASE) / CONVERSION_FACTOR;

      System.out.println ("Fahrenheit Temperature: " + fahrenheitTemp);
      System.out.println ("Celsius Equivalent: " + celsiusTemp);
   }
}