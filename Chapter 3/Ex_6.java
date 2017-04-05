//Ex_6.java

import java.util.Scanner;

public class Ex_6
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int num;
        int countEven = 0, countOdd = 0, countZero = 0;
        
        System.out.print("Enter an integer: ");
        num = scan.nextInt();
        num = Math.abs(num);
        if (num == 0)
        {
            countZero ++;
        }
        else 
        {
                while (num > 0)
            {
                if (num % 10 == 0)
                {
                    countZero ++;
                }
                else if (num % 2 == 0)
                {
                    countEven ++;
                }
                else 
                {
                    countOdd ++;
                }
                num /= 10;
                
            }
        }
        System.out.println("The number of zero digits is: " + countZero);
        System.out.println("The number of even digits is: " + countEven);
        System.out.println("The number of odd digits is: " + countOdd);
    }
}