//E13B.java
public class E13B
{
    public static void main (String [] args )
    {
        for (int row = 1; row <= 10; row ++)
        {
            for (int col = 1; col <= row; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
        
        for (int row = 1; row <= 10; row ++)
        {
            for (int col = 1; col <= 10 - row + 1; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = 1; row <= 10; row ++)
        {
            for (int space = 1; space <= 10 - row; space ++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
         for (int row = 1; row <= 10; row ++)
        {
            for (int space = 1; space <= row ; space ++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= 10 - row + 1; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = 1; row <= 5; row ++)
        {
            for (int space = 1; space <= 5 - row; space ++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= row * 2 - 1; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
                for (int row = 1; row <= 5; row ++)
        {
            for (int space = 1; space <= (row - 1); space ++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= (5 - row + 1) * 2 - 1; col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}