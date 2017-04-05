/* File: Exercise 2.9
 * ---------------------------------------
 * This program reads the radius of a sphere
 * and prints its volume and surface area.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_9
{
   //-----------------------------------------------------------------
   // uses formula: Volume= 4/3(pi)r^3 Surface Area = 4(pi)r^2
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
     Scanner getNumber = new Scanner(System.in);
     
     System.out.print("Enter the radius of the sphere:");
     double radius = getNumber.nextDouble();
     
     //calculates the volume of a sphere
     double volume = (double)4 / 3 * (Math.pow(radius, 3)) * Math.PI;
     //calculates the surface area of a sphere
     double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
     
     //rounds the output to 4 decimal places
     DecimalFormat fourPlaces = new DecimalFormat ("0.####");

     System.out.println(" The sphere's volume: " + fourPlaces.format(volume)); 
     System.out.println(" The sphere's surface area: " + fourPlaces.format(surfaceArea)); 
     
    }
}

