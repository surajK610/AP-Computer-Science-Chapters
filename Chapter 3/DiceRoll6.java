//DiceRoll6.java

import java.util.Random; 

public class DiceRoll6
{
    public static void main (String [] args)
    {
        Random ran = new Random();
        int num;
        int count6 = 0;
        for (int i = 1; i <= 1000; i++)
        {
            num = ran.nextInt(6) +1;
            
            if (num == 6)
            {
                count6 ++;
            }
        }
        System.out.println("The number of times rolled 6 is: " + count6);
    }
}