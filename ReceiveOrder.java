public class ReceiveOrder
{
   private double time;
   private String dish;
   private String allergies;
   private int guestNumber;
   
   public ReceiveOrder()
   {
      this.time = 0.0;
      this.dish = "";
      this.allergies = "";
      this.guestNumber = 0;
    }
    
    public ReceiveOrder(double time, String dish, String allergies, int guestNumber)
    {
      this.time = time;
      this.dish = dish;
      this.allergies = allergies;
      this.guestNumber = guestNumber;
     }
      //Get and set
      public void setTime(double time){
         this.time = time;
      }
      
      public double getTime(){
         return this.time;
      }
      
      public void setDish(String dish){
         this.dish = dish;
      }
      
      public String getDish(){
         return this.dish;
      }
      public void setAllergies(String allergies){
         this.allergies = allergies;
      }
      
      public String getAllergies(){
         return this.allergies;
      }
      public void setGuestNumber(int guestNumber){
         this.guestNumber = guestNumber;
      }
      
      public int getGuestNumber(){
         return this.guestNumber;
      }
}

    