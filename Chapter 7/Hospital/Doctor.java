package Hospital;

/**
 * Write a description of class Doctor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doctor extends Employee
{
    
    public Doctor(boolean isFree, String name)
    {
        super(isFree, name);
    }
    
    public boolean heal(Patient patient, Nurse nurse)
    {
        if (isFree && patient.getIsHealable())
        {
            if (nurse.preparePatient(patient))
                {isFree = false;
                    System.out.println("The patient has been healed.");
                    patient.addDaysLeft(10);
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
