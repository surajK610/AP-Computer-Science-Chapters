package Books;

import java.util.*;
/**
 * Write a description of class Dictionary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dictionary extends ReadingMaterial
{
    
    String brand;
    public Dictionary(int pages, boolean spine, boolean pictures, String authors, String brand)
    {
       super (pages, spine, pictures, authors);
       this.brand = brand;
       super.style = "definitions";
       super.length = "lengthy";
    }
    
    public void goToLetter(char Letter)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("You have flipped to letter " + Letter + ".");
        System.out.println("What word do you want to lookup? ");
        String word = scan.next();
        
        if (word.charAt(0)== Letter)
        {
            System.out.println(word + " means to sleep.");
        }
        else 
        {
            System.out.println("You are in the wrong section.");
        }
    }
}

