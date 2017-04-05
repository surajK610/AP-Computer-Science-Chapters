package People;

import java.util.*;

public class European_Descent
{
    People [] Whities;
    public int numberWhites = 100000;
    Random ran = new Random ();
    public European_Descent()
    {
        Whities = new People[numberWhites];
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
        
        String nationality = "European Descent";
        
        
        People Joe = new People("Joe", age1, nationality, occupation1, income1);
        People Sarah = new People("Sarah", age2, nationality, occupation2, income2);
        People Jim = new People("Jim", age3, nationality, occupation3, income3);
        People Smith = new People("Smith", age4, nationality, occupation4, income4);
        
        Whities[0] = Joe;
        Whities[1] = Sarah;
        Whities[2] = Jim;
        Whities[3] = Smith;
        
        
    }
    public String toString()
    {
        String people = "";
        for (People person: Whities)
        {
            if (person != null)
                people += person.toString() + "\n";
        }
        return people;
    }
}
