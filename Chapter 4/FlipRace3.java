//********************************************************************
//  FlipRace3.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the existence of separate data space in multiple
//  instantiations of a programmer-defined class.
//********************************************************************

public class FlipRace3
{
   //-----------------------------------------------------------------
   //  Flips two coins until one of them comes up heads three times
   //  in a row.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int GOAL = 8;
      final int GOALT = 4;
      final int GOALH = 4;
      int count1T = 0, count2T = 0, count3T = 0;
      int count1H = 0, count2H = 0, count3H = 0;
      
     int coinH0 = -1, coinH1 = -1, coinH2 = -1, coinH3 = -1, coinT0 = -2, coinT1 = -2, coinT2 = -2, coinT3 = -2, both = 1;
    
     
      boolean t = true;

      // Create two separate coin objects
      Coin coin1 = new Coin();
      Coin coin2 = new Coin();
      Coin coin3 = new Coin ();
      while (t)
      {
          while (count1H < GOALH && count2H < GOALH && count3H < GOALH)
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
                count1H++;
             else
                count1H = 0;
             if (coin2.isHeads())
                count2H++;
             else
                count2H = 0;
             if (coin3.isHeads())
                count3H++;
             else
                count3H = 0;
                
             if (count1H == GOALH && count2H == GOALH && count3H == GOALH)
             {
                 coinH0 = 0;
                }
                else 
                coinH0 = -2;
              if (count1H == GOALH)
             {
                 coinH1 = 1;
                }
                else 
                coinH1 = -2;
              if (count2H == GOALH)
             {
                 coinH2 = 2;
                }
                else 
                coinH2 = -2;
              if (count3H == GOALH)
             {
                 coinH3 = 3;
                }
                else 
                coinH3 = -2;
          }
          while (count1T < GOALT && count2T < GOALT && count3T < GOALT && (both == 1))
          {
             coin1.flip();
             coin2.flip();
             coin3.flip();
    
             // Print the flip results (uses Coin's toString method)
             System.out.print ("Coin 1: " + coin1);
             System.out.print ("   Coin 2: " + coin2);
             System.out.println ("  Coin 3: " + coin3);
    
             // Increment or reset the counters
             if (coin1.isTails())
                count1T++;
             else
                count1T = 0;
             if (coin2.isTails())
                count2T++;
             else
                count2T = 0;
             if (coin3.isTails())
                count3T++;
             else
                count3T = 0;
                
             if (count1T == GOALT && count2T == GOALT && count3T == GOALT)
             {
                 coinT0 = 0;
                }
                else 
                coinT0 = -1;
              if (count1T ==GOALT)
             {
                 coinT1 = 1;
                }
                else coinT1 = -1;
             if (count2T == GOALT)
             {
                 coinT2 = 2;
                 }
                else coinT2 = -1;
              if (count3T == GOALT)
             {
                 coinT3 = 3;
                 }
                else coinT3 = -1;
          }
          
          if (coinH1 == coinT1)
          {
              t = false;
            }
          if (coinH2 == coinT2)
          {
              t = false;
            }
          if (coinH3 == coinT3)
          {
              t = false;
            }

            count1H = 0;
            count2H = 0;
            count3H = 0;
            count1T = 0;
            count2T = 0;
            count3T = 0;
        }

      // Determine the winner
      if (coinH0 == 0 && coinT0 == 0)
            System.out.println ("It's a TIE!");
       else 
       {
       if ( coinT1 == 1 && coinH1 == 1)
         System.out.println ("Coin 1 Wins!");
       if (coinT2 == 2 && coinH2 == 2)
            System.out.println ("Coin 2 Wins!");
       if (coinT3 == 3 && coinH3 == 3)
            System.out.println ("Coin 3 Wins!");
        }
        }
    }