package Books;


public abstract class ReadingMaterial
{
    public int pages;
    public boolean spine;
    public boolean pictures;
    public String authors;
    static String style;
    static String length;
    
    
    public ReadingMaterial(int pages, boolean spine, boolean pictures, String authors)
    {
         this.pages = pages;
         this.spine = spine;
         this.pictures = pictures;
         this.authors = authors;
    }

}
