//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student_Ex8
{
   private String firstName, lastName;
   private Address_Ex8 homeAddress, schoolAddress;
   private int Test1, Test2, Test3;
   private double average;
      //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student_Ex8 (String first, String last, Address_Ex8 home,
                   Address_Ex8 school, int grade1, int grade2, int grade3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      Test1 = grade1;
      Test2 = grade2;
      Test3 = grade3;
   }

   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student_Ex8 (String first, String last, Address_Ex8 home,
                   Address_Ex8 school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      Test1 = 0;
      Test2 = 0;
      Test3 = 0;
   }

   public void setTestScore(int testNum, int score)
   {
       if (testNum == 1)
       Test1 = score;
            
       if (testNum == 2)
       Test2 = score;
            
       if (testNum == 3)
       Test3 = score;
    }
    
    public int getTestScore(int testNum)
    {
        int testRet  = 0; 
        if (testNum == 1)
        testRet = Test1;
        
        if (testNum == 2)
        testRet =  Test2;
        
        if (testNum == 3)
        testRet =  Test3;
        
        return testRet;
    }
    
    public double average ()
    {
        average = (double)(Test1 + Test2 + Test3)/3;
        return average;
    }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "\nTest1: " + Test1;
      result += "\tTest2: " + Test2;
      result += "\tTest3: " + Test3;
      result += "\nAverage:" + ((double)(Test1 + Test2 + Test3)/3);

      return result;
   }
}