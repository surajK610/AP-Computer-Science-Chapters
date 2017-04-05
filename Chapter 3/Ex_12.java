//Ex_12.java
 
import java.util.*;

public class Ex_12
{
       public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        String str, word = "", strRev = "", another = "y";
        char ch;
        int left, right;
        StringTokenizer breakStr;
        
        while (another.equalsIgnoreCase("y"))
        {
            strRev = "";
            
            System.out.println("\nEnter a potential palindrome");
            str = scan.nextLine();
            
            str = str.toLowerCase();
            
            for (int i = 0; i <= str.length()-1; i++)
            {
                ch = str.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') )
                {
                    strRev += ch;
                }
                }
            left = 0;
            right = strRev.length() -1;
            
            while (strRev.charAt(left) == strRev.charAt(right) && left < right)
            {
                left++;
                right--;
            }
            System.out.println();
            
            if (left < right)
                System.out.println("That string is NOT a palindrome.");
            else 
                System.out.println("That string IS a palindrome.");
                
            System.out.println();
            System.out.print ("Test another palindrome (y/n)? ");
            another = scan.nextLine();
            
        }
    }
}
        