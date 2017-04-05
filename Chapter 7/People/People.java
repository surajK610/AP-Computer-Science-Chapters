package People;
import java.text.*;

public class People
{
    public int age;
    public String gender;
    public String nationality;
    public String occupation;
    public double income;
    public People [] people;
    String name;
    NumberFormat cur = NumberFormat.getCurrencyInstance();;
    public People(String name, int age, String nationality, String occupation, double income)
    {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.occupation = occupation; 
        this.income = income;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getNationality()
    {
        return nationality;
    }
    public String getOccupation()
    {
        return occupation;
    }
    public double getIncome()
    {
        return income;
    }
    public double getAverageAge()
    {
        int sum = 0;
        double average = 0;
        if (people[0] == null)
        {
            return 0;
        }
        else 
        {
            for (People person: people)
            {
                if (person != null)
                    sum += person.getAge(); 
            }
            average = (double)sum/people.length;
        }
        return average;
    }
    public String getMostNationality()
    {
        String most = "";
        if (people[0] == null)
        {
            return "null";
        }
        return most;
    }
    public String getMostOccupation()
    {
        String most = "";
        if (people[0] == null)
        {
            return "null";
        }
        return most;
    }
    public double getAverageIncome()
    {
        int sum = 0;
        double average = 0;
        if (people[0] == null)
        {
            return 0;
        }
        else 
        {
            for (People person: people)
            {
                if (person != null)
                    sum += person.getIncome(); 
            }
            average = (double)sum/people.length;
        }
        return average;
    }
    public String toString()
    {
        String person = "\n" + name + "\n" + "Age: " + age + "    Nationality: " + nationality + "    Occupation: " + occupation + "    Income: " + cur.format(income);
        return person;
    }
}
