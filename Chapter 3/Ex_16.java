//Ex_16.java
import java.util.*;

public class Ex_16
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner (System.in);
        Random rn = new Random();
        
        int ranNum1, ranNum2, ranNum3;
        String decide = "y";
        
        System.out.println("---------------------------------------");
        System.out.println("           SLOT    MACHINE             ");
        System.out.println("---------------------------------------");
        while (decide.equalsIgnoreCase("y"))
        {
            ranNum1 = rn.nextInt(10);
            ranNum2 = rn.nextInt(10);
            ranNum3 = rn.nextInt(10);
            
            System.out.print(" " + ranNum1 + " " + ranNum2 + " " + ranNum3);
            
               if ( ranNum1 == ranNum2 && ranNum2 == ranNum3 && ranNum3 == ranNum1 )
            {
                System.out.println("\nYou WIN with a JACKPOT.");
            }
            else if ( ranNum1 == ranNum2 || ranNum2 == ranNum3 || ranNum3 == ranNum1 )
            {
                System.out.println("\nYou WIN with two of a kind.");
            }
            
            System.out.println("\nDo you want to play again (y/n) ? ");
            decide = sc.next();
        }
    }
}