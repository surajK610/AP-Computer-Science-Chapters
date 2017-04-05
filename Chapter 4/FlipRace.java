//********************************************************************
//  FlipRace.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the existence of separate data space in multiple
//  instantiations of a programmer-defined class.
//********************************************************************

public class FlipRace
{
   //-----------------------------------------------------------------
   //  Flips two coins until one of them comes up heads three times
   //  in a row.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int GOAL = 5;
      int count1 = 0, count2 = 0, count3 = 0;

      // Create two separate coin objects
      Coin coin1 = new Coin();
      Coin coin2 = new Coin();
      Coin coin3 = new Coin ();

      while (count1 < GOAL && count2 < GOAL && count3 < GOAL)
      {
         coin1.flip();
         coin2.flip();
         coin3.flip();

         // Print the flip results (uses Coin's toString method)
         System.out.print ("Coin 1: " + coin1);
         System.out.print ("   Coin 2: " + coin2);
         System.out.println ("  Coin 3: " + coin3);

         // Increment or reset the counters
         if (coin1.isHeads())
            count1++;
         else
            count1 = 0;
         if (coin2.isHeads())
            count2++;
         else
            count2 = 0;
         if (coin3.isHeads())
            count3++;
         else
            count3 = 0;
      }

      // Determine the winner
      if (count1 == GOAL && count2 == GOAL && count3 == GOAL)
            System.out.println ("It's a TIE!");
      else if (count1 == GOAL)
         System.out.println ("Coin 1 Wins!");
      else if (count2 == GOAL)
            System.out.println ("Coin 2 Wins!");
      else if (count3 == GOAL)
            System.out.println ("Coin 3 Wins!");
     
   }
}