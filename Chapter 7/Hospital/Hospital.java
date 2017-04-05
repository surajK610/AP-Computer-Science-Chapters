package Hospital;
import java.util.*;
public class Hospital
{
    public static void main (String [] args)
    {
        boolean patient1Healed, patient2Healed, patient3Healed;
        
        int days = 1;
        Doctor doc1 = new Doctor(true, "Jim");
        Doctor doc2 = new Doctor(true, "HHE");
        Doctor doc3 = new Doctor(true, "Sarah");
        
        Patient Docker = new Patient(true, true, 12);
        Patient Nemo = new Patient(true, false, 3);
        Patient Elmo = new Patient(false, true, 7);
        
        Nurse nurse1 = new Nurse(true, "Arya");
        Nurse nurse2 = new Nurse(true, "Jake");
        Nurse nurse3 = new Nurse(true, "Janet");
        
        Surgeon surg1 = new Surgeon(true, "JJO");
        Surgeon surg2 = new Surgeon(true, "Surg");
        Surgeon surg3 = new Surgeon(true, "Sergio");
        
        Receptionist rec = new Receptionist(true, "Recp");
        Janitor jan = new Janitor(true, "Jan");
        
        rec.answerPhone();
        System.out.println("Docker has been in an accident and needs a blood transfusion." );
        
        patient1Healed = doc1.heal(Docker, nurse1);
        System.out.println("Docker is"  + (patient1Healed? " " : " not " ) + "healed.\n");
        System.out.println("His stay is "  + Docker.getDaysLeftStay()+ " days longer.");
        
        rec.answerPhone();
        System.out.println("Nemo has scheduled an appointment for a kidney transplant." );
        
        System.out.println("\n\n\nNemo has arrived!!");
        patient2Healed = surg1.surgery(Nemo, nurse2);
        System.out.println("Nemo is"  +( patient1Healed? " ": " not ") + "alive and well.\n");
        
        jan.cleanFloor();
        
        System.out.println("Elmo has arrived for his annual checkup.");
        patient3Healed = doc2.heal(Elmo, nurse3);
        System.out.println("Elmo is alright.");
    }
}
