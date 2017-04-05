
public class Ex1_Driver
{
    public static void main (String [] args)
    {
        MonetaryCoin coin1 = new MonetaryCoin (1);
        MonetaryCoin coin2 = new MonetaryCoin (5);
        MonetaryCoin coin3 = new MonetaryCoin (10);
        MonetaryCoin coin4 = new MonetaryCoin (25);
        
        System.out.println("The sum of a penny, nickel, dime, and quarter is " + (coin1.getValue() + coin2.getValue() + coin3.getValue() + coin4.getValue()) + " cents.");
        System.out.println("The face of the penny is " + coin1 + ".");
        coin1.flip();
        System.out.println("Now the face of the penny is " + coin1 + " after it has been flipped.");
    }
}
