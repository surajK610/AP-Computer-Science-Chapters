//********************************************************************
//  MinOfThree.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of nested if statements.
//********************************************************************

import java.util.*;

public class MinOfFour
{
   //-----------------------------------------------------------------
   //  Reads three integers from the user and determines the smallest
   //  value.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner nummerGetter = new Scanner (System.in); 
      int num1, num2, num3, num4, min = 0;

      System.out.println ("Enter four integers: ");
      num1 = nummerGetter.nextInt();
      num2 = nummerGetter.nextInt();
      num3 = nummerGetter.nextInt();
      num4 = nummerGetter.nextInt();
      if(num1 < num4)
      {
          if (num1 < num2){
             if (num1 < num3)
                min = num1;
             else
                min = num3;
            }
          else
          {
             if (num2 < num3)
                min = num2;
             else
                min = num3;
         }
        }
      else 
      {
         if (num4 < num2)
         {
             if (num4 < num3)
                min = num4;
             else
                min = num3;
        }
        else
        {
             if (num2 < num3)
                min = num2;
             else
                min = num3;
        }
      }
      System.out.println ("Minimum value: " + min);
      
      if (num1 < num2 && num1 < num3 && num1 < num4)
      {
          min = 1;
      }
      if (num2 < num1 && num2 < num3 && num2 < num4)
      {
          min = 1;
      }
      if (num3 < num2 && num3 < num1 && num3 < num4)
      {
          min = 1;
      }
      if (num4 < num2 && num4 < 3 && num4 < num1)
      {
          min = 1;
      }

      System.out.println ("Minimum value: " + min);
   }
}