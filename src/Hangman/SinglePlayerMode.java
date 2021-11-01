package Hangman;

public class SinglePlayerMode {

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

    public static char playerGuess(char input){
        if(input )
    }
}
