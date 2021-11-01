import java.util.Arrays;

public class ArrayLec {

    public static void main(String[] args) {
        double[] prices = new double[4];

        final int numberOfSides = 6;
        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        
        String[] myBag = {"Snickers", "Reeses", "Kit-Kat Bar"};
        System.out.println("myBag.length = " + myBag.length);
//        System.out.println("myBag[1] = " + myBag[1]);

//        for(int i = 0; i < myBag.length; i++){
//            System.out.println(myBag[i]);
//        }

        //Enhanced for loop
        for(String candy : myBag){
            System.out.println(candy);
        }

        String[] anotherBag = new String[12];

        System.out.println(anotherBag[0]);

        //How to fill anotherBag with a new value
        Arrays.fill(anotherBag, "snickers");
        for(String candy : anotherBag){
            System.out.println(candy);
        }
        
        //How to tell if arrays are equal to one another
        System.out.println("Arrays.equals(anotherBag, myBag) = " + Arrays.equals(anotherBag, myBag));


        String[] myBagPlusTwo = Arrays.copyOf(myBag, 5);
        System.out.println("myBagPlusTwo.length = " + myBagPlusTwo.length);
        //Assigning a value to the last index of the array
        myBagPlusTwo[3] = "Skittles";
        myBagPlusTwo[myBagPlusTwo.length-1] = "Jolly rancher";
        for(String candy : myBagPlusTwo){
            System.out.println(candy);
            //Will produce two null values because the new length has not been assigned extra values
        }

        //Stringify array
        System.out.println(Arrays.toString(myBagPlusTwo));

        //Sort Array
        Arrays.sort(myBagPlusTwo);
        for(String candy : myBagPlusTwo){
            System.out.println(candy);
        }

        //Searching inside of an array
        int skittlesIndex = Arrays.binarySearch(myBagPlusTwo, "Skittles");
        System.out.println(skittlesIndex);

        int[][] matrix = {
                {1, 2, 3}, //arr1
                {4, 5, 6}, //arr2
                {7, 8, 9}  //arr3 : All elements of the outer array
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

        System.out.println("matrix[1][1] = " + matrix[1][1]);

    }
   
    
    
    
    
}
