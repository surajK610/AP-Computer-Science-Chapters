package Books;

public class Magazine extends ReadingMaterial
{
    
    String color;
    public Magazine(int pages, boolean spine, boolean pictures, String authors, String color)
    {
       super (pages, spine, pictures, authors);
       this.color = color;
       super.style = "entertaining";
       super.length = "short";
    }
    
    public void seePictures()
    {
        System.out.println("You have looked at the pictures by " + authors);
    }
}
