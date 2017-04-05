package Sports_Statistics;



public class Driver
{
    public static void main (String [] args)
    {
        Team vikings = new Team ("Vikings");
        Team warriors = new Team ("Warriors");
        Team cobras = new Team ("Cobras");
        Team tigers = new Team ("Tigers");
        
        Soccer soccer = new Soccer(vikings, warriors);
        System.out.println("Soccer game between the vikings and warriors.");
        soccer.addScore("goal", vikings);
        soccer.addScore("goal", warriors);
        soccer.addScore("goal", vikings);
        
        System.out.println(soccer);
        System.out.println(soccer.getWinner());
        
        Baseball baseball = new Baseball (cobras, tigers);
        System.out.println("Baseball game between the cobras and tigers.");
        baseball.addScore("one in", cobras);
        baseball.addScore("two in", cobras);
        baseball.addScore("one in", cobras);
        baseball.addScore("one in", tigers);
        baseball.addScore("one in", tigers);
        baseball.addScore("one in", cobras);
        baseball.addScore("three in", cobras);
        baseball.addScore("grand slam", tigers);
        baseball.addScore("two in", tigers);
        
        System.out.println(baseball);
        System.out.println(baseball.getWinner());
        
        Football football = new Football(vikings, cobras);
        System.out.println("Football game between the vikings and cobras.");
        football.addScore("touchdown", cobras);
        football.addScore("field goal", cobras);
        football.addScore("touchdown", vikings);
        football.addScore("two point conversion", vikings);
        
        System.out.println(football);
        System.out.println(football.getWinner());
        
        Basketball basketball = new Basketball(warriors, tigers);
        System.out.println("Basketball game between the tigers and warriors.");
        basketball.addScore("free throw", warriors);
        basketball.addScore("free throw", warriors);
        basketball.addScore("two-pointer", warriors);
        basketball.addScore("three-pointer", warriors);
        basketball.addScore("three-pointer", tigers);
        basketball.addScore("two-pointer", tigers);
        basketball.addScore("two-pointer", tigers);
        basketball.addScore("free throw", tigers);
        
        System.out.println(basketball);
        System.out.println(basketball.getWinner());
    }

}
