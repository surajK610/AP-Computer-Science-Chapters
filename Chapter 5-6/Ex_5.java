import java.util.*;

public class Ex_5
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int printrange1, printrange2;
        int [] chart = new int [10];
        int input;
        String another = "y";
        
        while(another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a number from 1-100. ");
            input = scan.nextInt();
            chart[(input/10)]++;
            
            System.out.println("Do another (y/n)? ");
            another = scan.next();
        }
        
        for( int i = 0; i < chart.length; i ++)
        {
            printrange1 = (i * 10) + 1;
            printrange2 = printrange1 + 9;
            System.out.print(printrange1 + "\t-  " + printrange2 + "\t| ");
            for(int j = 0; j < chart[i]/3; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
