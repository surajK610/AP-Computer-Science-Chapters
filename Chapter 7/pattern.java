
/**
 * Write a description of class pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern
{
    public static int pattern (int x)
    {
        System.out.println(x);
        if(x == 1)
        {
            return 1;
        }
        
        else if (x % 2 == 0)
        {
            return pattern(x/2);
        }
        else
        {
            return pattern(x * 3 + 1);
        }
    }
}
