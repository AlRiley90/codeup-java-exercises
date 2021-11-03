package Hangman;


import java.util.Scanner;

public class SinglePlayerMode {
Scanner scanner = new Scanner(System.in);
public String theWord;


    public static String wordSelector(String[] words){
        int randomWord = (int) Math.floor(Math.random() * words.length);
        String theWord = words[randomWord];
        return theWord;
    }

    public static char[] wordSplicer(String theWord){
        char[] splicedWord = theWord.toCharArray();
        System.out.println(splicedWord);

        for(char i = 0; i<splicedWord.length; i++ ){
            splicedWord[i] = '_';
        }
        System.out.println(splicedWord);
        return splicedWord;
    }

    public static String comparePlayerGuess(String playerGuess, String theWord, char[] splicedWord){
//        System.out.println(playerGuess);
//        System.out.println(theWord);
        if(theWord.contains(playerGuess)){
            int letterIndex = theWord.indexOf(playerGuess);
//            splicedWord.charAt(letterIndex) = playerGuess;
            String replaceLetter = theWord.replace("_",playerGuess);
            System.out.printf("You got it! %n%s", letterIndex);
        }else{
            System.out.println("Try again");
        }
        return "You got it!";
    }
}
