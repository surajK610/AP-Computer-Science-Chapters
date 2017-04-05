import javax.swing.*;

public class QuadraticJPane 
{
    public static void main (String [] args)
    {
            do {String aStr, bStr, cStr;
            double a;
            double b;
            double c;
            double root1, root2;
            double discriminant;
            
            aStr =  JOptionPane.showInputDialog("Enter 'a' (the coeffiecient of  x^2)?");
            a = Double.parseDouble(aStr);
            
            bStr =  JOptionPane.showInputDialog("Enter 'b' (the coeffiecient of  x)?");
            b = Double.parseDouble(bStr);
            
            cStr =  JOptionPane.showInputDialog("Enter 'c' (the constant)?");
c = Double.parseDouble(cStr);
          
            
            discriminant  = Math.pow(b, 2) - (4 * a * c);
            
            if (a == 0 || discriminant <  0)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
            root1 = (-b + Math.sqrt(discriminant))/(2 * a);
            
            root2 = (-b - Math.sqrt(discriminant))/(2 * a);
            
            if (discriminant == 0 && !(a == 0 || discriminant <  0))
            {
                JOptionPane.showMessageDialog(null, "The root is " + root1);
            }
            else if (!(a == 0 || discriminant <  0))
            {
                JOptionPane.showMessageDialog(null, "The roots are " + root1 + " and " + root2);
            }
        } while(JOptionPane.showConfirmDialog(null, "Do Another") == JOptionPane.YES_OPTION);
    }
}
