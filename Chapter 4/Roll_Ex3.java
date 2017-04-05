//Roll_Ex3

import java.util.*;

public class Roll_Ex3
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Die_Ex3 die;
        int numFaces;
        int face;
        
        System.out.println("How many sides do you want on your die (Cannot be less than four)?");
        numFaces = scan.nextInt();
        
        die = new Die_Ex3 (numFaces);
        
        face = die.roll();
        
        System.out.println("You rolled " + face);
    }
}