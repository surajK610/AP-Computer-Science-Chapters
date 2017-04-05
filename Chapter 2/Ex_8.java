/* File: Exercise 2.8
 * ---------------------------------------
 * This program reads the coordinates (x, y)
 * of two points and computes the distance 
 * between the points. 
 */
import java.util.Scanner;
public class Ex_8
{
   //-----------------------------------------------------------------
   // uses formula: the square root of ((x2-x1)^2  + (y1 - y2)^2)
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the first coordinate's x: " );
      int point1X = input.nextInt();
      System.out.print("Enter the first coordinate's y: " );
      int point1Y = input.nextInt();

      
      System.out.print("\nEnter the second coordinate's x: " );
      int point2X = input.nextInt();
       System.out.print("Enter the second coordinate's y: " );
      int point2Y = input.nextInt();

      
      //finds the distance between the two points
      double distance = Math.sqrt(Math.pow(point1X - point2X, 2) + Math.pow(point1Y - point2Y, 2));
      
      System.out.println ("The distance between (" + point1X + ", " + point1Y + ") and (" + point2X + "," + point2Y + ") is " + distance);
   }
}
