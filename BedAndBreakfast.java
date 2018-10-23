public class BedAndBreakfast
{
   private int amountOfRooms;
   private String checkInAvaliability;
   private String checkOutAvaliability;
   private String openingHours;
   private int phoneNumber;
   private String email;
   private String addres;
   
   public BedAndBreakfast()
   {
      this.amountOfRooms = 0;
      this.checkInAvaliability = "";
      this.checkOutAvaliability = "";
      this.openingHours = "";
      this.phoneNumber = 0;
      this.email = "";
      this.addres = "";
    }
    public BedAndBreakfast(int amountOfRooms, String checkInAvaliability,String checkOutAvaliability,
                           String openingHours, int phoneNumber,String email,String addres)
      {
         this.amountOfRooms = amountOfRooms;
         this.checkInAvaliability = checkInAvaliability;
         this.checkOutAvaliability = checkOutAvaliability;
         this.openingHours = openingHours;
         this.phoneNumber = phoneNumber;
         this.email = email;
         this.addres = addres;
       }
       
       //getters & setters

       public void setAmountOfRooms(int amountOfRooms){
         this.amountOfRooms = amountOfRooms;
      }
      
      public int getAmountOfRooms(){
         return this.amountOfRooms;
         }

         public void setCheckInAvaliability(String checkInAvaliability){
         this.checkInAvaliability = checkInAvaliability;
      }
      
      public String getCheckInAvaliability(){
         return this.checkInAvaliability;
         }

      public void setCheckOutAvaliability(String checkOutAvaliability){
         this.checkOutAvaliability = checkOutAvaliability;
         }
      
      public String getCheckOutAvaliability(){
         return this.checkOutAvaliability;
         }
       
          public void setOpeningHours(String openingHours){
         this.openingHours = openingHours;
         }
      
      public String getOpeningHours(){
         return this.openingHours;
         }
           public void setPhoneNumber(int phoneNumber){
         this.phoneNumber = phoneNumber;
         }
      
      public int getPhoneNumber(){
         return this.phoneNumber;
         }
                    
          public void setEmail(String email){
         this.email = email;
         }
      
      public String getEmail(){
         return this.email;
         }
         
         public void setAddres(String addres){
         this.addres = addres;
         }
      
      public String getAddres(){
         return this.addres;
         }
         
      public String toString()
   {
      String s = "";
   
   
    s+="Opening hours for Bed and Breakfast: " + getOpeningHours() +"\n";
    s+="\nAvailable to check in between:  " + getCheckInAvaliability() +"\n";
    s+="Available to check out between: " + getCheckOutAvaliability() +"\n";
    s+="Total amount of rooms: " + getAmountOfRooms() +"\n";
    s+="Phone number:\t " + getPhoneNumber() +"\n";
    s+="Email: " + getEmail() +"\n";
    s+="Addres: " + getAddres() +"\n";
    return s;
   
   }    
   
}