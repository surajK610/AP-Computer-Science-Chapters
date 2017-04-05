//Ex_7.java

public class Ex_7
{
    public static void main (String [] args)
    {
        int num;
        System.out.println("    \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (int i = 1; i <= 12; i ++)
        {
            System.out.print(i + "|\t");
            for (int j = 1; j <=12; j++)
            {
                num = i * j;
                System.out.print(num + "\t");
            }
            System.out.println("\n");
            
        }
        }
}
