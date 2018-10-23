import java.util.*;

public class Staff
{
   private String name;
   private int staffId;
   private String userName;
   private String workTitle;
   private double hourlyWage;
   
  //Constructor
   public Staff()
   {
   this.name = "";
   this.staffId = 0;
   this.userName = "";
   this.workTitle = "";
   this.hourlyWage = 0.0;
   
   }
   
   public Staff(String name, int staffId, String userName, String workTitle, double hourlyWage)
   {
   this.name = name;
   this.staffId = staffId;
   this.userName = userName;
   this.workTitle = workTitle;
   this.hourlyWage = hourlyWage;
   }
    
   //set & get metoder
   public void setName(String name)
   {
   this.name = name;
   }
   
   public void setStaffId(int staffId)
   {
   this.staffId = staffId;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public int getStaffId()
   {
      return this.staffId;
   }
   
   public void setUserName(String userName)
   {
   this.userName = userName;
   }
   
   public String getUserName()
   {
      return this.userName;
   }
  
   
   public void setWorkTitle(String workTitle)
   {
      this.workTitle = workTitle;
   }
   
   public String getWorkTitle()
   {
      return this.workTitle;
   }
   
   public void setHourlyWage(double hourlyWage)
   {
      this.hourlyWage = hourlyWage;
   }
   
   public double getHourlyWage()
   {
      return this.hourlyWage;
   }

   public String toString()
   {
      String s = "";
      
      s+="\nName:\t\t" + getName() +"\n";
      s+="Staff Id:\t\t " + getStaffId() +"\n";
      s+="Username:\t\t " + getUserName() +"\n";
      s+="Work title:\t\t " + getWorkTitle() +"\n";
      s+="Hourlywage:\t\t " + getHourlyWage();
      return s;
   }

       
}