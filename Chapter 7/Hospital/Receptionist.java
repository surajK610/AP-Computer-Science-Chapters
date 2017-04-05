package Hospital;


/**
 * Write a description of class Receptionist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receptionist extends Employee
{ 
    public Receptionist(boolean isFree, String name)
    {
        super(isFree, name);
    }
    
    public boolean answerPhone()
    {
        if (isFree)
        {
            System.out.println("The phone has been answered.");
            return true;
        }
        return false;
    }
}

