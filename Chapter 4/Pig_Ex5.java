import java.util.*;

public class Pig_Ex5
{
   public static void main (String [] args)
   {
       final int goal = 100;
       
       PairOfDice_Ex5 dice = new PairOfDice_Ex5();
       
       Scanner scan = new Scanner (System.in);
       int die1Face, die2Face;
       int roundU = 0, roundC = 0;
       int totalU = 0, totalC = 0;
       boolean userTurn = true;
       String wRoll = "y";
       
       while (totalU < goal && totalC < goal)
       {
           while (userTurn && (totalU < goal && totalC < goal))
           {
               System.out.println("\nDo you want to roll(y/n)?");
               wRoll = scan.next();
               if (!(wRoll.equalsIgnoreCase("y")))
                  userTurn = false;
               else 
               {
                   dice.roll();
                   die1Face = dice.getFaceValue(1);
                   die2Face = dice.getFaceValue(2);
                   
                   totalU += (die1Face + die2Face);
                   roundU += (die1Face + die2Face);
                   
                   if (die1Face == 1 && die2Face == 1)
                      { 
                        totalU = 0;
                        roundU = 0;
                        userTurn = false;
                    }
                    
                    else if (die1Face == 1 || die2Face == 1)
                    {
                        totalU -= roundU;
                        roundU = 0;
                        userTurn = false;
                    }
                    
                    System.out.println("\nYou got a " + die1Face + " and a " + die2Face);
                    System.out.println("Your Total: " + totalU + "\nYour Round Amount " + roundU);
                    
                    System.out.println("The computer's total is " + totalC);
                }
               
            }
            roundU = 0;
           while (!userTurn&& (totalU < goal && totalC < goal))
           {
                   dice.roll();
                   die1Face = dice.getFaceValue(1);
                   die2Face = dice.getFaceValue(2);
                   
                   totalC += (die1Face + die2Face);
                   roundC += (die1Face + die2Face);
                   
                   if (die1Face == 1 && die2Face == 1)
                    {
                        totalC = 0;
                        roundC = 0;
                        userTurn = true;
                    }
                    
                    else if (die1Face == 1 || die2Face == 1)
                    {
                        totalC -= roundC;
                        roundC = 0;
                        userTurn = true;
                    }
                   if (roundC >= 20)
                   {
                       userTurn = true;
                    }
                    
                    System.out.println("\nThe computer got a " + die1Face + " and a " + die2Face);
                    System.out.println("Computer's Total: " + totalC + "\nComputer's Round Amount: " + roundC);
                    
                    System.out.println("\nYour Total: " + totalU);
                }
           roundC = 0;  
            }
       if (totalU >= 100)
       {
           System.out.println("You are the winner!");
        }
        
        else if (totalC >= 100)
       {
           System.out.println("The computer is the winner! \n YOU LOSE!!");
        }
        }
       
    }

