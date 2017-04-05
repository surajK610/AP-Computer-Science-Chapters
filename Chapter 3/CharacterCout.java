//CharacterCount.java
import java.util.*;

public class CharacterCout
{
    public static void main (String [] args )
    {
        Scanner read = new Scanner (System.in);
        String str;
        int count, countBlank;
        char ch;
        int countA = 0, countE = 0, countT = 0, countS = 0, countSpace = 0;
        
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        
        
        System.out.println("Enter a String or DONE to quit: ");
        str= read.nextLine();
        str = str.toLowerCase();
        while (!str.equals("DONE"))
        {
          for (int i = 0; i < str.length(); i++)
          {
              ch = str.charAt(i);
              switch (ch)
              {
                  case ' ':
                  countSpace ++;
                  break;
                
                  case 'a':
                  case 'A':
                  countA ++;
                  break;
                
                  case 'e':
                  case 'E':
                  countE ++;
                  break;
                
                  case 's':
                  case 'S':
                  countS ++;
                  break;
                
                  case 't':
                  case 'T':
                  countT ++;
                  break;
                
                  default:
                
                
                
               }
           }
           System.out.println("The number of spaces is: " + countSpace);
           System.out.println("The number of A's is: " + countA);
           System.out.println("The number of E's is: " + countE);
           System.out.println("The number of T's is: " + countT);
           System.out.println("The number of S's is: " + countS);
           
           System.out.println("\nEnter a String or DONE to quit: ");
           str= read.nextLine();
           countA = 0;
           countE = 0;
           countT = 0;
           countS = 0;
           countSpace = 0;
        }
    }
}