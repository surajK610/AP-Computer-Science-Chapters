import java.util.*;

public class TWOD_Array
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int [][] TwoD = new int[2][2];
        
        for(int i = 0; i < TwoD[0].length; i ++)
        {
            for (int j = 0; j < TwoD.length; j ++)
            {
                System.out.printf("Enter a value into row %s column %s : ", i,  j );
                TwoD[i][j] = scan.nextInt();
            }
        }
        
         for(int i = 0; i < TwoD[0].length; i ++)
        {
            for (int j = 0; j < TwoD.length; j ++)
            {
                System.out.print(TwoD[i][j]);
            }
            System.out.println();
        }
    }
}
