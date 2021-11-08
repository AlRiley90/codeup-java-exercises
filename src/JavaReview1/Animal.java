package JavaReview1;

public class Animal {
    private String name;
    private String species;

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public void roar(){
        System.out.println("I am " + name + ", hear me roar!");
    }

}
