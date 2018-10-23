public class BookRoom
{
   private int roomNumber;
   private String guests;
   private int roomSize;
   private int price;
   private boolean availability;
   
   public BookRoom()
   {
      this.roomNumber = 0;
      this.guests = "";
      this.roomSize = 0;
      this.price = 0;
      this.availability = true;
    }
    
    public BookRoom(int roomNumber, String guests, int roomSize, int price, boolean availability)
    
    {
      this.roomNumber = roomNumber;
      this.guests = guests;
      this.roomSize = roomSize;
      this.price = price;
      this.availability = availability;
    }
    
    //getters & setters
     public void setRoomNumber(int roomNumber){
         this.roomNumber = roomNumber;
      }
      
      public int getRoomNumber(){
         return this.roomNumber;
      }


       public void setGuests(String guests){
         this.guests = guests;
      }
      
      public String getGuests(){
         return this.guests;
      }
      
      public void setRoomSize(int roomSize){
         this.roomSize = roomSize;
      }
      
      public int getRoomSize(){
         return this.roomSize;
      }
      
      public void setPrice(int price){
         this.price = price;
      }
      
      public int getPrice(){
         return this.price;
      }
      
      public void setAvailability(boolean availability){
         this.availability = availability;
      }
      
      public boolean getAvailability(){
         return this.availability;
      }
      
   public String toString()
   {
      String s = "";
      s+="\nRoom nr: " + getRoomNumber() +"\n";
      s+="Guests: " + getGuests() +"\n";
      s+="Room size: " + getRoomSize() +"\n";
      s+="Price: " + getPrice() +"\n";
      s+="Availability: " + getAvailability() +"\n";
      return s;
   }

}