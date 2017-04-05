package People;

import java.util.*;
/**
 * Write a description of class Asians here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asians
{
    public People [] Asians;
    public int numberAs = 4;
    Random ran = new Random ();
       public Asians()
    {
        Asians = new People [numberAs];
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
        
        String nationality = "Asians";
        
        
        People Taurean = new People("Tarean", age1, nationality, occupation1, income1);
        People Sean = new People("Sean",age2, nationality, occupation2, income2);
        People Taejun = new People("Taejun",age3, nationality, occupation3, income3);
        People Jun = new People("Jun",age4, nationality, occupation4, income4);
        
        Asians[0] = Taurean;
        Asians[1] = Sean;
        Asians[2] = Taejun;
        Asians[3] = Jun;
    }
        public String toString()
    {
        String people = "";
        for (People person: Asians)
        {
            if (person != null)
                people += person.toString() + "\n";
        }
        return people;
    }
}

