
/**
 * Write a description of class fibbonaci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibbonaci
{
    public static int fibbonaci (int x, int num1, int num2)
    {
        int sum = num1 + num2;
        if (x - 2 == 0)
        {
            return sum;
        }
        else 
        {
            sum = num1 + num2;
            return  fibbonaci(x-1, num2, sum);
        }
    }
}
