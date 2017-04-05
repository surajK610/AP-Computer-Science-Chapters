import java.util.*;
public class Item
{
    String name;
    double price;
    int quant;
    int loc;
    ArrayList <Item> items = new ArrayList <Item>();
    
    public Item (String name, double price, int quant, int loc) 
    {
        this.name = name;
        this.price = price;
        this.quant = quant;
        this.loc = loc;
    }
    
    public void ItemList(ArrayList <Item> items)
    {
        this.items = items;
    }
    
    public void add(Item item)
    {
        items.add(item);
    }
    
    public String toStringItem()
    {
        String itemS = "Name:" + name + "\n";
        itemS +=  "Price:" + price + "\n";
        itemS +=  "Quantity:" + quant + "\n";
        itemS +=  "Location(Row)" + loc + "\n";
        return itemS;
    }
    
    
}
