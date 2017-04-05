
/* SquareOval.java
 * ---------------------------------------
 * This creates a square in an oval in an square and
 * so on...
 */

import java.awt.*;
import java.applet.Applet;
import javax.swing.Timer;
public class SquareOval extends Applet
{
    public void paint( Graphics page ) 
    {
        side = 256;
        corner = 50;
        int x = 0;
        while (x <= 15)
        {
            page.setColor( Color.red );
            page.fillRect ( (int)corner, (int)corner, (int)side, (int)side ); 
            try{Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}

            
            page.setColor( Color.blue );
            page.fillOval ( (int)corner, (int)corner, (int)side, (int)side );
        
            try{Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            
            corner = createCorner ( (int)corner );
            side = createSide ( (int)side );
            
            x++;
        }
    }
    public int createCorner ( int c )
    {
        corner = corner + (((side * (Math.sqrt(2))/2)- side/2)/Math.sqrt(2));
        return (int) corner;
    }
    public int createSide ( int s )
    {
        side = side - ((((int)side * (Math.sqrt(2))/2)- side/2)/Math.sqrt(2)) * 2;
        return (int) side;
    }
    
    double corner, side; 
}