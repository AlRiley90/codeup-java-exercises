package movies;
import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] moviesArr = MoviesArray.findAll();
        System.out.print("What would you like to do? \n 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view movies in the drama category \n 4 - view movies in the horror category \n 5 - view movie in the scifi category \n 6 - view movies in the comedy category \n 7 - view movies in the musical category \n  Enter your choice: ");
        Input input = new Input();
        switch(input.getString()){
            case "0":
                System.out.println("Exiting application from input: " + input.getString());
                break;
            case "1":
                System.out.println("Viewing all movies: ");
                Movie.getAll();
                break;
            case "2":
                System.out.println("Viewing anime movies: ");
//                Movie.displayAnime(Movie.getAnime(moviesArr));
                Movie.viewMoviesCategory("animated");
                break;
            case "3":
                System.out.println("Viewing all drama movies: ");
//                Movie.displayDrama(Movie.getDrama(moviesArr));
                Movie.viewMoviesCategory("drama");
                break;
            case "4":
                System.out.println("Viewing all horror movies: ");
//                Movie.displayHorror(Movie.getHorror(moviesArr));
                Movie.viewMoviesCategory("horror");
                break;
            case "5":
                System.out.println("Viewing all scifi movies: ");
//                Movie.displayScifi(Movie.getScifi(moviesArr));
                Movie.viewMoviesCategory("scifi");
                break;
            case "6":
                System.out.println("Viewing all comedies: ");
//                Movie.displayComedy(Movie.getComedy(moviesArr));
                Movie.viewMoviesCategory("comedy");
                break;
            case "7":
                System.out.println("Viewing all musicals: ");
//                Movie.displayMusical(Movie.getMusical(moviesArr));
                Movie.viewMoviesCategory("musical");
                break;
        }

    }
}
