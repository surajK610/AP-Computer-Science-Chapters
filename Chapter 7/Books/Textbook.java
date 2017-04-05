package Books;


/**
 * Write a description of class Textbook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbook extends ReadingMaterial
{
    public Textbook(int pages, boolean spine, boolean pictures, String authors)
    {
       super (pages, spine, pictures, authors);
       super.style = "informative";
       super.length = "long";
    }
    
    public void learning (String subject)
    {
        if (subject.equalsIgnoreCase("math"))
            System.out.println("You have learned some Math.");
        else if (subject.equalsIgnoreCase("english"))
            System.out.println("You have learned some English.");
        if (subject.equalsIgnoreCase("social studies"))
            System.out.println("You have learned some Social Studies.");
        if (subject.equalsIgnoreCase("science"))
            System.out.println("You have learned some Science.");
    }
}

