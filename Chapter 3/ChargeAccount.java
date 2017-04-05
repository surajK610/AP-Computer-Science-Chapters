//ChargeAccount.java

import java.util.Scanner;
import java.text.NumberFormat;
public class ChargeAccount
{
    public static void main (String [] args)
    {
        final double INTEREST = .02;
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        double balance, additionalCharges;
        double newBalance, interestPaid, minumumPayment;
        
        minumumPayment = 0;
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        
        System.out.print("Previous Balance:          $");
        balance = scan.nextDouble();
        
        System.out.print("Enter Additional Charges:  $");
        additionalCharges = scan.nextDouble();
        if (balance == 0)
        {
            interestPaid = 0;
        System.out.println("Interest:                  " + money.format(interestPaid));
        }
        else
        {
        interestPaid = (INTEREST * (balance + additionalCharges));
        System.out.println("Interest:                  " + money.format(interestPaid));
        }
        newBalance = balance + additionalCharges + interestPaid;
        System.out.println("\nNew Balance:             " + money.format(newBalance));
        
        if (balance == 0)
        {
             minumumPayment = additionalCharges;
        }
        else if (newBalance >0 && newBalance < 50)
        {
             minumumPayment = newBalance;
        }
        else if (newBalance >=50 && newBalance <= 300)
        {
            minumumPayment = 50;
        }
        else if (newBalance > 300)
        {
            minumumPayment = .2 * newBalance;
        }
        System.out.println("\nMinumum Payment:          " + money.format(minumumPayment));
    }
}