//Diagnal.java

public class Diagnal
{
    public static void main (String [] args)
    {        
        for (int row = 1; row <= 100; row ++)
        {
            for (int spaces = 0; spaces < row - 1; spaces ++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}