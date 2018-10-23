public class WorkPlan
{

   int hours;
   double wage;
   int sickDays;
   
      
      //Constructor
   public WorkPlan()
   {
      this.hours = 0;
      this.wage = 0.0;
      this.sickDays = 0;
   }
   
   public WorkPlan(int hours, double wage, int sickDays)
   {
      this.hours = hours;
      this.wage = wage;
      this.sickDays = sickDays;
   }
   
   //getters & setters
   
   public void setHours(int hours)
   {
      this.hours = hours;
   }
   
   public int getHours()
   {
      return this.hours;
   }
   
   public void setWage(double wage)
   {
      this.wage = wage;
   }
   
   public double getWage()
   {
      return this.wage;
   }
   
   public void setSickDays(int sickDays)
   {
      this.sickDays = sickDays;
   }
   
   public int getSickDays()
   {
      return this.sickDays;
   }    
   
   
}