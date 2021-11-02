import java.util.Arrays;

public class Candy {
    public String name;
    public String size;
    public String[] descriptors;

    public Candy(String candyName){
//        this.name = candyName;
//        this.size = "fun-size";

        this(candyName, "fun-size");
    }
    public Candy(String candyName, String candySize){
        this.name = candyName;
        this.size = candySize;
    }



    public Candy(String candyName, String candySize, String[] candyDescriptors){
        this.name = candyName;
        this.size = candySize;
        this.descriptors = candyDescriptors;

    }


    public static void main(String[] args) {
        Candy reeses = new Candy("Reese's", "Full-Size");
        System.out.println("Ahhh, a " + reeses.name + "! I see that you got the " + reeses.size + " of it. Sounds good! :)");


        //Below is how you add an array of strings to new candy object
        Candy eminems = new Candy("M&Ms", "bite-size", new String[]{"chocolate", "candy-coated", "bite-sized"});
        System.out.println(eminems.name +" " + eminems.size +" "+ Arrays.toString(eminems.descriptors));

        Candy[] myBag = {eminems, reeses};
        for(Candy singleCandy : myBag){
            String descriptors = Arrays.toString(singleCandy.descriptors);
            //The below code trims the brackets from printing in the array
            descriptors = descriptors.substring(1, descriptors.length() - 1);
            System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, descriptors);
        }
    }
}
