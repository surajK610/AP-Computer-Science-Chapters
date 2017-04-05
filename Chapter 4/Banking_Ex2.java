//********************************************************************
//  Banking_Ex2.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking_Ex2
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account_Ex2 acct1 = new Account_Ex2 ("Ted Murphy", 72354, 102.56);
      Account_Ex2 acct2 = new Account_Ex2("Anita Gomez", 69713, 40.00);
      Account_Ex2 acct3 = new Account_Ex2 ("Sanchit Reddy", 93757, 759.32);
      Account_Ex2 acct4 = new Account_Ex2 ("JimJieBob", 87474);

      acct1.deposit (25.85);

      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: " +
                          gomezBalance);

      System.out.println ("Gomez balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));
                          
      acct2.transfer(50, 10, acct3, acct2);
      
      System.out.println("Anita Gomez's balance after transfer " + 
      acct2.getBalance());
      
      System.out.println("Sanchit Reddy's balance after transfer " + 
      acct3.getBalance());

      acct3.withdraw (800.00, 0.0);  // exceeds balance

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      System.out.println (acct4);
   }
}