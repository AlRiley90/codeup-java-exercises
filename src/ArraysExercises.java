import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person person){

        Person[] newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1] = person;

//        for(Person family : newPeople){
//            System.out.println(family.getName());
//        }
        return newPeople;
    }


    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Alex");
        people[1] = new Person("Aaliyah");
        people[2] = new Person("Ruby");
        System.out.println(Arrays.toString(people));


        for(Person family : people){
            System.out.println(family.getName());
        }

        Person[] newPeople = addPerson(people, new Person("Ronnie"));

        for(Person family : newPeople){
            System.out.println(family.getName());
        }


    }


}
