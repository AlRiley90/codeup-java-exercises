import java.util.Arrays;

public class ServerNameGenerator {
    public static String[] adjectives = {"nice", "mean", "hot", "smart", "tall", "short", "fat", "skinny", "fit", "bald"};

   public static String[] nouns = {"dog", "cat", "kid", "adult", "ball", "stick", "wheel", "chain", "bat", "bottle"};


    public static void randomElement(String[] nouns, String[] adjectives){

            int randomNoun = (int) Math.floor(Math.random() * nouns.length);
            int randomAdj = (int) Math.floor(Math.random() * adjectives.length);
            System.out.println(adjectives[randomAdj] + "-" +nouns[randomNoun]);



    }

    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
        randomElement(nouns, adjectives);
    }


}