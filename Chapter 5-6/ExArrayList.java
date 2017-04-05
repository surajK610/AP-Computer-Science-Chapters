import java.util.*;

public class ExArrayList
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        ArrayList <String> family = new ArrayList <String>();
        String another = "y";
        
        while(another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a family member:");
            family.add(scan.next());
            
            System.out.println("Add another (y/n)?");
            another = scan.next();
        }
        System.out.println(family);
        
        family.remove("buffalo");
        
        System.out.println(family);
        
        System.out.println(family.size());
        
        family.set(2, "ghoul");
        
        Iterator it = family.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println(family.get(3));
        
        System.out.println(family.contains("shaan"));
        family.clear();
        
        System.out.println(family.isEmpty());
        
        System.out.println(family);
    }
}
