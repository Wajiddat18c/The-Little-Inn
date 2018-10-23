public class Room 
{
   private int size;
   private int price;
   private boolean clean;
   private boolean available;
   
   public Room()
   {
      this.size = 0;
      this.price = 0;
      this.clean = true;
      this.available = true;
    }
    
    public Room(int size, int price, boolean clean, boolean available)
    
       this.size = size;
      this.price = price;
      this.clean = clean;
      this.available = available;
    }

      //getters & setters

       public void setSize(int size){
         this.size = size;
      }
      
      public int getSize(){
         return this.size;
      }
        public void setPrice(int price){
         this.price = price;
      }
      
      public int getPrice(){
         return this.price;
      }
      
       public void setClean(boolean clean){
         this.clean = clean;
      }
      
      public boolean getClean(){
         return this.clean;
      }

       public void setAvailable(boolean available){
         this.available = available;
      }
      
      public boolean getAvailable(){
         return this.available;
      }
}
