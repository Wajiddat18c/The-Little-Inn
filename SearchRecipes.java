public class SearchRecipes
{
   String recipes;
   String ingredients;
   String dishName;
   
      
      //Constructor
   public SearchRecipes()
   {
      this.recipes = "";
      this.ingredients = "";
      this.dishName = "";
   }
   
   public SearchRecipes(String recipes, String ingredients, String dishName)
   {
      this.recipes = recipes;
      this.ingredients = ingredients;
      this.dishName = dishName;
   }
   
   //getters & setters
   
   public void setRecipes(String recipes)
   {
      this.recipes = recipes;
   }
   
   public String getRecipes()
   {
      return this.recipes;
   }
   
   public void setIngredients(String ingredients)
   {
      this.ingredients = ingredients;
   }
   
   public String getIngredients()
   {
      return this.ingredients;
   }
   
   public void setDishName(String dishName)
   {
      this.dishName = dishName;
   }
   
   public String getDishName()
   {
      return this.dishName;
   }    
   
}