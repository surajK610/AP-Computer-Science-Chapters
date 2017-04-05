package Hospital;
/**
 * Write a description of class Nurse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Nurse extends Employee
{
    public Nurse(boolean isFree, String name)
    {
        super(isFree, name );
    }
    
    public boolean preparePatient (Patient patient)
    {
        if (isFree)
        {
            takeHealth(patient);
            System.out.println("The patient has been prepared.");
            return true;
        }
        System.out.println("The patient has not been prepared.");
         return false;
    }
    
    public void giveFluShot(Patient patient)
    {
        System.out.println(patient + "has been vaccinated for the flu shot.");
    }
    
    public void takeHealth(Patient patient)
    {
        Random ran = new Random();
        System.out.println("Patient's blood pressure is " + (patient.getIsSick()? (ran.nextInt(90) + 100): (ran.nextInt(250) + 100)));
        System.out.println("Patient's height is " +( ran.nextInt(200) + 70));
    }
}

