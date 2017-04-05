package Sports_Statistics;

public class Basketball extends Statistic
{
    public Basketball(Team team1, Team team2)
    {
        super(team1, team2);
    }
    
    public void addScore (String Event, Team team)
    {
        if (Event.equalsIgnoreCase("free throw"))
        {
            team.addPoints(1);
        }
        if (Event.equalsIgnoreCase("two-pointer"))
        {
            team.addPoints(2);
        }
        if (Event.equalsIgnoreCase("three-pointer"))
        {
            team.addPoints(3);
        }
    }
}
