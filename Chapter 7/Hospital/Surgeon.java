package Hospital;


/**
 * Write a description of class Surgeon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Surgeon extends Employee
{   
    public Surgeon (boolean isFree, String name)
    {
        super(isFree, name);
    }
    
    public boolean surgery(Patient patient, Nurse nurse)
    {
        if (isFree && patient.getIsHealable())
        {
            if (nurse.preparePatient(patient))
                {isFree = false;
                    System.out.println("Surgery has been performed.");
                    patient.addDaysLeft(20);
                return true;}
            else 
            {
                System.out.println("The nurse is not free. Sorry about that.");
                return false;}
            
        }
        System.out.println("Sorry, I am not free;");
        return false;
    }
}


