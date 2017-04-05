//Ex_13B.java


public class Ex_13B
{
    public static void main (String [] args)
    {
        final int MAX_ROWS = 10;
        int row, col;

         //PART B
        int spaces;
        System.out.println("\nPart B)");
        for (row = 1; row <= MAX_ROWS; row ++)
        {
            for (spaces = MAX_ROWS - row; spaces >= 1; spaces -- )
            {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
       
    }
}