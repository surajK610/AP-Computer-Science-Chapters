import java.util.*;

public class MagicSquare
{
    boolean magic = false;
    int add;
//    int [][] magicSq;  
    
    public int [][] input(int length, int width)
    {
        Scanner scn = new Scanner(System.in);
        
        int [][] scan = new int [length][width]; 
        for(int i = 0; i <= length - 1; i++)
        {
            for (int j = 0; j <= width - 1; j++)
            {
                System.out.println("Enter the value at " + i + ", " + j + ": ");
                 scan [i][j] = scn.nextInt(); 
            }
        }
        return scan;
    }
    
    private boolean sumRow15(int [][] sq)
    {
        boolean sum15 = false;
        int sum = 0;
        for(int i = 0; i < sq.length; i++)
        {
            for(int j = 0; j < sq[0].length; j ++)
            {
                sum += sq[i][j];
            }
            if(sum != add)
            {
                sum15 = false;
                break;
            }
            else
            {
                sum15 = true;
            }
            sum = 0;
        }
        return sum15;
    }
    
    private boolean sumCol15(int [][] sq)
    {
        boolean sum15 = false;
        int sum = 0;
        for(int i = 0; i < sq[0].length; i++)
        {
            for(int j = 0; j < sq.length; j ++)
            {
                sum += sq[j][i];
            }
            if(sum != add)
            {
                sum15 = false;
                break;
            }
            else
            {
                sum15 = true;
            }
            sum = 0;
        }
        return sum15;
    }
    
    private boolean sumDiag15(int [][] sq)
    {
        boolean sum15 = false;
        int sumD1 = 0, sumD2 = 0;
        for(int i = 0; i < sq[0].length; i++)
        {
            sumD1 += sq[i][i];
            
        }
        for(int i = 0; i < sq[0].length; i++)
        {
            sumD2 += sq[i][2 - i];
            
        }
        if (sumD1 == add && sumD2 == add)
        {
            sum15 = true;
        }
        return sum15;
    }
    
    public boolean isMagicSquare(int [][] magicSq, int add)
    {
        this.add = add;
        boolean magic = false;
        boolean sumR, sumC, sumD;
        sumR = sumRow15(magicSq); 
        sumC = sumCol15(magicSq); 
        sumD = sumDiag15(magicSq); 
        
        if((sumR == true) && (sumC == true) && (sumD == true))
        {
            magic = true;
        }
        return magic;
    }

}
