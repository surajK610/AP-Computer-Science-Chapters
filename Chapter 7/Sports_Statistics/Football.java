package Sports_Statistics;


public class Football extends Statistic
{
    public Football(Team team1, Team team2)
    {
        super(team1, team2);
    }
    
    public void addScore (String Event, Team team)
    {
        if (Event.equalsIgnoreCase("touchdown"))
        {
            team.addPoints(6);
        }
        if (Event.equalsIgnoreCase("field goal"))
        {
            team.addPoints(1);
        }
        if (Event.equalsIgnoreCase("two point conversion"))
        {
            team.addPoints(2);
        }
    }
}
