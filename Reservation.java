public class Reservation
{
   private int reservationDuration;
   private String checkInDate;
   private int guestId;
   private int roomNumber;
   
   public Reservation()
   {
      this.reservationDuration = 0;
      this.checkInDate = "";
      this.guestId = 0;
      this.roomNumber = 0;
    }
    
    public Reservation(int reservationDuration, String checkInDate, int guestId, int roomNumber)
    {
      this.reservationDuration = reservationDuration;
      this.checkInDate = checkInDate;
      this.guestId = guestId;
      this.roomNumber = roomNumber;
    }
    
      //getters & setters

       public void setReservationDuration(int reservationDuration){
         this.reservationDuration = reservationDuration;
      }
      
      public int getReservationDuration(){
         return this.reservationDuration;
      }
      
       public void setCheckInDate(String checkInDate){
         this.checkInDate = checkInDate;
      }
      
      public String getCheckInDate(){
         return this.checkInDate;
      }
      
       public void setGuestId(int guestId){
         this.guestId = guestId;
      }
      
      public int getGuestId(){
         return this.guestId;
      }
      
       public void setRoomNumber(int roomNumber){
         this.roomNumber = roomNumber;
      }
      
      public int getRoomNumber(){
         return this.roomNumber;
      }
}
