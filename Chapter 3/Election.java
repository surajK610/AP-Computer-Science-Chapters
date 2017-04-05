//Election.com
import java.util.Scanner;

public class Election
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner ( System.in );
        
        int voteP = 0, voteE = 0, countVoteP = 0, countVoteE = 0, countPrecP = 0, countPrecE = 0, countTie = 0;
        String decide = "y";
        
        System.out.println("Is there a precinct (y/n)? ");
        decide = sc.next();
        
        while (decide.equalsIgnoreCase("y"))
        {
            System.out.println("How many votes are for Polly? ");
            voteP = sc.nextInt();
            
            System.out.println("How many votes are for Ernest? ");
            voteE = sc.nextInt();
            
            if (voteP > voteE)
            {
                countPrecP ++;
            }
            else if (voteE > voteP)
            {
                countPrecE ++;
            }
            else 
            {
                countTie ++;
            }
            
            countVoteP += voteP;
            countVoteE += voteE;
            
            System.out.println("\nAre there more precincts (y/n)?");
            decide = sc.next();
            
        }
        
        System.out.println("\nPolly got " + countVoteP + " votes.");
        System.out.println("Ernest got " + countVoteE + " votes.");
        System.out.println("\nPolly won " + countPrecP + " precincts.");
        System.out.println("Ernest won " + countPrecE + " precincts.");
        System.out.println("There were " + countTie + " ties.");
        System.out.println("\nPolly got " + 100 * ((double)countVoteP)/(countVoteP + countVoteE) + " percent of votes.");
        System.out.println("Ernest got " + 100 * ((double)countVoteE)/(countVoteP + countVoteE) + " percent of votes.");
    }
}