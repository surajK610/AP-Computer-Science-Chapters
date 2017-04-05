package Sports_Statistics;


/**
 * Write a description of class Soccer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soccer extends Statistic
{
       public Soccer(Team team1, Team team2)
    {
        super(team1, team2);
    }
    public void addScore (String Event, Team team)
    {
        if (Event.equalsIgnoreCase("goal"))
        {
            team.addPoints(1);
        }
    }
}
