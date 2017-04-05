//Poker.java

import java.util.*;

public class Poker
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        Random rn = new Random ();
        
        int ranSuit = 0, ranNum = 0;
        String suitU = "", numU = "";
        int deck[][]  = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13}};
                        
        int userHand[][]  = new int[5][2];
        int compHand[][]  = new int[5][2];
        
        for (int i = 0; i < 5; i ++)
        {
            ranSuit = rn.nextInt(4) + 1;
            ranNum = rn.nextInt(13) + 1;
            
            if ((ranSuit == userHand[0][0] && ranNum == userHand [0][1]) || (ranSuit == userHand[1][0] && ranNum == userHand [1][1])||(ranSuit == userHand[2][0] && ranNum == userHand [2][1])||(ranSuit == userHand[3][0] && ranNum == userHand [3][1])||(ranSuit == userHand[4][0] && ranNum == userHand [4][1]))
            {
                ranSuit = rn.nextInt(4) + 1;
                ranNum = rn.nextInt(13) + 1;
                if ((ranSuit == userHand[0][0] && ranNum == userHand [0][1]) ||(ranSuit == userHand[1][0] && ranNum == userHand [1][1])||(ranSuit == userHand[2][0] && ranNum == userHand [2][1])||(ranSuit == userHand[3][0] && ranNum == userHand [3][1])||(ranSuit == userHand[4][0] && ranNum == userHand [4][1]))
               {
                  ranSuit = rn.nextInt(4) + 1;
                  ranNum = rn.nextInt(13) + 1;
               }
            }
            userHand[i][0] = ranSuit;
            userHand[i][1] = ranNum;
            
            switch (ranSuit)
            {
                case 1:
                suitU = "Spades";
                break;
                
                case 2:
                suitU = "Hearts";
                break;
               
                case 3:
                suitU = "Diamonds";
                break;
                
                case 4:
                suitU = "Clubs";
                break;
            }
            switch (ranNum)
              {
                case 1:
                numU = "Ace";
                break;
                
                case 11:
                numU = "Jack";
                break;
               
                case 12:
                numU = "Queen";
                break;
                
                case 13:
                numU = "King";
                break;
                
                default:
                numU = Integer.toString(ranNum);
                break;
            }
            System.out.println( numU + " of " + suitU);
           
        }
        System.out.println();
        for (int i = 0; i < 5; i ++)
        {
            ranSuit = rn.nextInt(4) + 1;
            ranNum = rn.nextInt(13) + 1;
           
                        if ((ranSuit == userHand[0][0] && ranNum == userHand [0][1]) ||(ranSuit == userHand[1][0] && ranNum == userHand [1][1])||(ranSuit == userHand[2][0] && ranNum == userHand [2][1])||(ranSuit == userHand[3][0] && ranNum == userHand [3][1])||(ranSuit == userHand[4][0] && ranNum == userHand [4][1]))
            {
                ranSuit = rn.nextInt(4) + 1;
                ranNum = rn.nextInt(13) + 1;
                if ((ranSuit == userHand[0][0] && ranNum == userHand [0][1]) ||(ranSuit == userHand[1][0] && ranNum == userHand [1][1])||(ranSuit == userHand[2][0] && ranNum == userHand [2][1])||(ranSuit == userHand[3][0] && ranNum == userHand [3][1])||(ranSuit == userHand[4][0] && ranNum == userHand [4][1]))
               {
                  ranSuit = rn.nextInt(4) + 1;
                  ranNum = rn.nextInt(13) + 1;
               }
            } 
             else if ((ranSuit == compHand[0][0] && ranNum == compHand [0][1]) ||(ranSuit == compHand[1][0] && ranNum == compHand [1][1])||(ranSuit == compHand[2][0] && ranNum == compHand [2][1])||(ranSuit == compHand[3][0] && ranNum == compHand [3][1])||(ranSuit == compHand[4][0] && ranNum == compHand [4][1]))
            {
                ranSuit = rn.nextInt(4) + 1;
                ranNum = rn.nextInt(13) + 1;
                if ((ranSuit == compHand[0][0] && ranNum == compHand [0][1]) ||(ranSuit == compHand[1][0] && ranNum == compHand [1][1])||(ranSuit == compHand[2][0] && ranNum == compHand [2][1])||(ranSuit == compHand[3][0] && ranNum == compHand [3][1])||(ranSuit == compHand[4][0] && ranNum == compHand [4][1]))
               {
                  ranSuit = rn.nextInt(4) + 1;
                  ranNum = rn.nextInt(13) + 1;
               }
            } 
            compHand[i][0] = ranSuit;
            compHand[i][1] = ranNum;
            
                        switch (ranSuit)
            {
                case 1:
                suitU = "Spades";
                break;
                
                case 2:
                suitU = "Hearts";
                break;
               
                case 3:
                suitU = "Diamonds";
                break;
                
                case 4:
                suitU = "Clubs";
                break;
            }
            switch (ranNum)
              {
                case 1:
                numU = "Ace";
                break;
                
                case 11:
                numU = "Jack";
                break;
               
                case 12:
                numU = "Queen";
                break;
                
                case 13:
                numU = "King";
                break;
                
                default:
                numU = Integer.toString(ranNum);
                break;
            }
            System.out.println( numU + " of " + suitU);
        }
        
    }
}