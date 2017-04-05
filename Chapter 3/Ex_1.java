//Ex_1.java

import java.text.DecimalFormat;

public class Ex_1
{
    public static void main (String [] args)
    {
      int sum = 0, value, count = 0;
      double average;

      System.out.print ("Enter an integer (0 to quit): ");
      value = Keyboard.readInt();
      
      if( value != 0 ){
      while (value != 0)  // sentinel value of 0 to terminate loop
      {
         count++;

         sum += value;
         System.out.println ("The sum so far is " + sum);

         System.out.print ("Enter an integer (0 to quit): ");
         value = Keyboard.readInt();
      }
      
      System.out.println ();
      System.out.println ("Number of values entered: " + count);

      average = (double)sum / count;

      DecimalFormat fmt = new DecimalFormat ("0.###");
      System.out.println ("The average is " + fmt.format(average));
    }
    else
    {
        System.out.println("You didn't enter a number");
    }
   }
}

