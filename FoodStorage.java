public class FoodStorage
{
   private int ingredientid;
   private double ingredientamount;
   
   public FoodStorage()
   {
      this.ingredientid = 0;
      this.ingredientamount = 0.0;
    }
    public FoodStorage(int ingredientid, double ingredientamount)
    {
      this.ingredientid = ingredientid;
      this.ingredientamount = ingredientamount;
    }
    
       //Get and set
      public void setIngredientid(int ingredientid){
         this.ingredientid = ingredientid;
      }
      
      public int getIngredientid(){
         return this.ingredientid;
      }
      
      public void setIngredientamount(double ingredientamount){
         this.ingredientamount = ingredientamount;
      }
      
      public double getIngredientamount(){
         return this.ingredientamount;
      }
}