import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        - prompt a player 1 to enter a word for player 2 to guess
//        - track the number of guesses by player 2
//        - display to the user the partially completed word
//        - string methods from the lesson will be helpful for this bonus
        System.out.println("Player 1 enter a word: ");
        String theWord = scanner.nextLine();
        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n");

        char splicedWord[] = theWord.toCharArray();
//        System.out.println(splicedWord);
//        int wordLength = theWord.length();
//        String revealedWord = "";
//        String dash = "_";
//        for(char i = 0; i<wordLength; i++){
//            String theAnswer =  revealedWord + dash;
//        }
//        String theAnswer =  revealedWord + dash;
//        System.out.println(theAnswer);
        for(char i = 0; i<splicedWord.length; i++ ){
            splicedWord[i] = '_';
//            System.out.println(splicedWord);
        }

        System.out.println(splicedWord);

        System.out.println("Player 2, guess a letter");
        String guess = scanner.next();
        if(theWord.contains(guess)){
//            splicedWord.replace('_', guess);
        }

    }
}
