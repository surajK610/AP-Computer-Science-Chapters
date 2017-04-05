//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class StudentDrive_Ex8
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Address_Ex8 school = new Address_Ex8 ("800 Lancaster Ave.", "Villanova",
                                    "PA", 19085);

      Address_Ex8 jHome = new Address_Ex8 ("21 Jump Street", "Lynchburg",
                                   "VA", 24551);
      Student_Ex8 john = new Student_Ex8 ("John", "Gomez", jHome, school, 87, 98, 27);
      
      
      System.out.println("John's average is " + john.average() + "\n");

      Address_Ex8 mHome = new Address_Ex8 ("123 Main Street", "Euclid", "OH",
                                   44132);
      Student_Ex8 marsha = new Student_Ex8 ("Marsha", "Jones", mHome, school);
      //marsha.setTestScore(1, 98);
      //marsha.setTestScore(2, 48);
      //marsha.setTestScore(3, 91);
      
      System.out.println("Marsha's second test score: " + marsha.getTestScore(2));

      System.out.println ("\n" + john);
      System.out.println ();
      System.out.println ("\n" + marsha);
   }
}