import java.util.*;
public class Ex_8DeckDrive
{
     public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Ex_8DeckOfCards deck = new Ex_8DeckOfCards();
        Ex_8Card card1;
        Ex_8Card card2;
        
        deck.shuffle();
        String another = "y";
        while(another.equalsIgnoreCase("y"))
            {
            card1 = deck.deal(); 
            
            System.out.println(card1.getNum(card1.getNum()) + "  of  " + card1.getSuit(card1.getSuit()));
            System.out.println(deck.numCards());
            
            System.out.println("Another Card(y/n)");
            another = scan.next();
            
        }
    
    }

 
}
