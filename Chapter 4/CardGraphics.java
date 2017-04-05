import java.applet.Applet;
import java.awt.*;
public class CardGraphics
{
    final private int height = 200;
    final private int width = 115;
    private int xLoc;
    private int yLoc;
    private String number;
    private String suit;
    private Font font = new Font("Arial", Font.BOLD, 16);
    private Font fontLetter = new Font("Arial", Font.BOLD, 24);
    public CardGraphics(int x, int y, String suitA, String num)
    {
        xLoc = x;
        yLoc = y;
        number = num;
        suit = suitA;
    }
    public void draw( Graphics page )
    {
        
        page.setColor(Color.WHITE);
        page.fillRect(xLoc, yLoc, width, height);
        page.setFont(fontLetter);
        if(suit.equals("Diamonds") )
        {
            page.setColor(Color.RED);
            page.drawString("D", xLoc + width/2 - 10, yLoc + height/2);
        }
        else if (suit.equals("Hearts"))
        {
            page.setColor(Color.RED);
            page.drawString("H", xLoc + width/2 - 10, yLoc + height/2);
        }
        else if (suit.equals("Spades"))
        {
            page.setColor(Color.BLACK);
            page.drawString("S", xLoc + width/2 - 10, yLoc + height/2);
        }
        else if (suit.equals("Clubs"))
        {
            page.setColor(Color.BLACK);
            page.drawString("C", xLoc + width/2 - 10, yLoc + height/2);
        }
        page.setFont(font);
        page.drawString(number, xLoc + 10, yLoc + 16);
        page.drawString(number, xLoc + width - 20, yLoc + height - 8);
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setX(int x)
    {
        xLoc = x;
    }
    public void setY(int y)
    {
        yLoc = y;
    }
    public void setNumber(String num)
    {
        number = num;
    }
    public void setSuit(String suitA)
    {
        suit = suitA;
    }


}
