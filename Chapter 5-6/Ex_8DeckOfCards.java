import java.util.*;
public class Ex_8DeckOfCards
{
    Ex_8Card [] deck;
    public Ex_8DeckOfCards()
    {
       deck = new Ex_8Card [52]; 
       for(int i = 0; i < 52; i ++)
       {
           deck[i] = new Ex_8Card();
        }
    }
    
    public Ex_8Card [] shuffle ()
    {
        Random ran = new Random ();
        int c1 = 0, c2 = 0;
        Ex_8Card temp;
        for (int i = 0; i <= 300; i ++)
        {
            c1 = ran.nextInt(52);
            c2 = ran.nextInt(52);
            
            temp = deck[c1];
            
            deck[c1] = deck[c2];
            deck[c2] = temp;
        }
        
        
        return deck;
    }
    
    public Ex_8Card deal()
    {
        Random ran = new Random();
        Ex_8Card cardN;
        int card = ran.nextInt(52);
        while(deck[card].getNum() == 0)
        {
            card = ran.nextInt(52);
        }
        
        cardN = new Ex_8Card (deck[card].getNum(), deck[card].getSuit());
        
        deck[card].setNum(0);
        deck[card].setSuit(0);
        
        return cardN;
    }
    
    
    public int numCards()
    {
        int count = 0;
        
        for(Ex_8Card card: deck)
        {
            if (card.getNum() != 0)
            {
                count ++;
            }
        }
        return count;
    }
    
   
}
