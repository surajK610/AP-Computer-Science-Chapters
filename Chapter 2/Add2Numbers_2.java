/* File: Add2Numbers_1.java
 * ------------------------------------
 * This program uses the scanner class of the java utility
 * pakage to add two numbers,
 */
public class Add2Numbers_2
{
    public static void main(String [] args)
    {
        int num1, num2, sum;
        
        System.out.print("Enter your first number: ");
        num1 = Keyboard.readInt();
        
        System.out.print("Enter your second number: ");
        num2 = Keyboard.readInt();
        
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }    
}    