
/**
 * Write a description of class StringBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringBack
{
    public static String back (String word)
    {
        char last = word.charAt(word.length() - 1);
        int length = word.length();
        if (length == 1)
            return word;
        else 
            return last + back(word.substring(0,length - 1));
        
    }
}
