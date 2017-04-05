
/**
 * Write a description of class SortingAl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortingSearching
{
    public static void main(String [] args)
    {
        Contact [] hell = new Contact [3];
        hell[0] = new Contact("hehw","whhwh","12341231");
        hell[1] = new Contact("ywewe","asdas","12341231");
        hell[2] = new Contact("aadas","dfadf","12341231");
        
        Sorting.insertion(hell);
        for(Contact cont: hell)
        {
            System.out.println(cont);
        }
        
        int [] nums = {12, 43, 243, 1234, 2134, 12535};
        System.out.println(Searchs.binarySearch(nums, 43));
        int [] nums2 = {12, 43, 243, 1234, 2134, 12535, 123, 1235};
        System.out.println(Searchs.linearSearch(nums, 43));
    }
}
