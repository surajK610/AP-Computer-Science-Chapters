//Ex_14.java
import java.util.*;

public class Ex_14
{
    public static void main (String [] args )
    {
        Scanner read = new Scanner (System.in);
        String str;
        int count;
        char ch;
        int countA = 0, countE = 0, countO = 0, countU = 0, countI = 0, countSpace = 0, countCons =0, countPun = 0;
        
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        
        
        System.out.println("Enter a String: ");
        str = read.nextLine();
        str = str.toLowerCase();

          for (int i = 0; i < str.length(); i++)
          {
              ch = str.charAt(i);
              switch (ch)
              {
                  case ' ':
                  countSpace ++;
                  break;
                
                  case 'a':
                  countA ++;
                  break;
                
                  case 'e':
                  countE ++;
                  break;
                
                  case 'o':
                  countO ++;
                  break;
                
                  case 'u':
                  countU ++;
                  break;
                  
                  case 'i':
                  countI ++;
                  break;
                  
                  case '!':
                  case '.':
                  case ',':
                  case ';':
                  case ':':
                  case '-':
                  case '+':
                  case '/':
                  case '?':
                  case '\\':
                  case ']':
                  case '[':
                  case '(':
                  case '"':
                  case '\'':
                  case ')':
                  case '&':
                  case '`':
                  case '~':
                  
                  countPun ++;
                  break;
                
                  default:
                  countCons ++; 
                
                
               }
            }
      
           System.out.println("The number of spaces is: " + countSpace);
           System.out.println("The number of consonants is: " + countCons);
           System.out.println("The number of punctuation characters is: " + countPun);
           System.out.println("The number of A's is: " + countA);
           System.out.println("The number of E's is: " + countE);
           System.out.println("The number of O's is: " + countO);
           System.out.println("The number of U's is: " + countU);
           System.out.println("The number of I's is: " + countU);

    }
}