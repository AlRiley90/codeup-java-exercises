import java.util.Scanner;

import java.util.Random;
public class HighLow {
    public static void main(String[] args) {
        int theNumber = randomNum();
        guessingGame(theNumber);

    }

    public static void guessingGame(int theNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int userGuess = scanner.nextInt();
        while (userGuess != theNumber) {

            if (userGuess > theNumber) {
                System.out.println("LOWER");
                continue;
            } else if (userGuess < theNumber) {
                System.out.println("HIGHER");
                continue;
            } else if (userGuess > 100) {
                System.out.println("That number is too high. Remember the rules!");
                continue;
            } else if (userGuess < 1) {
                System.out.println("That number is too low. Rmemeber the rules");
                continue;
            } else if (userGuess == theNumber) {
                System.out.println("GOOD GUESS! YOU WIN!");
                break;
            }
        }
    }
    public static int randomNum(){
        Random rand = new Random();
        int theNumber = rand.nextInt(100);
        theNumber += 1;
        return theNumber;
    }
}
