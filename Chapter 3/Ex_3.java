//Ex_3.java

import java.util.Scanner;

public class Ex_3
{
    public static void main (String [] args)
    {
        final int SENTINEL = 0;
        Scanner getYear = new Scanner (System.in);
        int year;
        
        
        System.out.println("Enter a year (or end the program by entering 0): ");
        year = getYear.nextInt();
        
        while(year != SENTINEL)
        {
        if (year >= 1582 ){
            if (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0))
            {
                System.out.println(year + " is a leap year.");
                System.out.println("Enter a year (or end the program by entering 0): ");
                year = getYear.nextInt();
            }
            else
            {
                 System.out.println(year + " is not a leap year.");
                 System.out.println("Enter a year (or end the program by entering 0: ");
                 year = getYear.nextInt();
            }
        }
        else 
        {
            System.out.println("Invalid Input");
            System.out.println("Enter a year (or end the program by entering 0: ");
            year = getYear.nextInt();
        }
       }
       System.out.println("You ended the program.");
    }
}