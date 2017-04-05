//CardDeck.java

import java.util.*;

public class CardDeck
{
    public static int [][] newDeck()
    {
        int [][] deck ={{1,2,3,4,5,6,7,8,9,10,11,12,13},
                        {1,2,3,4,5,6,7,8,9,10,11,12,13},
                        {1,2,3,4,5,6,7,8,9,10,11,12,13},
                        {1,2,3,4,5,6,7,8,9,10,11,12,13}};
                        
        return deck;
    }

    public static int[] chooseNextCard(int[][]deck)
    {
         Random ran = new Random ();
         int cardNum, cardSuit;
    
         int suit = ran.nextInt (4);
         int num = ran.nextInt (13);
         
         while (deck[suit][num] == 0)
         {
             suit = ran.nextInt (4);
             num = ran.nextInt (13);   
         }
         
         cardNum = deck[suit][num];
         cardSuit = suit;
         
         int [] card = {cardSuit, cardNum};
         
         deck[suit][num] = 0;
         
         return card;
    }
    
    public static String getCard ( int [][]card, int whichCard )
    {
        int uCardSuit = card [whichCard][0];
        int uCardNum = card [whichCard][1];
        String suitU = "";
        String numU = "";
        String cardName;
        switch (uCardSuit + 1)
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
            switch (uCardNum)
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
                numU = Integer.toString(uCardNum);
                break;
        }
        
        cardName = "The " + numU + " of " + suitU;
        return cardName;
    }
    
   public static void  getOrder( int [][]card)
    {     int order;
        if (card [0][1] < card [1][1] && card [0][1] < card [2][1] && card [0][1] < card [3][1] && card [0][1] < card [4][1])
        {
            if (card [1][1] < card [2][1] && card [1][1] < card [3][1] && card [1][1] < card [4][1])
            {
                if (card [2][1] < card [3][1] && card [2][1] < card [4][1])
                {
                    if (card [3][1] < card [4][1])
                    {
                        order = 01234;
                    }
                    else if (card [4][1] < card [3][1])
                    {
                        order = 01243;
                    }
                }
                else if (card [3][1] < card [2][1] && card [3][1] < card [4][1])
                {
                    if (card [2][1] < card [4][1])
                    {
                        order = 01324;
                    }
                    else if (card [4][1] < card [2][1])
                    {
                        order = 01342;
                    }
                }
                else if (card [4][1] < card [2][1] && card [4][1] < card [3][1])
                {
                    if (card [2][1] < card [3][1])
                    {
                        order = 01423;
                    }
                    else if (card [3][1] < card [2][1])
                    {
                        order = 01432;
                    }
                }
            }
            else if (card [2][1] < card [1][1] && card [2][1] < card [3][1] && card [2][1] < card [4][1])
            {

            }
            else if (card [3][1] < card [1][1] && card [3][1] < card [2][1] && card [3][1] < card [4][1])
            {
            }
            else if (card [4][1] < card [1][1] && card [4][1] < card [3][1] && card [4][1] < card [2][1])
            {
            }
        }
        else if (card [0][1] > card [1][1])
        {
        }
    }
   /* public static boolean haveStraightFlush(int card [][])
    {
    }
  public static boolean haveFourOfAKind()
    {
        boolean fourKind = false;
        if ((card [0][1] == card [1][1]) && (card [0][1] == card [2][1]) && (card [0][1] == card [3][1]) && (card [0][1] == card [4][1]))
        {
            fourKind = true;
        }
        return fourKind;
    }
    public static boolean haveFullHouse()
    {
    }*/
    public static boolean haveFlush( int card [][] )
    { 
        boolean flush = false; 
        if ((card [0][0] == card [1][0]) && (card [0][0] == card [2][0]) && (card [0][0] == card [3][0]) && (card [0][0] == card [4][0]))
        {
            flush = true;
        }
        return flush;
    }
    public static boolean haveStraight( int card [][] )
    {
        boolean straight = false;
        return straight;
    }
    public static boolean haveThreeOfAKind(int card [][])
    {
        int numThreeKind = 0;
        boolean threeKind = false;
        
        for (int i = 0; i < 5; i ++)
        {
            for (int j = 1; j < 5; j ++)
            {
                for (int k = 2; k < 5; k ++)
                {
                    if (card [i][1] == card[j][1] && card [i][1] == card [k][1])
                    {
                       numThreeKind ++;  
                    }
                }
            }
       }
       if (numThreeKind == 1)
       {
           threeKind = true;
       }
       return threeKind;
    }
    public static boolean haveTwoPair(int card [][])
    {   
        int countPair = 0;
        boolean twoPair;
        for (int i = 0; i < 5; i ++)
        {
            for (int j = 1; j < 5; j ++)
            {
                if (card [i][1] == card [j][1])
                {
                    countPair++;
                }
            }
        }
        if (countPair == 2)
        {
            twoPair = true;
        }
        else 
        {
            twoPair = false;
        }
        return twoPair;
    }
    public static boolean haveOnePair(int card [][])
    {
        int countPair = 0;
        boolean onePair;
        for (int i = 0; i < 5; i ++)
        {
            for (int j = 1; j < 5; j ++)
            {
                if (card [i][1] == card [j][1])
                {
                    countPair++;
                }
            }
        }
        if (countPair == 1)
        {
            onePair = true;
        }
        else 
        {
            onePair = false;
        }
        return onePair;
    }
   /*public static boolean haveHighCard()
    {
    }
    
    public static String WhatHave()
    {
        
    }*/
}