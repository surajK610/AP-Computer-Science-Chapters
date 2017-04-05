package Sports_Statistics;


public class Baseball extends Statistic
{
    public Baseball(Team team1, Team team2)
    {
        super(team1, team2);
    }
    
    public void addScore (String Event, Team team)
    {
        
        if (Event.equalsIgnoreCase("one in"))
        {
            team.addPoints(1);
        }
        if (Event.equalsIgnoreCase("two in"))
        {
            team.addPoints(2);
        }
        if (Event.equalsIgnoreCase("three in"))
        {
            team.addPoints(3);
        }
        if (Event.equalsIgnoreCase("grand slam"))
        {
            team.addPoints(4);
        }      

    }
}
