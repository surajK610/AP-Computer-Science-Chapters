import java.util.*;
import java.text.*;
public class MathFunctions
{
     private int x;
    static  private Scanner scan = new Scanner (System.in);
    static private NumberFormat form = NumberFormat.getCurrencyInstance();

     public MathFunctions()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static double area ()
    {
        double a, b;
        double area;
        
        System.out.println("Enter the length and width (press enter after each): ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        area = a * b;
        
        System.out.println("The area is " + area);
        return area;
    }
    
    public static int factorial ()
    {
        int a = 1;
        int total = 1;
        
        System.out.println("\nEnter a number to factorial:");
        a = scan.nextInt();
        
        for (int i = a; i >= 1; i --)
        {
            total *= i;
        }
        System.out.println("The total is " +total);
        return total;
    }
    
    public static double average ()
    {
        double average;
        double num;
        int count = 0;
        double total = 0;
        
        System.out.println("\nThis program finds the average or numbers."
        + "\nEnter a number or 0 to stop:");
        num = scan.nextDouble();
        while (num != 0)
        {
            total += num;
            count ++;
            
            System.out.println("Enter a number or 0 to stop:");
            num = scan.nextDouble();
           
        }
        average = total/count;
        System.out.println("The average is " + average);
        return average;
    }
    
    public static double rate ()
    {
        double rate, princ, years;
        double balance;
        double interest, totInt = 0;
        
        System.out.println("\nEnter a principle:");
        princ = scan.nextDouble();
        System.out.println("Enter a rate:");
        rate = scan.nextDouble();
        System.out.println("Enter the number of years:");
        years = scan.nextDouble();
        
        balance = princ;
        for (int i = 1; i <= years; i ++)
        {
            interest = balance * (rate / 100.0);
            totInt += interest;
            balance += interest;
        }
        
        System.out.println("Your new principle is " + form.format(balance));
        System.out.println("Your total interest is " + form.format(totInt));
        return balance;
    }
    
}
    