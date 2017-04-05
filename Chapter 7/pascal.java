
/**
 * Write a description of class pascal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pascal
{
    public static int[] pascal1(int row, int [] nums)
    {
        int [] newNums = new int [nums.length + 1];
        if (nums.length > 1 && nums[nums.length - 2] == row)
            return nums;
        else{
            newNums[0] = 1; newNums[newNums.length - 1] = 1 ;
            for (int i = 1; i < newNums.length -1; i ++ )
            {
                newNums[i] = nums[i - 1] + nums[i];
            }
            return pascal1(row, newNums);}
    }
}
