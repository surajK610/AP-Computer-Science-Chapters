//Ex_13A.java


public class Ex_13A
{
    public static void main (String [] args)
    {
        final int MAX_ROWS = 10;
        int row, col;
        
        //PART A
        System.out.println("\nPart A)");
        for (row = MAX_ROWS; row >= 1; row --)
        {
            for (col = row; col >= 1; col --)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
}