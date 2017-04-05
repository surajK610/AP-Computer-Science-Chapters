//Ex_5.java

import java.util.Scanner;

public class Ex_5
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        String line;
        String line2 = "";
        char letter;
        System.out.print("Enter a String: ");
        line = scan.nextLine();
        
        for (int i = 0; i < line.length(); i++)
        {
            letter = line.charAt(i);
            System.out.println(letter);
            
        }
    }
}