/* File: Exercise 2.6
 * ---------------------------------------
 * This program converts hours, minutes, and seconds to only seconds.
 */
import java.util.Scanner;
public class Ex_6
{
   //-----------------------------------------------------------------
   // 1 hr = 60 min; 1 min = 60 sec
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      final int HR_TO_SEC = 3600;
      final int MIN_TO_SEC = 60;
      
      System.out.print("Enter the number of hours: ");
      int hours = input.nextInt();
      
      System.out.print("\nEnter the number of minutes: ");
      int minutes = input.nextInt();
      
      System.out.print("\nEnter the number of seconds: ");
      int seconds = input.nextInt();
      
      int totalSeconds;

      totalSeconds = hours * HR_TO_SEC + minutes * MIN_TO_SEC + seconds;

      System.out.println (hours + " hours, " + minutes + " minutes, and " + seconds + " seconds is equal to " + totalSeconds + " seconds.");
   }
}