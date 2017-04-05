import java.util.*;

public class Ex_10Quiz
{
    private Question [] quiz = new Question [25];
    private String [] answers;
    int countQ; 
    int start;
    int end;
    public void add(Question question, int place)
    {
        quiz[place] = question;
    }
    
    public Question getQuestion(int i)
    {
        return quiz[i];
    }
    
   public void giveQuiz()
    {
        Scanner scan = new Scanner (System.in);
        int correct = 0;
        Question question;
        answers = new String [25];
       for(int i = 0; i < quiz.length; i ++)
       {
            while(i < quiz.length && quiz[i] != null)
            {
                    System.out.println( quiz[i].getQuestion());
                    answers[i] = scan.nextLine();
                    
                    i++;
                    question = quiz[i];
               
            }
        }    
              for (int i = 0; i < quiz.length && quiz[i] != null; i ++)
       {
            if (quiz[i].answerCorrect(answers[i]))
                {
                  System.out.println("Question " + (i+1) + " You got it CORRECT");
                  correct ++;
                }
                else
                {
                    System.out.println("Question " + (i+1) + " You got it INCORRECT");
                    System.out.println("The correct answer is " + quiz[i].getAnswer() + "\n");
                }
       }
       System.out.println("You got " + correct + " correct.");
       
        }
     public void giveQuiz(int min, int max)
    {
        Scanner scan = new Scanner (System.in);
        int correct = 0;
        Question question;
        answers = new String [25];
        sortCom();
       for(int i = 0;quiz[i] != null && i < quiz.length; i ++)
       {
            while (quiz[i] != null && quiz[i].getComplexity() <= max && quiz[i].getComplexity() >= min) 
            {
                    System.out.println(quiz[i].getQuestion());
                    /*if(i != 0)
                    {
                        answers[i] = scan.nextLine();
                    }*/
                    answers[i] = scan.nextLine();
                    i++;
                    question = quiz[i];
               
            }
        }  
        
      for (int i = 0; i < quiz.length && quiz[i] != null; i ++)
       {
           if( quiz[i].getComplexity() <= max && quiz[i].getComplexity() >= min)
           {
            if (quiz[i].answerCorrect(answers[i]))
                {
                  System.out.println("You got it CORRECT");
                  correct ++;
                }
                else
                {
                    System.out.println("Question " + (i+1) + " You got it INCORRECT");
                    System.out.println("The correct answer is " + quiz[i].getAnswer() + "\n");
                }
            }
       }
       System.out.println("You got " + correct + " correct.");
       
        }
    
       public void sortCom ()
   {
      Question temp;
      int min;

      for (int index = 0; index < quiz.length-1; index++)
      {
         min = index;
         for (int scan = index+1; quiz[scan] != null && scan < quiz.length; scan++)
            if ((quiz[scan].getComplexity() < (quiz[min].getComplexity())))
               min = scan;

         // Swap the values
         temp = quiz[min];
         quiz[min] = quiz[index];
         quiz[index] = temp;
      }
   }
}
