//Pig_Ex4

import java.util.*;

public class BoxCars_Ex4
{
    public static void main (String [] args)
    {
        PairOfDice_Ex4 dice = new PairOfDice_Ex4();
        int faceVal1, faceVal2;
        int countBC = 0;
        
        for (int i = 0; i < 1000; i ++)
        {
            dice.roll();
            
            faceVal1 = dice.getFaceValue(1); 
            faceVal2 = dice.getFaceValue(2);
            
            System.out.print("Die1: " +  faceVal1);
            System.out.println("\tDie2: " + faceVal2);
            
            if (faceVal1 == 6 && faceVal2 == 6)
                countBC ++;
        }
        
        System.out.println("\nThe number of BoxCars(both dice 6s) is: " + countBC);
    }
}