
public class DriveEx_3
{
    public static void main (String [] args)
    {
        int [] array = {10, 8, 23, 41, 53, 32, 43};
        int [] array2 = {23, 14, 6, 12, 65};
        double [] array3 = {53.7, 34.1, 56.3, 11.0, 5.4};
        Sorts_Ex3 sort = new Sorts_Ex3();
        
        sort.insertionSort(array);
        
        for (int x: array)
        {
            System.out.println (x + "\t");
        }
        System.out.println();
        
        sort.selectionSort(array2);
        
        for (int x: array2)
        {
            System.out.println (x + "\t");
        }
        
    }
}
