package Hospital;

public class Employee
{
    boolean isFree;
    String name;
    
    public Employee(boolean isFree, String name)
    {
        this.isFree = isFree;
        this.name = name;
    }
    
        public void setIsFree(boolean free)
    {
        isFree = free;
    }
    
    public boolean getIsFree()
    {
        return isFree;
    }
}
