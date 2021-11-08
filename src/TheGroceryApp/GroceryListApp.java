package TheGroceryApp;

import util.Input;

import static TheGroceryApp.Grocery.getAll;
import static TheGroceryApp.GroceryArray.allItems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListApp {

   public static void main(String[] args) {
      ArrayList<String> categories = new ArrayList<>();
      categories.add("0 - all items");
      categories.add("1 - Dairy");
      categories.add("2 - Meat");
      categories.add("3 - Snacks");
      categories.add("4 - Frozen");
      categories.add("5 - Produce");
      categories.add("\n6 - Condiments");

//      ArrayList<String> groceries = new ArrayList<>();
//      groceries.add(Grocery.getAllItems());
//      System.out.println(groceries);


      Input input = new Input();
      System.out.println("Would you like to create a grocery list?");
      String doContinue = input.getString();
      if(doContinue.equalsIgnoreCase("yes")){
         System.out.println("Please input an option: " + categories);
         switch (input.getString()){
            case "0":
               System.out.println("Here is a list of all grocery items: ");
               Grocery.getAll();
               break;
            case "1":
               System.out.println("Here is a list of all dairy items: ");
               Grocery.viewGroceriesCategory("dairy");
               break;
            case "2":
               System.out.println("Here is a list of all of our meats: ");
               Grocery.viewGroceriesCategory("meat");
               break;
            case "3":
               System.out.println("Here is a list of all of our snacks: ");
               Grocery.viewGroceriesCategory("snacks");
               break;
            case "4":
               System.out.println("Here is a list of all of our frozen products: ");
               Grocery.viewGroceriesCategory("frozen");
               break;
            case "5":
               System.out.println("Here is a list of all of our produce: ");
               Grocery.viewGroceriesCategory("produce");
               break;
            case "6":
               System.out.println("Here is a list of all of our condiments: ");
               Grocery.viewGroceriesCategory("condiments");
               break;
         }

      }
   }



}
