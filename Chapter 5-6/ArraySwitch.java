import java.util.*;
public class ArraySwitch
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int size;
        int array [];
        int temp;
        
        System.out.println("What is the length of your array?");
        size = scan.nextInt();
        
        array = new int [size];
        for (int i = 0; i < size; i ++)
        {
            System.out.println("Enter number " + (i) + " :");
            array [i] = scan.nextInt();
            
        }
        
        for(int num : array)
        {
            System.out.print(num + "\t");
        }
        
        for(int j = 0; j <= size/2; j ++)
        {
            temp = array[j];
            array[j] = array [size - 1 - j];
            array[size - 1- j ] = temp; 
        }
        
        System.out.println();
        for(int num : array)
        {
            System.out.print(num + "\t");
        }
    }
}
