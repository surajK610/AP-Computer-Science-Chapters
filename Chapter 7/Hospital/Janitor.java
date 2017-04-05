package Hospital;


/**
 * Write a description of class Janitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Janitor extends Employee
{
    private boolean floorIsClean;
    public Janitor(boolean setFree, String name )
    {
        super(setFree, name );
    }
    
    public boolean cleanFloor()
    {
        if (isFree)
        {
            floorIsClean = true;
            return true;
        }
        return false;
    }
}
