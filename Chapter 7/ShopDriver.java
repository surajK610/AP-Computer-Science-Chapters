import java.util.Scanner;
import java.text.*;
public class ShopDriver
{
   public static void main(String[]args)
   {
       Scanner scan = new Scanner(System.in);
       String itemN = "";
       double price = 0;
       int quantity = 0;
       ShoppingCart cart = new ShoppingCart();
       NumberFormat currency = NumberFormat.getCurrencyInstance();
       
       System.out.println("Would you like to add an item to your cart (y/n)?");
       String addanother = scan.next();
       
       while(addanother.equalsIgnoreCase("Y"))
       {
           System.out.println("What is your item name?");
           itemN = scan.nextLine();
           itemN = scan.nextLine();
           
           System.out.println("What is your item price (in $)?");
           price = scan.nextDouble();
           
           System.out.println("What is your item quantity?");
           quantity = scan.nextInt();
           
           cart.addToCart(itemN, price, quantity);
           
           System.out.println(cart);
           
           System.out.println("Do you want to add another item to cart (y/n)?");
           addanother = scan.next();
        }
      
       System.out.println("Please pay " + currency.format(cart.getTotalPrice()));
    }
}
