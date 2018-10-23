import java.util.Scanner;
public class Menu
{
   public static void main(String[] args)
   {
    Main print = new Main();
     
   
   
   Scanner in = new Scanner(System.in);
      //løkkevariabel
      boolean koerProgram = true;
      int valg = 0;
      int book = 0;
      int room = 0;
      //whileøkke, der bliver ved indtil koerProgram er false.
      while(koerProgram)
      {
         //udskirver menu - System.out.println()
         System.out.print("Press 1 for Staff - Press 2 for Resturant - Press 3 for Bed and Breakfast - OR 0 for exit: "); 
        
         //læs valg fra keyboard in.nextInt().
         valg = in.nextInt();
         //find ud af hvad der blev valgt.
         System.out.println("Du har valgt: " + valg);
         
         if (valg == 1)
         {
            //Klad eks. reservationsmodulet
            //reservation res = new Reservation();
            //res.reservationsMenu();
            System.out.println("You have chosen workpan");
             print.printStaff();
         }
         if (valg == 2)
         {
            //Klad eks. reservationsmodulet
            //reservation res = new Reservation();
            //res.reservationsMenu();
            System.out.println("you have chosen Resturant");
             print.printResturant();
         }
         if (valg == 3)
         {
            System.out.println("Vælg 1 for Info om Bed and Breakfast - Vælg 2 for Room booking");
            book = in.nextInt();
            if (book == 1){
            //Klad eks. reservationsmodulet
            //reservation res = new Reservation();
            //res.reservationsMenu();
            System.out.println("You have chosen Bed and Breakfast");
            print.printBnB();
            }
            if (book == 2){
            print.printBookRoom();
            System.out.println("Pick an available room");
             room = in.nextInt();
            }
           
             if (room == 1){
            System.out.println("This room is not available");
            }
           
              if (room == 2){
             System.out.println("Room 2 is now booked");
         }
      
          
              if (room == 3){
             System.out.println("Room 3 is now booked");
         }
         
        
              if (room == 4){
             System.out.println("This room is not available");
         }
           
       
              if (room == 5){
             System.out.println("Room 5 is now booked");
         }
         }

         if (valg == 0){
            //der er valgt 0
            System.out.println("Thnaks for using this program.");
            koerProgram = false; //fortæller løkken at vi skal stoppe programet.
          }
       /*  else
         {
            System.out.println("Programmet burde ikke komme her til");
            koerProgram = false;
            } */
        

}}}

