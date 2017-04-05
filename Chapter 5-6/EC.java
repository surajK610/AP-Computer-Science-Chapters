import java.util.*;
public class EC
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int [] primeNums = new int[10];
        int input;
        int sum = 0;
        
        int seven = 0, eleven = 0;
        
        boolean prime = true;
        
        for(int i = 0; i < primeNums.length; i ++)
        {
            System.out.println("Enter a prime number");
            input = scan.nextInt();
            
            for (int j = 2; j <= input/2; j ++)
            {
                if (input % j == 0)
                {
                    prime = false;
                    System.out.println("Not a prime nunber.");
                    i -=1;
                }
            }
            if (input == 7)
            {
                seven = i;
            }
            else if (input == 11)
            {
                eleven = i;
            }
            if (prime == true)
                {
                primeNums[i] = input;
                sum += input;
            }
            prime = true;
        }
        
        for (int x: primeNums)
        {
            System.out.print(x + "\t");
        }
        System.out.println("\nThe sum is " + sum);
        System.out.println("The index of seven or eleven is " + seven);
    }
}
