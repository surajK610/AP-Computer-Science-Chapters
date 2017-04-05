
/**
 * Write a description of class digits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class digits
{
    public static int digits (int x)
    {
        String num = Integer.toString(x);
        int place = num.length() - 1;
        char last = num.charAt(place);
        
        int digit = Integer.valueOf(last) - (int)'0';
        System.out.println(digit);
        if (place == 0)
        {
            return x;
        }
        else 
        {
            return digit + digits(x/10);
        }
    }
}
