
/*Exercise WorkingWithStrings
 * -----------------------------------
 * This program does many methods 
 * using the String class.
 */
import java.util.Scanner;

public class WorkingWithStrings
{
    public static void main (String [] args)
    {
        Scanner getPhrase = new Scanner ( System.in );
       
        String phrase;
        System.out.println("Enter a String: ");
        phrase = Keyboard.readString();
        int phraseLength;   // number of characters in the phrase String
        int middleIndex;    // index of the middle character in the String
        String firstHalf;   // first half of the phrase String
        String secondHalf;  // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        
        phraseLength = phrase.length();
        
        middleIndex = (phraseLength/2 );
        
        firstHalf = phrase.substring( 0, middleIndex );
        secondHalf = phrase.substring( middleIndex );
        
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ', '*');
      
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println ("Middle three characters: " + phrase.substring(middleIndex - 1, middleIndex + 2));
        System.out.println ("Switched phrase: " + switchedPhrase);
        
        String city;
        String state;
        String modCityState;
        
        System.out.println("\nEnter your hometown city: ");
        city = Keyboard.readString();
        
        System.out.println("Enter your hometown state: ");
        state = Keyboard.readString();

        state = state.toUpperCase();
        modCityState = state.concat(city);
        modCityState = modCityState.concat(state);

        System.out.println(modCityState);
    }
}
