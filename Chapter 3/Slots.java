//Slots.java
import java.util.*;

public class Slots
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner (System.in);
        Random rn = new Random();
        
        int money;
        int ranNum1, ranNum2, ranNum3;
        String decide = "y";
        
        System.out.println("---------------------------------------");
        System.out.println("           SLOT    MACHINE             ");
        System.out.println("---------------------------------------");
        
        System.out.println("How much money would you like to play with? ");
        money = sc.nextInt();
        
        while (decide.equalsIgnoreCase("y") && money > 0)
        {
            ranNum1 = rn.nextInt(10);
            ranNum2 = rn.nextInt(10);
            ranNum3 = rn.nextInt(10);
            
            System.out.print(" " + ranNum1 + " " + ranNum2 + " " + ranNum3);
            
               if ( ranNum1 == ranNum2 && ranNum2 == ranNum3 && ranNum3 == ranNum1 )
            {
                System.out.println("\nYou WIN with a JACKPOT.");
                money += 20;
            }
            else if ( ranNum1 == ranNum2 || ranNum2 == ranNum3 || ranNum3 == ranNum1 )
            {
                System.out.println("\nYou WIN with two of a kind.");
                money += 3;
            }
            
            money --;
            
            System.out.println("\nYou have " + money + " dollars.");
            System.out.println("\nDo you want to play again (y/n) ? ");
            decide = sc.next();
        }
        if (money <= 0)
        {
            System.out.println("OUT OF MONEY! You will have to pay by doing the dishes for 12 hours. LOSER!!!");
        }
       
    }
}