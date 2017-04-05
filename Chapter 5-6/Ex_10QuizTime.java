import java.util.*;
public class Ex_10QuizTime
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        Ex_10Quiz quiz = new Ex_10Quiz();
        int CountQ;
        int noQ = 1;
        int min, max;
        String question, answer;
        Question questionN;
        int complexity = 0;
        
        String [] answers;
        
        boolean cont = true;
        int correct = 0;
        String anoth = "y";
        
        Question q;
        
        
        q = new Question("What is 2 + 1 ? ", "3");
        q.setComplexity(3);
        quiz.add(q, 0);
        
        /*q[1] = new Question("What is 2 + 2 ? ", "4");
        q[1].setComplexity(2);
        quiz.add(q[1], 1);
        
        q[2] = new Question("What is 3 + 2 ? ", "5");
        q[2].setComplexity(3);
        quiz.add(q[2], 2);
        
        q[3] = new Question("What is 4 + 2 ? ", "6");
        q[3].setComplexity(3);
        quiz.add(q[3], 3);
        
        q[4] = new Question("What is 5 + 2 ? ", "7");
        q[4].setComplexity(3);
        quiz.add(q[4], 4);
        
        q[5] = new Question("What is 6 + 2 ? ", "8");
        q[5].setComplexity(3);
        quiz.add(q[5], 5);
        
        q[6] = new Question("What is 7 + 2 ? ", "9");
        q[6].setComplexity(4);
        quiz.add(q[6], 6);
        
        q[7] = new Question("What is 8 + 2 ? ", "10");
        q[7].setComplexity(4);
        quiz.add(q[7], 7);
        
         q[8] = new Question("What is 9 + 2 ? ", "11");
        q[8].setComplexity(4);
        quiz.add(q[8], 8);
        
        q[9] = new Question("What is 10 + 2 ? ", "12");
        q[9].setComplexity(5);
        quiz.add(q[9], 9);
        
        q[10] = new Question("What is 11 + 2 ? ", "13");
        q[10].setComplexity(3);
        quiz.add(q[10], 10);
        
        q[11] = new Question("What is 12 + 2 ? ", "14");
        q[11].setComplexity(4);
        quiz.add(q[11], 11);
        
         q[12] = new Question("What is 13 + 2 ? ", "15");
        q[12].setComplexity(34);
        quiz.add(q[12], 12);
        
         q[13] = new Question("What is 14 + 2 ? ", "16");
        q[13].setComplexity(2);
        quiz.add(q[13], 13);
        
        q[14] = new Question("What is 15 + 2 ? ", "17");
        q[14].setComplexity(1);
        quiz.add(q[14], 14);*/
        System.out.println("A question (y/n)?");
        anoth = scan.next();
        for (int i = 1; i < 25 && anoth.equalsIgnoreCase("y"); i ++)
        {
            System.out.println("Question :");
            if(i != 0)
                question = scan.nextLine();
            question = scan.nextLine();
            
            System.out.println("Answer :");
            answer = scan.nextLine();
            
            System.out.println("Complexity :");
            complexity = scan.nextInt();
            
            questionN = new Question(question, answer);
            questionN.setComplexity(complexity);
            quiz.add(questionN, i);
            
            System.out.println("Another question (y/n)?");
            anoth = scan.next();

        }
        System.out.println("Enter the min complexity:");
        min = scan.nextInt();
        
        System.out.println("Enter the max complexity:");
        max = scan.nextInt();
        
        System.out.println("\nStarting the quiz...");
        quiz.giveQuiz(min, max);
        
       
    }
}
