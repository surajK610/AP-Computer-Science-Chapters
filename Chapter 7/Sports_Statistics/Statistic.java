package Sports_Statistics;
public abstract class Statistic
{
    public int score;
    public Team team1;
    public Team team2;
    public Statistic(Team team1, Team team2)
    {
        this.team1 = team1;
        this.team2 = team2;
    }
    public abstract void addScore (String Event, Team team);
    public void ejected(String person)
    {
        System.out.println(person + " has been ejected from the game.");
    }
    public String getWinner ()
    {
        if (team1.getPoints() > team2.getPoints()) return team1.getName(); 
         else if (team2.getPoints() > team1.getPoints()) return team2.getName();
        else return "It was a tie";}
    public String toString(){return team1.getName() + " " + team1.getPoints()  + " - " + team2.getName() + " " +team2.getPoints();}
}
