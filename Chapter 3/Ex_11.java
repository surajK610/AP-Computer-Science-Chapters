//Ex_11.java

import java.util.*;

public class Ex_11
{
       public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Random gen = new Random();
        
        int numToGuess;
        int guess = 1;
        int countHigh = 0, countLow = 0;
        String str;
        
        str = "yes";
       
        while (str.equals("yes"))
        {
            numToGuess = gen.nextInt(100) + 1;
           
            System.out.println("Enter your guess (integer between 1 and 100) or 0 to quit: ");
            guess = scan.nextInt();
    
            while(guess != numToGuess && guess != 0)
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
                    System.out.println("Enter your guess (integer between 1 and 100) or 0 to quit: ");
                    guess = scan.nextInt();
                }
            if (guess == numToGuess)
            {
                System.out.println();
                System.out.println("Your guess was right! ");
                System.out.println("You guessed " + (countHigh + countLow) + " times before getting it right.");
                System.out.println("You guessed " + countHigh + " times too high.");
                System.out.println("You guessed " + countLow + " times too low.");
                
            }
            else if (guess == 0)
            {
                System.out.println("You quit.");
             
            }
            System.out.println("\nDo you want to play again (yes/no) ? ");

            str = scan.next();
        }
    }

    }
   