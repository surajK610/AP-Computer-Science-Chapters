import java.util.*;
public class Ex_6Bank
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Ex_6Accounts [] Bank = new Ex_6Accounts [30];
        
        Bank[0] = new Ex_6Accounts("Jim", 1001, 12);
        Bank[1] = new Ex_6Accounts("Sarah", 1002, 321);
        Bank[2] = new Ex_6Accounts("Ford", 1003, 432);
        Bank[3] = new Ex_6Accounts("Trevor", 1004, 765);
        
        String name;
        String oper;
        String moreOp = "y";
        
        int depN, withN;
        int depM, withM;
        
        String another = "y";
        int acctNum, initial = 0;
        boolean more = true;
        int count = 5;
        

        while(moreOp.equalsIgnoreCase("y"))
        {
            System.out.println("Do you have an account or want to make a new account(Y/N)?");
            another = scan.next();
            if(another.equalsIgnoreCase("n"))
            {
                System.out.println("Enter an account name or 'STOP' to cancel");
                name = scan.next();
                   
                 if(name.equals("STOP"))
                 {      
                }
                else
                {
                     
                     acctNum = 1000 + count;
                     System.out.println("Enter the intial deposit(or 0 if none):");
                     initial = scan.nextInt();
                     Bank[count - 1] = new Ex_6Accounts(name, acctNum, initial);
                     count ++;
                     
                     System.out.println(Bank[count - 2]);
                }
            }
            else
            {
                System.out.println("Would you like to make a withdrawl or deposit or cancel(W/D/C)");
                oper = scan.next();
                
                if(oper.equalsIgnoreCase("C"))
                {
                }
                else
                {
                    if(oper.equalsIgnoreCase("D"))
                    {
                        System.out.println("Enter the account number that you want to deposit money into: ");
                        depN = scan.nextInt();
                        
                        System.out.println("Enter the amount of money you want to deposit: ");
                        depM = scan.nextInt();
                        
                        Bank[depN - 1001].deposit(depM);
                        Bank[0].addInterest(Bank, count);
                        
                        System.out.println(Bank[depN - 1001]);
                    }
                    else if(oper.equalsIgnoreCase("W"))
                    {
                        System.out.println("Enter the account number that you want to withdraw money from: ");
                        withN = scan.nextInt();
                        
                        System.out.println("Enter the amount of money you want to withdraw(2 dollar fee): ");
                        withM = scan.nextInt();
                        
                        Bank[withN - 1001].withdraw(withM, 2);
                        Bank[0].addInterest(Bank, count);
                        
                        System.out.println(Bank[withN - 1001]);
                    }
                    else
                    {
                        System.out.println("Cancelled because invalid operation");
                    }
                }
            }
            System.out.println("Any more operations(y/n)?");
            moreOp = scan.next();
        }
        for(int i = 0; i < count - 1; i ++)
        {
            System.out.println(Bank[i]);
        }
        }     
    }

