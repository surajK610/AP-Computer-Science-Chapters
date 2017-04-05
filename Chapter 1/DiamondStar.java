
/* File: DiamondStar.java
 * Exercise 1.5
 * -----------------------------
 * This program creates a diamond out of stars
 * using the least amount of spaces possible.
 */
public class DiamondStar 
{
    // This method makes and prints the diamond.
    public static void main(String[] args)
    {
         //creates layers of the diamond. 
        String diamond1= "    *";
        String diamond2= "   ***";
        String diamond3= "  *****";
        String diamond4= " *******";
        String diamond5= "*********";
        //prints out layers of the diamond.
        System.out.println(diamond1);
        System.out.println(diamond2);
        System.out.println(diamond3);
        System.out.println(diamond4);
        System.out.println(diamond5);
        System.out.println(diamond4);
        System.out.println(diamond3);
        System.out.println(diamond2);
        System.out.println(diamond1);
    
    }

}
