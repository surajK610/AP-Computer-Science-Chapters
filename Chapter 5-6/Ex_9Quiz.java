import java.util.*;

public class Ex_9Quiz
{
    Question [] quiz = new Question [25];
    String [] answers;
    
    public void add(Question question, int place)
    {
        quiz[place] = question;
    }
    
    public Question getQuestion(int i)
    {
        return quiz[i];
    }
    
    
    public Question[] getQuiz()
    {
        return quiz;
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
       
    }
    
    

