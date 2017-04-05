
public class MSDrive
{
    public static void main(String [] args)
    {
         int [][] magicSq = new int [3][3];
         MagicSquare ms = new MagicSquare();
         boolean isMagic = false;
         
         magicSq = ms.input( magicSq.length, magicSq[0].length);
         isMagic = ms.isMagicSquare(magicSq, 15);
         
         if(isMagic)
         System.out.println("Your square is MAGIC ");
         else
         System.out.println("Your square is NOT MAGIC ");
    }
}
