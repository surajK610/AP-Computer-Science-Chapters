//LetterGrade.java
import java.util.Scanner;

public class LetterGrade
{
    public static void main (String [] args)
    {
        Scanner getGrade = new Scanner (System.in);
        double grade;
        
        System.out.println("Enter your grade as a percentage: ");
        grade = getGrade.nextDouble();
        
        if(grade >= 0 && grade <= 100)
        {
            if (grade >= 90)
            {
                System.out.println("You got an A.");
            }
             else if (grade >= 80)
            {
                System.out.println("You got a B.");
            }
            else if (grade >= 70)
            {
                System.out.println("You got a C.");
            }
            else if (grade >= 60)
            {
                System.out.println("You got a D.");
            }
            else 
            {
                System.out.println("You got a F.");
            }
        
        }
        else 
        {
            System.out.println("Invalid Input");
        }
    }
}