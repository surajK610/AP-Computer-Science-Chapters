package Hospital;

 

public class Patient
{
    private boolean isSick;
    private boolean isHealable;
    private int daysLeftStay;
    
    public Patient(boolean isSick, boolean isHealable, int daysStay)
    {
        this.isSick = isSick;
        this.isHealable = isHealable;
        daysLeftStay = daysLeftStay;
    }

    public boolean getIsSick()
    {
        return isSick;
    }
    
    public boolean getIsHealable()
    {
        return isHealable;
    }
    
    public int getDaysLeftStay()
    {
        return daysLeftStay;
    }
    
    public void minusDay ()
    {
        daysLeftStay --;
    }
    
    public void addDaysLeft (int days)
    {
        daysLeftStay += days;
    }
    
    private boolean toPrepare(Nurse nurse)
    {
        boolean prepared =  nurse.preparePatient(this);
        return prepared;
    }
    
    public boolean heal (Doctor doc, Nurse nurse)
    {
        if (getIsHealable() && getIsSick() && doc.getIsFree())
        {
            isSick = !(doc.heal(this, nurse));
            daysLeftStay += 10;
            return true;  
        }
        return false;
    }
}
