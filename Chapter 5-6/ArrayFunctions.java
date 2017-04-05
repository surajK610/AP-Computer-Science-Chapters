import java.util.*;
public class ArrayFunctions
{
    public int [] readArray (int [] array)
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i ++)
        {
            System.out.println("Enter number " + (i) + " :");
            array [i] = scan.nextInt();
            
        }
        return array;
    }
    
    public  int[] ArrayReverse(int [] array)
    {
        int temp;
        for(int j = 0; j <= array.length/2; j ++)
            {
                temp = array[j];
                array[j] = array [array.length - 1 - j];
                array[array.length - 1- j ] = temp; 
            }
        return array;
        }

  
    public void ArrayPrint(int [] array)
    {
        for(int num : array)
            {
                System.out.print(num + "\t");
            }
    }
}
