import java.util.*;
import java.awt.*;
import java.applet.*;
public class Ex_8Card
{
    private Random ran = new Random();
    private int cardNum;
    private int cardSuit;
    private String num;
    private String suit;
    
    private Ex_8Card card1, card2;

    public Ex_8Card()
    {
       cardNum = ran.nextInt(13) + 1;
       cardSuit = ran.nextInt(4) + 1;
       
    }
    
    
    public Ex_8Card(int Num, int Suit)
    {
       cardNum = Num;
       cardSuit = Suit;
       
    }
    
    public void setNum( int num)
    {
        cardNum = num;
    }
    
    public void setSuit( int suit)
    {
        cardSuit = suit;
    }
    
    public void Draw()
    {
        cardNum = ran.nextInt(13) + 1;
       cardSuit = ran.nextInt(4) + 1;
       
    }
    
    public boolean ifEqual(Ex_8Card card)
    {
        boolean check = false;
        if (cardNum == card.getNum() && cardSuit == card.getSuit())
            check = true;
        return check;
    }
    
        public void make20CardsNoRep()
    {
        int numOfCards = 20;
        int suitA, numA;
        String c1, cardSpec;
        String cards = "000000000000000000000000000000000000000000000000000000000000";
        for (int i = 0; i < numOfCards; i ++)
        {
            Draw();
            suitA = cardSuit;
            numA = cardNum;
            c1 = Integer.toString(suitA * 100 + numA);

            
            while (c1.equals(cards.substring(0, 3)) || c1.equals(cards.substring(3, 6)) || c1.equals(cards.substring(6,9)) || c1.equals(cards.substring(9, 12)) || c1.equals(cards.substring(12, 15)) || c1.equals(cards.substring(15,18))
            || c1.equals(cards.substring(18, 21)) || c1.equals(cards.substring(21, 24)) || c1.equals(cards.substring(24,27)) || c1.equals(cards.substring(27, 30)) || c1.equals(cards.substring(30, 33)) || c1.equals(cards.substring(33,36))
            || c1.equals(cards.substring(36, 39)) || c1.equals(cards.substring(39, 42)) || c1.equals(cards.substring(42,45)) || c1.equals(cards.substring(45, 48)) || c1.equals(cards.substring(48, 51)) || c1.equals(cards.substring(51,54))
            || c1.equals(cards.substring(54, 57)) || c1.equals(cards.substring(57, 60)))
            {

                  Draw();
                  suitA = cardSuit;
                  numA = cardNum;
                  c1 = Integer.toString(suitA * 100 + numA);
            }
            cards += c1;  
            cards = cards.substring(3);
            //System.out.print(c1 + "\t");
            System.out.println(getNum(numA) + " of " + getSuit(suitA));
                
        }
        //System.out.println(cards);
    }
    
        public void makeCardsNoRep( int numOfCards, Ex_8Card[] card)
    {
        
        int xLoc = 50, yLoc = 50;
        int suitA, numA;
        String c1, cardSpec;
        String cards = "";
        int count = 0;

        for (int i = 1; i <= numOfCards; i ++)
        {
            Draw();
            suitA = cardSuit;
            numA = cardNum;
            c1 = Integer.toString(suitA * 100 + numA);
            for (int j = 0; j <= cards.length()-1; j +=3)
            {
                cardSpec = cards.substring(j, j + 3);
                while (cardSpec.equals(c1))
                {
                    Draw();
                    suitA = cardSuit;
                    numA = cardNum;
                    c1 = Integer.toString(suitA * 100 + numA);
                    j = -3;
                }
            }
            cards += c1;  
            
            card[i - 1] = new Ex_8Card(numA, suitA);
            System.out.println(getNum(numA) + " of " +  getSuit(suitA));
        }
    }
    
       /* public void makeCardsNoRep(Graphics page, int numOfCards)
    {
        //int numOfCards = 20;
        int xLoc = 50, yLoc = 50;
        int suitA, numA;
        String c1, cardSpec;
        String cards = "";
        CardGraphics newCard = new CardGraphics(xLoc, yLoc, "Spades", "1");
        for (int i = 1; i <= numOfCards; i ++)
        {
            Draw();
            suitA = cardSuit;
            numA = cardNum;
            c1 = Integer.toString(suitA * 100 + numA);
            for (int j = 0; j <= cards.length()-1; j +=3)
            {
                cardSpec = cards.substring(j, j + 3);
                while (cardSpec.equals(c1))
                {
                    Draw();
                    suitA = cardSuit;
                    numA = cardNum;
                    c1 = Integer.toString(suitA * 100 + numA);
                    j = -3;
                }
            }
            cards += c1;  

            newCard.setX(xLoc);
            newCard.setY(yLoc);
            newCard.setNumber(getNumber(numA));
            newCard.setSuit(getSuit(suitA));
          
            newCard.draw(page);
            
            xLoc += newCard.getWidth() + 10;
            if (i % 5 == 0)
            {
                xLoc = 50;
                yLoc += newCard.getHeight() + 10;
            }
        }
    }*/

    public int getSuit()
    {
        return cardSuit;
    }
    
    public int getNum()
    {
        return cardNum;
    }
    
    public String getSuit(int Suit)
    {   
        switch (Suit)
            {
                case 1:
                suit = "Spades";
                break;
                
                case 2:
                suit = "Hearts";
                break;
               
                case 3:
                suit = "Diamonds";
                break;
                
                case 4:
                suit = "Clubs";
                break;
            }
        
        return suit;
    }
    
    public String getNum(int Num)
    {   
        switch (Num)
            {
                case 1:
                num = "Ace";
                break;
                
                case 2:
                num = "Two";
                break;
               
                case 3:
                num = "Three";
                break;
                
                case 4:
                num = "Four";
                break;
                
                case 5:
                num = "Five";
                break;
                
                case 6:
                num = "Six";
                break;
                
                case 7:
                num = "Seven";
                break;
                
                case 8:
                num = "Eight";
                break;
                
                case 9:
                num = "Nine";
                break;
                
                case 10:
                num = "Ten";
                break;
                
                case 11:
                num = "Jack";
                break;
                
                case 12:
                num = "Queen";
                break;
                
                case 13:
                num = "King";
                break;
                
                default:
                num = "Invalid";
                break;
            }
        
        return num;
    }
    
    public String getNumber(int Num)
    {   
        switch (Num)
            {
                case 1:
                num = "A";
                break;
               
                case 11:
                num = "J";
                break;
                
                case 12:
                num = "Q";
                break;
                
                case 13:
                num = "K";
                break;
                
                default:
                num = Integer.toString(Num);
                break;
            }
        
        return num;
    }
    }

  