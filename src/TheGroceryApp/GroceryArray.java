package TheGroceryApp;

public class GroceryArray {
    public static Grocery[] allItems(){
        return new Grocery[]{
                new Grocery("eggs", "dairy"),
                new Grocery("butter", "dairy"),
                new Grocery("sour cream", "dairy"),
                new Grocery("milk", "dairy"),
                new Grocery("yogurt", "dairy"),
                new Grocery("cheese", "dairy"),
                new Grocery("bacon", "meat"),
                new Grocery("chicken", "meat"),
                new Grocery("beef", "meat"),
                new Grocery("ground beef", "meat"),
                new Grocery("hot dogs", "meat"),
                new Grocery("burgers", "meat"),
                new Grocery("chips", "snacks"),
                new Grocery("candy", "snacks"),
                new Grocery("cookies", "snacks"),
                new Grocery("pizza", "frozen"),
                new Grocery("waffles", "frozen"),
                new Grocery("ice cream", "frozen"),
                new Grocery("vegetables", "frozen"),
                new Grocery("TV Dinners", "frozen"),
                new Grocery("apples", "produce"),
                new Grocery("avocado", "produce"),
                new Grocery("bananas", "produce"),
                new Grocery("berries", "produce"),
                new Grocery("beans", "produce"),
                new Grocery("broccoli", "produce"),
                new Grocery("celery", "produce"),
                new Grocery("ketchup", "condiments"),
                new Grocery("mustard", "condiments"),
                new Grocery("mayonnaise", "condiments"),
                new Grocery("oil", "condiments"),
                new Grocery("spices", "condiments")

        };
    }
}
