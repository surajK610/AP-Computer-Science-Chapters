package Books;



public class Book extends ReadingMaterial
{
    String color;
    String title;
    public Book(int pages, boolean spine, boolean pictures, String authors,String title,  String color)
    {
       super (pages, spine, pictures, authors);
       this.color = color;
       this.title = title;
       super.style = "commercial";
       super.length = "diverse";
    }
    public void read ()
    {
        System.out.println("You have read " + title + " by " + authors +  ".");
    }
}
