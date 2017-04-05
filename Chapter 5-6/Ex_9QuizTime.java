import java.util.*;
public class Ex_9QuizTime
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Ex_9Quiz quiz = new Ex_9Quiz();
        
        String question, answer;
        Question questionN;
        int complexity = 0;
        
        String [] answers;
        
        boolean cont = true;
        int correct = 0;
        String anoth = "y";
        int count = 15;
        
        Question q;
        
        q = new Question("What is 2 + 1 ? ", "3");
        q.setComplexity(2);
        quiz.add(q, 0);
        

        System.out.println("Question (y/n)?");
        anoth = scan.next();
        for (int i = 1; i < 25 && anoth.equalsIgnoreCase("y"); i ++)
        {
            System.out.println("Question?");
            if(i!= 0)
            {
                question = scan.nextLine();
            }
            question = scan.nextLine();
            
            System.out.println("Answer :");
            answer = scan.nextLine();
            
            questionN = new Question(question, answer);
            questionN.setComplexity(complexity);
            quiz.add(questionN, i);
            
            System.out.println("Another question (y/n)?");
            anoth = scan.next();

        }
        
        System.out.println("\nStarting the quiz...");
        quiz.giveQuiz();
        
        

        
    }
}
