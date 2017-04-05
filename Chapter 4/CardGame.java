import java.awt.*;
import java.applet.*;

public class CardGame extends Applet
{
    public void paint (Graphics page) 
    {
        setBackground(Color.GREEN);
        Card_Ex6 card = new Card_Ex6();
        card.makeCardsNoRep(page,20);
    }
}