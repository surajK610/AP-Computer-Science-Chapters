//alphabetizer.java

import java.util.*;

public class alphabetizer
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String input;
        
        String word1, word2;
        int order;
        
        int numWords;
        String [] words;
        StringTokenizer breakWords;
        
        /*System.out.println("Enter words to ALPHABETIZE: ");
        input = scan.nextLine();
        
        breakWords = new StringTokenizer(input);
        numWords = breakWords.countTokens();
        words = new String [numWords];
        
        for (int i = 0; i <= numWords; i ++)
        {
            words[i] = breakWords.nextToken();
        }   */
        System.out.println("Enter words 1 to ALPHABETIZE: ");
        word1 = scan.next();
        System.out.println("Enter words 2 to ALPHABETIZE: ");
        word2 = scan.next();
        order = compareTo(word1, word2);
        System.out.println(order);
    }
    
    public static String []order(String [] words)
    { 
        String word1 = "";
        String word2 = "";
        
        String [] orderWords = new String [words.length];
        
         return orderWords;
    }
    
    public static int compareTo(String word1, String word2)
    {
        String first, second, before = "";
        char ch1, ch2;
        boolean stop = false;
        int length, order;
        
        
        first = word1.toLowerCase();
        second = word2.toLowerCase();
        
        if (first.length() < second.length())
        {
            length = first.length();
        }
        else
        {
            length = second.length();
        }
        
        for (int i = 0; i < length && stop != true; i ++)
        {
            ch1 = first.charAt(i);
            ch2 = second.charAt(i);
            
            if ( ch1 < ch2)
            {
                before = first;
                stop = true;
            }
             else if ( ch2 < ch1)
            {
                before = second;
                stop = true;
            }
        }
        if (before.equals(first))
        {
            order = - 1;
        }
        else if (before.equals(second))
        {
            order = 1;
        }
        else
        {
            order = 0;
        }
        return order;

    }
}