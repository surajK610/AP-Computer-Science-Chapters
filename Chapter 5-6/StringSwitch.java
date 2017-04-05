
/**
 * Write a description of class StringSwitch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringSwitch
{
    public static void main(String [] args)
    {
        String [] hell = new String [3] ;
        hell[0] = "hell";
        hell[1] = "hello";
        hell[2] = "hellos";
        StringSwitch(hell);
        
        for(String elem: hell)
        {
            System.out.println(elem);
        }
    }
    public static String [] StringSwitch (String [] orig)
    {
        String temp = "";
        for(int i = 0; i < orig.length; i ++)
        {
            for(int j = orig[i].length() - 1; j >= 0; j--)
            {
                temp += orig[i].charAt(j);
            }
            orig[i] = temp;
            temp = "";
        }
        return orig;
    }
}
