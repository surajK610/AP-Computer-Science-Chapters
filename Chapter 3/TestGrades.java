//TestGrades.java

import java.util.*;

public class TestGrades
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int score = 0, count = 0, total = 0, highest = 0, lowest = 100;
        double average;
        String moreGrades = "y";
        
        while (moreGrades.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a grade: ");
            score = scan.nextInt();
            
            total += score;
            count ++;
            
            if (score < lowest)
            {
                lowest = score;
            }
             else if (score > highest)
            {
                highest = score;
            }
            
            System.out.println("Are there more grades (y/n)? ");
            moreGrades = scan.next();
        }
        
        average = (double) total/ count;
        
        System.out.println("The number of students is " + count); 
        System.out.println("The average is " + average);
        System.out.println("The lowest is " + lowest);
        System.out.println("The highest is " + highest);
    }
}