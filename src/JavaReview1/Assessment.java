package JavaReview1;

import java.util.Objects;

import static movies.MoviesArray.findAll;

public class Assessment {



    public static int half(int num){
        return num/2;
    }

    public static String shout(String word){
        return word.toUpperCase()+"!!!";
    }

    public static String removeCats() {
        String[] noCats = null;
        for (int i = 0; i < AnimalsArray.getAnimals().length; i++) {
            if (!Objects.equals(AnimalsArray.getAnimals()[i].getSpecies(), "felis catus")) {
                noCats = AnimalsArray.getAnimals()[i].getName();
            }
        }
        return noCats;
    }
}
