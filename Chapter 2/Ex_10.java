
/*Exercise 2.10
 * -----------------------------------
 * This program writes an application that reads the lengths of
 * the sides of a triangle from a user and computes the area of
 * the triangle using heron's formula.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_10
{
    public static void main (String [] args)
    {
        //Heron's formula: A = sqrt(s(s-a)(s-b)(s-c))
        
        Scanner readSides = new Scanner (System.in);
       
        DecimalFormat threePlaces = new DecimalFormat ("0.###");
     
        double side1, side2, side3;
        double area, halfPerimeter;
        
        System.out.println("Enter the length of the first side: ");
        side1 = readSides.nextDouble();
        
        System.out.println("Enter the length of the second side: ");
        side2 = readSides.nextDouble();
        
        System.out.println("Enter the length of the third side: ");
        side3 = readSides.nextDouble();
        
        halfPerimeter = (side1 + side2 + side3) / 2;
        
        area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        
        System.out.println("The area of a triangle with side lengths " + side1 + ", " + side2 + ", and " + side3 + " is " + threePlaces.format(area));
       
        
        
    }
}
