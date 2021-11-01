public class Candy {
    public String name;
    public String size;

    public Candy(String candyName){
//        this.name = candyName;
//        this.size = "fun-size";

        this(candyName, "fun-size");
    }
    public Candy(String candyName, String candySize){
        this.name = candyName;
        this.size = candySize;
    }






    public static void main(String[] args) {
        Candy reeses = new Candy("Reese's", "Full-Size");
        System.out.println("Ahhh, a " + reeses.name + "! I see that you got the " + reeses.size + " of it. Sounds good! :)");
    }
}
