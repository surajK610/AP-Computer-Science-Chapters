
/**
 * Write a description of class Ex_7GradeRange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex_7GradeRange
{
     //-----------------------------------------------------------------
       //  Stores the possible grades and their numeric lowest value,
       //  then prints them out.
       //-----------------------------------------------------------------
       public static void main (String[] args)
       {
          Ex_7Grade [] grades = new Ex_7Grade [12];
          int countG = 0;
          int countC = 0;
          
          String[] gradesS = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-",
                             "D+", "D", "D-", "F"};
    
          int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
          
          for(int i = 0; i < grades.length; i ++)
          {
              grades[i] = new Ex_7Grade(gradesS[i], cutoff[i]);
            }
          for (int level = 0; level < cutoff.length; level++)
             System.out.println (grades[level].getGrade() + "\t" + grades[level].getCutoff());
    }
}
