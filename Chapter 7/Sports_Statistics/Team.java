package Sports_Statistics;


/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    int score;
    String name;
    String color;

    public Team(String name)
    {
        this.name = name;
    }
    public void addPoints(int points)
    {
        score += points;
    }
    public int getPoints()
    {
        return score;
    }
    public String getName ()
    {
        return name;
    }
}
