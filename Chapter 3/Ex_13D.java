
//Ex_13D.java


public class Ex_13D
{
    public static void main (String [] args)
    {
        final int MAX_ROWS = 10;
        int row, col;
        int spaces = 0;
        //PART d
        System.out.println("\nPart D)");
        for (row = 1; row <= MAX_ROWS/2; row ++)
        {
            for (spaces = 1; spaces <= MAX_ROWS/2 - row; spaces ++)
            {
                System.out.print(" ");
            }
            for (col =  1; col <= row * 2 -1; col ++)
            {
                System.out.print("*");   
            }
            System.out.println();
        }
         for (row = 1; row <= MAX_ROWS/2; row ++)
        {
            for (spaces =  1; spaces <= row -1; spaces ++ )                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
            {
                System.out.print(" ");
            }
            for (col = 1; col <= (MAX_ROWS/2 - row) * 2 + 1; col ++)
            {
                System.out.print("*");   
            }

            System.out.println();
        }
       }
    }
