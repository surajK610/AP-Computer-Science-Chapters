public class printHun
{
    public static void main (String [] args)
    {
        final int NUM_ROW = 5;
        
        for (int i = 1; i <= 100; i ++)
        {
            System.out.print( i + "\t");
            
            if (i % NUM_ROW == 0)
            {
                System.out.println();
            }
        }
    }
}