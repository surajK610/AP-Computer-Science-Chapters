
/*Exercise MathFunctions
 * -----------------------------------
 * This program asks for a number and finds
 * the answer using functions of the math class.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class MathFunctions
{
    public static void main (String [] args)
    {
        Scanner getNum = new Scanner (System.in);
        DecimalFormat threePlaces = new DecimalFormat("0.###");
        
        double num, absoluteValue, power, sqrt, random;
        
        System.out.println("Please enter a number: ");
        num = getNum.nextDouble();
        
        absoluteValue = Math.abs(num);
        System.out.println("The absolute value of your number is: " + absoluteValue);
        
        power = Math.pow(num, 2);;
        System.out.println("The square of your number is: " + power);
        
        sqrt = Math.sqrt(num);
        System.out.println("The square root of your number is: " + threePlaces.format(sqrt));
        
        random = Math.random();
        System.out.println(" A random double between 0 inclusive and 1 exclusive is: " + random);
        
        System.out.println("This is pi up to the hundredths " + threePlaces.format(Math.PI));
    }
}

