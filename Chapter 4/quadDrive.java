//quadDrive.java

import java.util.*;
import java.text.*;

public class quadDrive
{   
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");
        double x[] = new double [2];
        double x1, x2;
        String quad;
        System.out.println("Enter a quadratic expression equal to zero(using ^2 as squared):");
        quad = scan.nextLine();
        
        quadratic New = new quadratic ( quad, 3);
        
        x = New.getX();
        
        x1 = x[0];
        x2 = x[1];
        
        System.out.println ("The first solution is " + fmt.format(x1));
        System.out.println ("The second solution is " + fmt.format(x2));
    }
}