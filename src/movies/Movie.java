package movies;

import java.sql.Array;
import java.util.ArrayList;

import static movies.MoviesArray.findAll;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public static void getAll(){
        for(int i = 0; i < findAll().length; i++) {
            System.out.println(findAll()[i].getName());
        }
    }

    public static ArrayList<Movie> getAnime(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("animated")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayAnime(ArrayList<Movie> animes){
        for(Movie anime : animes){
            System.out.println(anime.getName());
        }
    }

    public static ArrayList<Movie> getDrama(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("drama")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayDrama(ArrayList<Movie> dramas){
        for(Movie drama : dramas){
            System.out.println(drama.getName());
        }
    }

    public static ArrayList<Movie> getHorror(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("horror")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayHorror(ArrayList<Movie> horrors){
        for(Movie horror : horrors){
            System.out.println(horror.getName());
        }
    }

    public static ArrayList<Movie> getScifi(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("scifi")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayScifi(ArrayList<Movie> scifis){
        for(Movie scifi : scifis){
            System.out.println(scifi.getName());
        }
    }
    public static ArrayList<Movie> getComedy(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("comedy")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayComedy(ArrayList<Movie> comedies){
        for(Movie comedy : comedies){
            System.out.println(comedy.getName());
        }
    }

    public static ArrayList<Movie> getMusical(Movie[] movies){
        ArrayList<Movie> movieArr = new ArrayList<>();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getCategory().equals("musical")){
                movieArr.add(movies[i]);
            }
        }
        return movieArr;
    }

    public static void displayMusical(ArrayList<Movie> musicals){
        for(Movie musical : musicals){
            System.out.println(musical.getName());
        }
    }
}
