
/**
 * Write a description of class Searchs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Searchs
{
    public static int linearSearch (int nums [], int search)
    {
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] == search)
                return i;
        }
        return -1;
    }
    
    public static int binarySearch(int [] nums, int search)
    {
        int lowest = 0;
        int highest = nums.length - 1;
        int middle = (lowest + highest)/2;
        
        while(lowest <= highest && search != nums[middle])
        {
            if(search < nums[middle])
            {
                highest = middle -1;
            }
            else if (search > nums[middle])
            {
                lowest = middle +1;
            }
            middle = (highest + lowest)/2;
        }
        
        if(nums[middle] == search)
        {
            return middle;
        }
        return -1;
    }
}
