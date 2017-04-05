//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

public class Driver
{
   //-----------------------------------------------------------------
   //  Creates two die objects, then rolls both dice a set number of
   //  times, counting the number of snake eyes that occur.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int addition2,addition3,addition4; 
      double addition2d, mult, div, sub;
      MathApps myopp = new MathApps();    // creates a six-sided die
      
      addition2d= myopp.add2(5.5,7.0);
      addition3= myopp.add3(5,7,8);
      addition4= myopp.add4(5,7,4,6);
      mult= myopp.mult( 30, 4);
      div= myopp.div(5, 7);
      sub = myopp.sub( 10, 2);
      System.out.println ("Number of total is: " + addition2d);
      System.out.println ("Number of total is: " + addition3);
      System.out.println ("Number of total is: " + addition4);
      System.out.println ("Number of total is: " + mult);
      System.out.println ("Number of total is: " + div);
      System.out.println ("Number of total is: " + sub);
   }
}
