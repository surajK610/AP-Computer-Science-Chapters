
// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
	Labrador lab = new Labrador("Lab", "red");
	System.out.println(lab.getName() + " says " + lab.speak());
	
	Yorkshire york = new Yorkshire("York");
	System.out.println(york.getName() + " says " + york.speak());
	
	System.out.println("Average Labrador weight: " + lab.avgBreedWeight());
	
	System.out.println("Average Yorkshire weight: " + york.avgBreedWeight());

    }
}
