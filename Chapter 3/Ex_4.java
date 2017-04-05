//Ex_4.java

import java.util.Scanner;

public class Ex_4
{
    public static void main (String [] args)
    {
        final int INCREMENT_NUM = 2;
        
        Scanner getNum = new Scanner (System.in);
        int numInput, num, numEven, total;
        
        total = 0;
        numEven = 0;
        System.out.println("Enter a number greater or equal to 2: ");
        numInput = getNum.nextInt();
        
    if (numInput >= 2)
    {   
        while (numEven <= numInput)
        {
            total += numEven;
            numEven += INCREMENT_NUM;
        }
        System.out.println("The sum of all even numbers between 2 and " + numInput + " is " + total);
    }
    else 
    {
        System.out.println("Invalid Input");
    }
    }
}