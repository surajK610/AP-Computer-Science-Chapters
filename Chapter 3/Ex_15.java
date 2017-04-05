//Ex_15.java
import java.util.*;

public class Ex_15
{
    public static void main (String [] args )
    {
        Scanner sc = new Scanner (System.in);
        Random rn = new Random();
        
        int play;
        int countTie = 0, countWin = 0, countLoss = 0;
        String userPlay, compPlay = "";
        String ifPlay = "y";
        
        while (ifPlay.equalsIgnoreCase("y"))
        {
            play = rn.nextInt(3) + 1;
            
            if (play == 1)
            {
                compPlay = "R";
            }
             else if (play == 2)
            {
                compPlay = "P";
            }
             else if (play == 3)
            {
                compPlay = "S";
            }
            
            System.out.println("Enter Rock, Paper, or Scissors (R, P, or S): ");
            userPlay = sc.next();
            
            
            System.out.println("You chose " + userPlay);
            System.out.println("The computer chose " + compPlay);
            if (!(userPlay.equalsIgnoreCase("r") || userPlay.equalsIgnoreCase("p") || userPlay.equalsIgnoreCase("s")))
            {
                System.out.println("INVALID INPUT");
            }
            else
            {
                if (compPlay.equalsIgnoreCase(userPlay))
                {
                    System.out.println("It was a tie");
                    countTie ++;
                }
                else if ((compPlay.equalsIgnoreCase("R") && userPlay.equalsIgnoreCase("S")) || (compPlay.equalsIgnoreCase("S") && userPlay.equalsIgnoreCase("P")) || (compPlay.equalsIgnoreCase("P") && userPlay.equalsIgnoreCase("R")))
                {
                    System.out.println("You LOSE!");
                    countLoss ++;
                }
                else 
                {
                    System.out.println("You WIN!");
                    countWin ++;
                }
             }
            
            
            
            System.out.println("Do you want to play again (y/n)?");
            ifPlay = sc.next();
        }
        
        System.out.println("\nYou tied " + countTie + " times.");
        System.out.println("You lost " + countLoss + " times.");
        System.out.println("You won " + countWin + " times.");
    }
}