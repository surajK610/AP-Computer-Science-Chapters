/*RollOfDice.java
 * ---------------------------------
 * This class creates methods that invoke 
 * the method class.
 */
import java.util.Random;

public class RollOfDice
{
    public static void main (String [] args)
    {
        Random die1 = new Random ();
        Random die2 = new Random ();
        Random socialGenerator = new Random ();
        
        int roll1, roll2;
        
        roll1 = die1.nextInt(6) + 1;
        roll2 = die2.nextInt(6) + 1;
        
        System.out.println("Your first roll is: " + roll1);
        System.out.println("Your second roll is: " + roll2); 
        
        int socialNumsx, socialNums_xx, socialNumsxx, socialNumsxxxx;
        
        socialNumsx = socialGenerator.nextInt(9) + 1;
        socialNums_xx = socialGenerator.nextInt(90) + 10;
        socialNumsxx = socialGenerator.nextInt(90) + 10;
        socialNumsxxxx = socialGenerator.nextInt(9000) + 1000;
        
        System.out.println("Your social security number is: " + socialNumsx + socialNums_xx + 
        "-" + socialNumsxx + "-" + socialNumsxxxx);
    }
}