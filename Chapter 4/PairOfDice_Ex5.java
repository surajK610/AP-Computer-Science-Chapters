//********************************************************************
//  Die_Ex4.java       Author: Lewis/Loftus/Cocking
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and the number of faces on the die.
//********************************************************************

import java.util.Random;
public class PairOfDice_Ex5
{
   private final int MIN_FACES = 4;

   private static Die_Ex3 die1;
   private static Die_Ex3 die2;
   
   private static Random generator = new Random();
   private int numFaces1, numFaces2;   // number of sides on the die
   private int faceValue1, faceValue2;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Defaults to two six-sided die. Initial face value is 1.
   //-----------------------------------------------------------------
   public PairOfDice_Ex5 ()
   {
         die1 = new Die_Ex3();
         die2 = new Die_Ex3();
         numFaces1 = 6;
         numFaces2 = 6;
         faceValue1 = die1.getFaceValue();
         faceValue2 = die2.getFaceValue();
   }


   public PairOfDice_Ex5 (int faces1, int faces2)
   {
      die1 = new Die_Ex3(faces1);
      die2 = new Die_Ex3(faces2);
      numFaces1 = faces1;
      numFaces2 = faces2;
      faceValue1 = die1.getFaceValue();
      faceValue2 = die2.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public void roll ()
   {
      faceValue1 = die1.roll();
      faceValue2 = die2.roll();
   }

   //-----------------------------------------------------------------
   //  Returns the current die value.
   //-----------------------------------------------------------------
   public int getFaceValue (int die)
   {
      int faceValue = 0;
      if (die == 1 )
        faceValue = die1.getFaceValue();
      else if (die == 2 )
        faceValue = die2.getFaceValue();
      return faceValue;
   }
}