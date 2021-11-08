package TheGroceryApp;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static TheGroceryApp.GroceryArray.allItems;

public class Grocery {
    private String name;
    private String category;


    public Grocery(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getItem(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public static void getAll(){
        for (int i=0; i < allItems().length; i++){
            System.out.println(allItems()[i].getItem());
        }
    }

    public static void viewGroceriesCategory(String category){
        for( int i = 0; i < allItems().length; i++){
            if(allItems()[i].getCategory() == category){
                System.out.println(allItems()[i].getItem());
            }
        }
    }


}
