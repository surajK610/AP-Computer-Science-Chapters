//PokerClass.java

import java.util.*;

public class PokerClass
{
    public static void main (String [] args)
    {
        int [][] uCard = new int [5][2];//First column has the suit, second has number
        int [][] cCard = new int [5][2];//First column has the suit, second has number
        
        String[]uCardName = new String [5];
        String[]cCardName = new String [5];
        
        int [][] deck;
        deck = CardDeck.newDeck();
        
        
        for (int i = 0; i < 5; i ++)
       {   uCard[i] = CardDeck.chooseNextCard(deck);
            
           System.out.println(uCard[i][0] + " " + uCard[i][1]);
            
           uCardName[i] = CardDeck.getCard (uCard, i);
           System.out.println(uCardName[i]);
       }
       System.out.println();
        for (int i = 0; i < 5; i ++)
       {   cCard[i] = CardDeck.chooseNextCard(deck);
            
           System.out.println(cCard[i][0] + " " + cCard[i][1]);
            
           cCardName[i] = CardDeck.getCard (cCard, i);
           System.out.println(cCardName[i]);
       }
        
        
    }
}