
/* File: Add2Numbers_1.java
 * ------------------------------------
 * This program uses the scanner class of the java utility
 * pakage to add two numbers,
 */
 import java.util.Scanner;
 public class Add2Numbers_1
 {
     public static void main(String [] args)
     {
         Scanner scan = new Scanner(System.in);
         int num1, num2, sum;
         
         System.out.print("Enter the first number: ");
         num1 = scan.nextInt();
         
         System.out.print("Enter the second number: ");
         num2 = scan.nextInt();
         
         sum = num1 + num2;
         System.out.println(num1 + "+" + num2 + "=" + sum);
         
     }
 }    