//Counter.java


public class Counter
{
    public static void main (String [] args)
    {
        int count = 1;
        
        while (count <= 10)
        {
            System.out.println(count);
            count ++;
        }
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        
        count = 10;
        
        while (count >= 1)
        {
            System.out.println(count);
            count --;
        }
        
        for (int j = 10; j >= 1; j--)
        {
            System.out.println(j);
        }
    }
}
