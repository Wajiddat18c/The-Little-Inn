import java.util.*;

public class Main
{
  // public static void main(String[] args)
  public Main()
   {
 
   
      } public void printStaff(){
      Staff[] staff = new Staff[3];
      
      staff[0] = new Staff ("Joe ", 763, "joe763 ", "The servant ", 120.6);
      staff[1] = new Staff ("Ramsey ", 788, "Ramsey788 ", "The cheff ", 180.35);
      staff[2] = new Staff ("Mrs.Brown ", 744, "MrsBrown763 ", "B&B ", 200.45);
      
      System.out.println(Arrays.toString(staff));
      }
      public void printResturant(){
   
      Resturant resturant = new Resturant("8:00 - 20:00", 35, 35111455);
      System.out.println(resturant);
      }
      public void printBnB(){
      BedAndBreakfast bnb = new BedAndBreakfast(12,"6:00 - 22:00", "8:00 - 18:00","5:00 - 24:00", 75963012, "TheLittleInn@gmail.com", "Denamrk");
                 
      System.out.println(bnb);
       }
     public void printBookRoom(){
       Scanner scan = new Scanner(System.in);
      BookRoom[] book = new BookRoom[5];
      book[0] = new BookRoom(1, "Joe", 2, 300, false);
      book[1] = new BookRoom(2, "None", 4, 550, true);
      book[2] = new BookRoom(3, "None", 1, 200, true);
      book[3] = new BookRoom(4, "Knud", 6, 700, false);
      book[4] = new BookRoom(5, "None", 1, 200, true);
      
      System.out.println(Arrays.toString(book));
      }
          
     
   }
