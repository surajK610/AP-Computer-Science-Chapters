import java.util.*;
public class ArrayListEx
{
    public static void main(String [] args)
    {
        ArrayList <Integer> ints = new ArrayList<Integer>();
        
        ints.add(12);
        ints.add(1, 2);
        System.out.println(ints);
        ints.remove(0);
        System.out.println(ints);
        System.out.println(ints.get(0));
        ints.add(14);
        System.out.println(ints);
        ints.set(1, 15);
        System.out.println(ints);
        System.out.println(ints.size());
    }
}
