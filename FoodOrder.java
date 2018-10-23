public class FoodOrder
{
   private String dish;
   private String drinks;
   private int table;
   private double totalCost;
   private double time;
   private int guestNumber;
   private String specialRequests;
   
   public FoodOrder()
   {
      this.dish = "";
      this.drinks = "";
      this.table = 0;
      this.totalCost = 0.0;
      this.time = 0.0;
      this.guestNumber = 0;
      this.specialRequests = "";
    }
    
    public FoodOrder(String dish, String drinks, int table, double totalCost, double time, int guestNumber, String specialRequests)
    {
      this.dish = dish;
      this.drinks = drinks;
      this.table = table;
      this.totalCost = totalCost;
      this.time = time;
      this.guestNumber = guestNumber;
      this.specialRequests = specialRequests;
     }
     
     //Get and set
      public void setDish(String dish){
         this.dish = dish;
      }
      
      public String getDish(){
         return this.dish;
      }
      
      public void setDrinks(String drinks){
         this.drinks = drinks;
      }
      
      public String getDrinks(){
         return this.drinks;
      }
      
      public void setTable(int table){
         this.table = table;
      }
      
      public int getTable(){
         return this.table;
      }
      
      public void setTotalCost(double totalCost){
         this.totalCost = totalCost;
      }
      
      public double getTotalCost(){
         return this.totalCost;
      }
      
      public void setTime(double time){
         this.time = time;
      }
      
      public double getTime(){
         return this.time;
      }
      
      public void setGuestNumber(int guestNumber){
         this.guestNumber = guestNumber;
      }
      
      public int getGuestNumber(){
         return this.guestNumber;
      }
      
       public void setSpecialRequests(String specialRequests){
         this.specialRequests = specialRequests;
      }
      
      public String getSpecialRequests(){
         return this.specialRequests;
      }
}
