import java.util.*;
public class Ex_1
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String another = "y";
        int input;
        int [] numbers = new int [51];
        
        System.out.println("Enter numbers from 0-50.");
        while(another.equalsIgnoreCase("y"))
        {
            input = scan.nextInt();
            numbers[input]++;
            System.out.println("Do another(y/n)?");
            another = scan.next();
        }
        
        for(int i = 0; i < numbers.length; i ++)
        {
            System.out.print("Number of " + i + "s : " + numbers[i] + "\t");
            
            if ((i + 1) % 5 == 0)
            {
                System.out.println();
            }
        }
    }
}
