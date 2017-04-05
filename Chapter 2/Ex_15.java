/* File: Exercise 2.15
 * ---------------------------------------
 * This program ceates a smiley face with 
 * a nose, ears, a mounth, and eyes with 
 * pupils.
 */
import java.applet.Applet;
import java.awt.*;

public class Ex_15 extends Applet
{
    public void paint (Graphics page)
    { 
      final int MID = 250;
      final int TOP = 50;
      final int WIDTH = 500;
      final int HEIGHT = 500;
      
      page.drawOval (MID - 200, TOP, 400, 400);//draws face outline
      
      page.drawOval (MID - 100, TOP + 110, 40, 40);//draws eye
      page.drawOval (MID + 80, TOP + 110, 40, 40);//draws eye
      
      page.setColor (Color.black);
      page.fillOval (MID - 90, TOP + 130, 20, 20);//draws pupil
      page.fillOval (MID + 90, TOP + 130, 20, 20);//draws pupil
      
      page.drawLine (MID, TOP + 180, MID + 30, TOP + 230);//draws nose
      page.drawLine (MID, TOP + 230, MID + 30, TOP + 230);//draws nose
      
      page.drawArc (MID - 225, TOP + 150, 30, 50, 30, 290);
      page.drawArc (MID + 195, TOP + 150, 30, 50, 150, -290);
      
      page.drawArc (MID - 75, TOP + 240, 150, 100, 180, 180);//draws mouth
      page.drawLine (MID - 75, TOP + 290, MID + 75, TOP + 290);//draws mouth


      
   }
}