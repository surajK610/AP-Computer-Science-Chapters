package People;

import java.util.*;
/**
 * Write a description of class Doctors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doctors
{
    public People [] Docs;
    public int numberDs = 4;
    Random ran = new Random ();
       public Doctors()
    {
        Docs = new People [numberDs];
        String occupation = "Doctor";
        int age1 = (int)(ran.nextDouble()* 100);
        int age2 = (int)(ran.nextDouble()* 100);
        int age3 = (int)(ran.nextDouble()* 100);
        int age4 = (int)(ran.nextDouble()* 100);
                                                                                                                                                                                                                                                                                                  
        double income1 = (ran.nextDouble()* 500000);
        double income2 = (ran.nextDouble()* 500000);
        double income3 = (ran.nextDouble()* 500000);
        double income4 = (ran.nextDouble()* 500000);
        
        String nationality1 = "African American";
        String nationality2 = "European Descent";
        String nationality3 = "Asian";
        String nationality4 = "Indian";
        
        People Doc = new People("Doc", age1, nationality1, occupation, income1);
        People Serg = new People("Serg", age2, nationality2, occupation, income2);
        People eun = new People("eun", age3, nationality3, occupation, income3);
        People Hel = new People("Hel", age4, nationality4, occupation, income4);
        
        Docs[0] = Doc;
        Docs[1] = Serg;
        Docs[2] = eun;
        Docs[3] = Hel;
    }
        public String toString()
    {
        String people = "";
        for (People person: Docs)
        {
            if (person != null)
                people += person.toString() + "\n";
        }
        return people;
    }
}

