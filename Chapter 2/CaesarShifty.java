//CaesarShifty
import java.util.Scanner;

public class CaesarShifty 
{
    public static void main (String [] args)
    {
        Scanner get = new Scanner (System.in);
        
        String phrase;
        String newPhrase;
        char key;
        char letter;
        char newLetter;
        System.out.println("Enter a String: ");
        phrase = get.nextLine();
        
        System.out.println("Enter a character to encrypt the String with: ");
        key = get.next().charAt(0);
        
        String str = "";
        
        for (int i = 0; i < phrase.length(); i++)
        {
         letter = phrase.charAt(i);
         if(letter >= 'a' && letter <= 'z')
        {
            newLetter = encryptLower(letter, key);
        }
        else if (letter >= 'A' && letter <= 'Z')
        {
            newLetter = encryptUpper(letter, key);
        }
        else 
        {
            newLetter = letter;
        }
         str = str + newLetter;
        }
        
        System.out.println(str);
       }
  
    
    public static char encryptLower (int letter, char key)
    {
       char newL = 'a';
       int encrypted;
        if (letter <= 'z' - key + 'a')
       {
        encrypted = letter - 'a' + key;  
        newL = (char) encrypted;
        }
       else 
       {
        encrypted = letter - 'z' + key + 'a' - 'b';
        newL = (char) encrypted;
       }
       return newL;
    }
    
    public static char encryptUpper (int letter, char key)
      {
       char newL = 'A';
       int encrypted;
       String keyString = key + "";
       String keyUpperCase = keyString.toUpperCase();
       key = keyUpperCase.charAt(0);
        if (letter <= 'Z' - key + 'A')
       {
        encrypted = letter - 'A' + key;  
        newL = (char) encrypted;
        }
       else 
       {
        encrypted = letter - 'Z' + key + 'A' - 'B';
        newL = (char) encrypted;
       }
       return newL;
    }
    
    
    char letter;
    String phrase;
    String newPhrase;
    }