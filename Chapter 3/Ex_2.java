//Ex_2.java

import java.util.Scanner;

public class Ex_2
{
    public static void main (String [] args)
    {
        Scanner getYear = new Scanner (System.in);
        int year;
        
        System.out.println("Enter a year: ");
        year = getYear.nextInt();
        
        if (year >= 1582){
            if (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0))
            {
                System.out.println(year + " is a leap year.");
            }
            else
            {
                 System.out.println(year + " is not a leap year.");
            }
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    
    }
}