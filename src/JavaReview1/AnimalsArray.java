package JavaReview1;

import movies.Movie;

public class AnimalsArray {
    public static Animal[] getAnimals() {
        return new Animal[]{
                new Animal("tiger", "felis catus"),
                new Animal("lion", "felis catus"),
                new Animal("falcon", "Falco subbuteo"),
                new Animal("pit-bull", "Canis familiaris"),
                new Animal("cat", "felis catus")
        };
    }
}
