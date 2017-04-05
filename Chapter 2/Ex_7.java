/* File: Exercise 2.7
 * ---------------------------------------
 * This program converts seconds to hours, minutes, and seconds.
 */
import java.util.Scanner;
public class Ex_7
{
   //-----------------------------------------------------------------
   // 1 hr = 60 min; 1 min = 60 sec
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int HR_TO_SEC = 3600;
      final int MIN_TO_SEC = 60;
      
      System.out.print("Enter the number of seconds: ");
      int totalSeconds = input.nextInt();
      
      
      int hours, minutes, seconds, totalSeconds1, totalSeconds2;

      hours = totalSeconds / HR_TO_SEC;
      totalSeconds1 = totalSeconds % HR_TO_SEC;
      
      minutes = totalSeconds1 / MIN_TO_SEC; 
      totalSeconds2 = totalSeconds1 % MIN_TO_SEC;
      
      seconds = totalSeconds2;

      System.out.println ( totalSeconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
   }
}