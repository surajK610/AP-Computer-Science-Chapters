import java.util.*;

public class FractionMath_Ex7
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int numF;
        int denF;
        int numS;
        int denS;
        
        Rational_Ex7 frac1, frac2;
        Rational_Ex7 sol = new Rational_Ex7(1, 1);
        
        String oper = "";
        
        System.out.print("Do you want to add, subtract, multiply, or divide fractions(a/s/m/d)? ");
        oper = scan.next();
        
        System.out.println("Enter the numerator of the first fraction?");
        numF = scan.nextInt();
        System.out.println("Enter the denominator of the first fraction?");
        denF = scan.nextInt();
        
        System.out.println("\nEnter the numerator of the second fraction?");
        numS = scan.nextInt();
        System.out.println("Enter the denominator of the second fraction?");
        denS = scan.nextInt();
        
        frac1 = new Rational_Ex7(numF, denF);
        frac2 = new Rational_Ex7(numS, denS);
        
        if (oper.equalsIgnoreCase("a"))
        {
            sol = frac1.add(frac2);
        }
        else if (oper.equalsIgnoreCase("s"))
        {
            sol = frac1.subtract(frac2);
        }
        else if (oper.equalsIgnoreCase("m"))
        {
            sol = frac1.multiply(frac2);
        }
        else if (oper.equalsIgnoreCase("d"))
        {
            sol = frac1.divide(frac2);
        }
        System.out.println("\nThe solution is " + sol);
    }
}
