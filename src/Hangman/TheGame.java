package Hangman;

import java.util.Scanner;

public class TheGame {
    public Scanner scanner;

//    String wordSelector() {
////        Scanner scanner = new Scanner(System.in);
//        System.out.println("Player 1 enter a word: ");
//        String theWord = scanner.nextLine();
//        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n");
//        return theWord;
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        - prompt a player 1 to enter a word for player 2 to guess
//        - track the number of guesses by player 2
//        - display to the user the partially completed word
//        - string methods from the lesson will be helpful for this bonus
//        scanner.wordSelector();
//        System.out.println(SinglePlayerMode.wordSelector(WordsArray.words));
        System.out.println("1 - to play single player mode \n2 - to play two player mode. Enter your choice: ");
        String players = scanner.nextLine();
        if(players.equals("1")){
//            SinglePlayerMode.wordSelector(WordsArray.words);
            String theMagicWord = SinglePlayerMode.wordSelector(WordsArray.words);
            char[] splicedWord = SinglePlayerMode.wordSplicer(theMagicWord);
            System.out.println("Guess a letter");
            String playerGuess = scanner.next();
            SinglePlayerMode.comparePlayerGuess(playerGuess, theMagicWord, splicedWord);
        }

    }
    }

