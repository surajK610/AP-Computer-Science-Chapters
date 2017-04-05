/*Exercise 2.12
 * --------------------------------
 * This program determines the value of coins in a jar
 * and prints the total in dollars and cents using a 
 * currency formatter.
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Ex_12
{
    public static void main (String [] args)
    {
        Scanner readCoins = new Scanner (System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        int pennies, nickels, dimes, quarters;
        double money;
        
        System.out.println("Enter the number of pennies: ");
        pennies = readCoins.nextInt();
        
        System.out.println("Enter the number of nickels: ");
        nickels = readCoins.nextInt();
        
        System.out.println("Enter the number of dimes: ");
        dimes = readCoins.nextInt();
        
        System.out.println("Enter the number of quarters: ");
        quarters = readCoins.nextInt();
        
        money = ((pennies) + (nickels * 5) + (dimes * 10) + (quarters * 25)) / (double)100;
        
        System.out.println("You have: " + currency.format(money));
        
    }
}