import java.util.*;

public class quadratic
{
    private static Scanner scan = new Scanner (System.in);
    
    double a;
    double b;
    double c;
    
    double x[] = new double [2];
    double disciminant;
    char ch;
    String given;
    StringTokenizer elements;
    

    public quadratic(String quad, int deg)
    {
        given = "";
        String num;
        double [] abc = new double [3];
        int count = 0;
  
        for (int i = 0; i < quad.length(); i ++)
        {
            ch = quad.charAt(i);
            if(ch == 'x' && ( i - 1 == -1 || quad.charAt(i - 1) == ' ')) 
            {
                given += 1;
            }
            if (ch == '2' && quad.charAt(i-1) == '^')
            {
               
            }
            else if (ch == ' ' && quad.charAt(i - 1) == '-')
            {
            }
            else if ((ch >= '0' && ch <= '9') || ch == '-')
            {
                given += ch;
            }
            else if (ch == '+' || ch == ' ')
            {
                given += ' ';
            }

        }
         System.out.println(given);   
        elements = new StringTokenizer(given);
        while (count <= 2){
                 num = elements.nextToken();
                 abc[count] = Double.parseDouble(num);
                 count ++;
        }
        a = abc[0];
        b = abc[1];
        c = abc[2];
        
        System.out.println("a = " + a + "  b = " + b + "  c = " + c);
    }
    public double [] getX()
    {
        double bSq = Math.pow(b, 2);
        disciminant = Math.sqrt(bSq - (4 * a * c));
        x[0] = (b * -1 + disciminant)/(2 * a); 
        x[1] = (b * -1 - disciminant)/(2 * a); 
        
        return x;
    }
}
