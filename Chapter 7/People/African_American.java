package People;

import java.util.*;
/**
 * Write a description of class Blackies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class African_American
{
    public People [] AAs;
    public int numberAAs = 4;
    Random ran = new Random ();
       public African_American()
    {
        AAs = new People [numberAAs];
        String occupation1 = "Doctor";
        String occupation2 = "Engineer";
        String occupation3 = "Housewife";
        String occupation4 = "Househusband";
        int age1 = (int)(ran.nextDouble()* 100);
        int age2 = (int)(ran.nextDouble()* 100);
        int age3 = (int)(ran.nextDouble()* 100);
        int age4 = (int)(ran.nextDouble()* 100);
                                                                                                                                                                                                                                                                                                  
        double income1 = (ran.nextDouble()* 500000);
        double income2 = (ran.nextDouble()* 500000);
        double income3 = (ran.nextDouble()* 500000);
        double income4 = (ran.nextDouble()* 500000);
        
        String nationality = "African American";
        
        
        People Bolu = new People("Bolu", age1, nationality, occupation1, income1);
        People Shaniqua = new People("Shaniqua",age2, nationality, occupation2, income2);
        People Bimpe = new People("Bimpe",age3, nationality, occupation3, income3);
        People Chukee = new People("Chukee",age4, nationality, occupation4, income4);
        
        AAs[0] = Bolu;
        AAs[1] = Shaniqua;
        AAs[2] = Bimpe;
        AAs[3] = Chukee;
    }
    public String toString()
    {
        String people = "";
        for (People person: AAs)
        {
            if (person != null)
                people += person.toString() + "\n";
        }
        return people;
    }
}
