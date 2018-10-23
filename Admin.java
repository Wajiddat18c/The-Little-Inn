public class Admin
{
   String name;
   String adminId;
   
   //Constructor
   
      public Admin()
      {
      this.name = "";
      this.adminId = "";
      }
      
      public Admin(String name, String adminId)
      {
      this.name = name;
      this.adminId = adminId;
      }
      
      //getters & setters
      
      public void setName(String name)
      {
         this.name = name;
      }
      
      public String getName()
      {
         return this.name;
      }
      
      public void setAdminId(String adminId)
      {
         this.adminId = adminId;
      }
      
      public String getAdminId()
      {
         return this.adminId;
      }

}