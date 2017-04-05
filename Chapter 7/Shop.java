
// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;

import java.util.*;
import java.text.*;

public class Shop
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        ArrayList <Item> cart = new ArrayList<Item>();
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice = 0;
        int count = 0;
    
        String keepShopping = "y";
    
        while (keepShopping.equalsIgnoreCase("y")) 
                  {
                System.out.print ("Enter the name of the item: "); 
                if(count != 0)
                    itemName = scan.nextLine();
                itemName = scan.nextLine();
                count++;
        
                System.out.print ("Enter the unit price: ");
                itemPrice = scan.nextDouble();
        
                System.out.print ("Enter the quantity: ");
                quantity = scan.nextInt();
        
                // *** create a new item and add it to the cart
                item = new Item(itemName, itemPrice, quantity);
                cart.add(item);
        
                // *** print the contents of the cart object using println
                System.out.println("\nItem\t  Unit Price\t  Quantity\tTotal");
                for(int i = 0; i < cart.size(); i ++)
                {
                    
                    System.out.println(cart.get(i) + "\t");
                    
                }
                totalPrice += cart.get(cart.size() - 1).getQuantity() * cart.get(cart.size() -1).getPrice();
                System.out.println("The total price is " + cur.format(totalPrice));
        
                System.out.print ("Continue shopping (y/n)? ");
                keepShopping = scan.next();
            }
        System.out.println("Please pay " + cur.format(totalPrice));
    }
}


