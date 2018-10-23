public class Resturant
{
   String openingHours;
   int amountOfTables;
   int phoneNumber;
   
      
      //Constructor
   public Resturant()
   {
      this.openingHours = "";
      this.amountOfTables = 0;
      this.phoneNumber = 0;
   }
   
   public Resturant(String openingHours, int amountOfTables, int phoneNumber)
   {
      this.openingHours = openingHours;
      this.amountOfTables = amountOfTables;
      this.phoneNumber = phoneNumber;
   }
   
   //getters & setters
   
   public void setOpeningHours(String openingHours)
   {
      this.openingHours = openingHours;
   }
   
   public String getOpeningHours()
   {
      return this.openingHours;
   }
   
   public void setAmountOfTables(int amountOfTables)
   {
      this.amountOfTables = amountOfTables;
   }
   
   public int getAmountOfTables()
   {
      return this.amountOfTables;
   }
   
   public void setPhoneNumber(int phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }
   
   public int getPhoneNumber()
   {
      return this.phoneNumber;
   }
   
   public String toString()
   {
      String s = "";
   
    s+="\nOpening hours is between: " + getOpeningHours() +"\n";
    s+="Amount of tables:  " + getAmountOfTables() +"\n";
    s+="Phone number: " + getPhoneNumber() +"\n";
    return s;
   
   }    
   
}