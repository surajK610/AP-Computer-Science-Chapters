//GuessingGame.java

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Random gen = new Random();
        
        int numToGuess;
        int guess;
        int countHigh = 0, countLow = 0;
        
        numToGuess = gen.nextInt(10) + 1;
        
        System.out.println("Enter your guess (integer between 1 and 10): ");
        guess = scan.nextInt();
        
        while(guess != numToGuess)
        {
            if (guess > numToGuess)
            {
                countHigh++;
                System.out.println("Your guess was too high. ");
            }
            else if (guess < numToGuess)
            {
                countLow++;
                System.out.println("Your guess was too low. ");
            }
            System.out.println("Enter your guess (integer between 1 and 10): ");
            guess = scan.nextInt();
        }
        
        System.out.println();
        System.out.println("Your guess was right! ");
        System.out.println("You guessed " + (countHigh + countLow) + " times before getting it right.");
        System.out.println("You guessed " + countHigh + " times too high.");
        System.out.println("You guessed " + countLow + " times too low.");
    }
}