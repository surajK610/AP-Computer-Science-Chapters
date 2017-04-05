package Firm;

public class Commissioner extends Hourly
{
   public double totalSales = 0;
   public double commissionRate;
   //-----------------------------------------------------------------
   //  Sets up this hourly employee using the specified information.
   //-----------------------------------------------------------------
   public Commissioner (String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate, double commissionRate)
   {
      super (eName, eAddress, ePhone, socSecNumber, rate);
      this.commissionRate = commissionRate;
      hoursWorked = 0;
   }
   
   //-----------------------------------------------------------------
   //  Adds the specified number of sales to this employee's
   //  accumulated sales.
   //-----------------------------------------------------------------
   public void addSales(double sales)
   {
       totalSales += sales;
    }
    
   //-----------------------------------------------------------------
   //  Computes and returns the pay for this hourly employee.
   //-----------------------------------------------------------------
   public double pay()
   {
      double payment = super.pay();
      payment += (totalSales * commissionRate);
      totalSales = 0;

      return payment;
   }

   //-----------------------------------------------------------------
   //  Returns information about this hourly employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();
      
      result += "\nSales: " + (totalSales);
      result += "\nCommission: " + (totalSales * commissionRate);
      
      return result;
   }
}
