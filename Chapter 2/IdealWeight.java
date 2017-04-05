
/*Exercise IdealWeight
 * -----------------------------------
 * This program takes the weight and the gender
 * of a person and calculates their ideal weight.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class IdealWeight
{
    public static void main (String [] args)
    {
        Scanner getHeight = new Scanner (System.in);
        
        DecimalFormat twoPlaces = new DecimalFormat("0.##");//creates a new DecimalFormat to two places
        
        int feet, inches, heightOver5Ft, idealFemale, idealMale;
        double idealFemaleRange1, idealFemaleRange2, idealMaleRange1, idealMaleRange2;
        
        System.out.println("Enter how many feet tall you are (not including the inches)?");
        feet = getHeight.nextInt(); //asks for how many feet
        
        System.out.println("Enter how many inches tall you are (not including the feet)?");
        inches = getHeight.nextInt(); //asks for how many inches
        
        heightOver5Ft = (feet * 12) + inches - 60; 
        
        idealFemale = 100 + 5 * heightOver5Ft; //calculates the ideal female weight for inputed height
        idealMale = 106 + 6 * heightOver5Ft; //calculates the ideal male weight for inputed height
        
        idealFemaleRange1 = idealFemale * .85; //finds female range
        idealFemaleRange2 = idealFemale * 1.15; 
        
        idealMaleRange1 = idealMale * .85; //finds male range
        idealMaleRange2 = idealMale * 1.15;
        
        System.out.println("The ideal body weight of a female at " + feet + "'" + inches 
        + "\" is " + idealFemale + " pounds.");
        
        System.out.println("The ideal body weight range of a female at " + feet + "'" + inches +
        "\" is between " + (int)idealFemaleRange1 + "-" + (int)idealFemaleRange2+ " pounds.");
        
        System.out.println("\nThe ideal body weight of a male at " + feet + "'" + inches 
        + "\" is " + idealMale + " pounds.");
        
        System.out.println("The ideal body weight range of a male at " + feet + "'" + inches 
        + "\" is between " + (int)idealMaleRange1 + "-" + (int)idealMaleRange2 + " pounds.");
        
    }
}