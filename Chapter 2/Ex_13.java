/* File: Exercise 2.13
 * ---------------------------------------
 * This program creates and prints a random
 * phone number. The first three digits
 * cannot create
 */
import java.util.Random;
public class Ex_13
{
    public static void main(String [] args)
    {
        Random phoneNumberMaker = new Random();
        
        int num1, num2, num3, num456, num7890;
        
        num1 = phoneNumberMaker.nextInt(8);
        num2 = phoneNumberMaker.nextInt(8);
        num3 = phoneNumberMaker.nextInt(8);
        
        num456 = phoneNumberMaker.nextInt(643) + 100;
        
        num7890= phoneNumberMaker.nextInt(9000) + 1000;
        
        System.out.println("Your phone number is: " + num1 + num2 + num3 + "-" + num456 + "-" + num7890);
    }
}