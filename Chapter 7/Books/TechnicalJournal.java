package Books;


/**
 * Write a description of class Journal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TechnicalJournal extends ReadingMaterial
{
    String title;
    public TechnicalJournal(int pages, boolean spine, boolean pictures, String authors, String title)
    {
       super (pages, spine, pictures, authors);
       this.title = title;
       super.style = "technical";
       super.length = "medium";
    }
    
    public void fallAsleep()
    {
        System.out.println("You have fallen asleep of boredom.");
    }
}

