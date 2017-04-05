//Ex_13C.java


public class Ex_13C
{
    public static void main (String [] args)
    {
        final int MAX_ROWS = 10;
        int row, col;
         //PART C
         int spaces = 0;
        System.out.println("\nPart C)");
        for (row = 1; row <= MAX_ROWS; row ++)
        {
            for (spaces = 1; spaces < row; spaces ++)
            {
                System.out.print(" ");
            }
            for (col = MAX_ROWS - row; col >= 0; col -- )
            {
                System.out.print("*");
                
            }

            System.out.println();
        }
        
    }
}