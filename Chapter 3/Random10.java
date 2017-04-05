//Random10.java

import java.util.Random; 

public class Random10
{
    public static void main (String [] args)
    {
        Random ran = new Random();
        int num;
        
        for (int i = 1; i <= 10; i++)
        {
            num = ran.nextInt(100) +1;
            System.out.println(num);
        }
    }
}