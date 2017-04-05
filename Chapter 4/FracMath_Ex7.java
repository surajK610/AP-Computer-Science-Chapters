import java.util.*;

public class FracMath_Ex7
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
        
        String firstF, secondF;
        
        StringTokenizer firstFrac;
        StringTokenizer secondFrac;
        
        String oper = "";
        
        System.out.print("Do you want to add, subtract, multiply, or divide fractions(a/s/m/d)? ");
        oper = scan.next();
        
        System.out.println("Enter the first fraction(with a / seperating numerator and denominator)?");
        firstF = scan.next();
        
        firstFrac = new StringTokenizer(firstF, " /");
        
        numF = Integer.valueOf(firstFrac.nextToken());
        denF = Integer.valueOf(firstFrac.nextToken());
        
        System.out.println("Enter the second fraction(with a / seperating numerator and denominator)?");
        secondF = scan.next();
        
        secondFrac = new StringTokenizer(secondF, " /");
        
        numS = Integer.valueOf(secondFrac.nextToken());
        denS = Integer.valueOf(secondFrac.nextToken());
        
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