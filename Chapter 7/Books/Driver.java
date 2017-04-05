package Books;


/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String [] args)
    {
        Book book1 = new Book (321, true, true, "Martha Osbourne, Henry Jones", "Life of Ni", "yellow");
        Magazine mag1 = new Magazine (10, false, true, "Martha Jones, Henry David", "gold");
        TechnicalJournal tj = new TechnicalJournal (45, true, true, "Harry Den, Henry Sad", "Life");
        Textbook tb = new Textbook (4568, true, false, "Louis H, Jonas Jones");
        Dictionary dic = new Dictionary (1024, false, true, "Mary He", "Websters");
        
        book1.read();
        System.out.println();
        mag1.seePictures();
        System.out.println();
        tj.fallAsleep();
        System.out.println();
        tb.learning("math");
        System.out.println();
        dic.goToLetter('n');
    }
}
