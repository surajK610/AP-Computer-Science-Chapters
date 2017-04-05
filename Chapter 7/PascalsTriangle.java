
/**
 * Write a description of class PascalsTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PascalsTriangle
{
    public static int [] pascal (int row)
    {
        int [] hello = {1};
        return PascalsTriangleNumber(row, hello);
    }
    public static int[] PascalsTriangleNumber(int row, int [] numbers)
    {
        int first = 1, last = 1;
        int [] newNums = new int[numbers.length + 1];
        newNums[0] = 1;
        newNums[newNums.length - 1] = 1;
        for (int i = 1; i < newNums.length - 1; i ++ )
        {
            newNums[i] = numbers[i - 1] + numbers[i];
        }
        
        for (int num: numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        if (newNums[1] == row)
        {
            for (int num: newNums)
            {
               System.out.print(num + " ");
            }
            return newNums;
        }
        else 
        {
            return PascalsTriangleNumber(row, newNums);
        }
    }
}
