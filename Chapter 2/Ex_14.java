/* File: Exercise 2.14
 * ---------------------------------------
 * This program ceates the snowman of listing 2.15
 * with two buttons on the upper torso, a frown instead of
 * a smile, a sun added in the upper right, my name in the
 * upper left, and the snowman 20 pixels to the right.
 */
import java.applet.Applet;
import java.awt.*;

public class Ex_14 extends Applet
{
    public void paint (Graphics page)
    { 
      final int MID = 150 + 20; // moves snowman 20 pixels to the right from the original Mid 150;
      final int TOP = 50;

      setBackground (Color.cyan);

      page.setColor (Color.blue);
      page.fillRect (0, 175, 300, 50);  // ground

      page.setColor (Color.yellow);
      page.fillOval (MID + 100, -40, 80, 80);  //  moves sun to upper left instead of upper right

      page.setColor (Color.white);
      page.fillOval (MID-20, TOP, 40, 40);      // head
      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso
      
      page.setColor (Color.red);
      page.fillOval (MID-5, TOP+40, 10, 10); //makes a button on the upper torso
      page.fillOval (MID-5, TOP+55, 10, 10); //makes a button on the upper torso

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

      page.drawArc (MID-10, TOP+20, 20, 10, -190, -160);   // makes the snowman frown

      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
      
      page.drawString ("Suraj Anand", 12, 20); // writes my name in the upper left corner
      
   }
}
    