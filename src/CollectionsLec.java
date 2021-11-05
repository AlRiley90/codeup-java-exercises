import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {


    public static void main(String[] args) {
        //Old way
//        String[] nameOfVar = {"thing1", "thing2", "thing3"};


        //Data type goes inside of the <> symbols
        ArrayList<String> students = new ArrayList<>();
        students.add("Alex");
        students.add("Sarah");
        //To add element to the beginning
        students.add(0, "Ruby");
        students.add("Sarah");


        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        //Finding the location of an element
        System.out.println("students.indexOf(\"Sarah\") = " + students.indexOf("Sarah"));
        //Getting the element at a certain index
        System.out.println("students.get(2) = " + students.get(2));

        //Is an element present in the Array. Returns true or false
        System.out.println("students.contains(\"Ronnie\") = " + students.contains("Ronnie"));

        //How to find the last occurrence of an element
        System.out.println("students.lastIndexOf(\"Sarah\") = " + students.lastIndexOf("Sarah"));

        //How to check if the array list is empty. Returns true or false
        System.out.println("students.isEmpty() = " + students.isEmpty());

        //To remove the first occurence of an element
        System.out.println("students.remove(\"Sarah\") = " + students.remove("Sarah"));
        System.out.println(students);


        //how to remove multiple elements
//        ArrayList<String> removeList = new ArrayList<>();
//        removeList.add("Alex");
//        removeList.add("Sarah");
//        students.removeAll(removeList);
//        System.out.println(students);
        System.out.println();
        System.out.println("~~~~~~~~~~Hash Maps~~~~~~~~~~~");
        System.out.println();

        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();

        HashMap<String, String> usernames = new HashMap<>();

        //Inserting k : v pairs into HashMap
        usernames.put("Alex", "uncleshredder");
        usernames.put("Shanshan", "theGoat");
        usernames.put("Kenneth", "ken2cool");

        System.out.println("usernames.get(\"Shanshan\") = " + usernames.get("Shanshan"));

        //Providing a default value for when a key is not present in the HashMap
        usernames.getOrDefault("Cody", "noUserFound");
        System.out.println("usernames.getOrDefault(\"James\") = " + usernames.getOrDefault("James", "No User Found"));

        System.out.println(usernames);
        usernames.putIfAbsent("Shanshan", "shanshan210");
        usernames.putIfAbsent("James", "majinJames");
        System.out.println();
        System.out.println(usernames);

        //Removes a k : v pair
        usernames.remove("Alex");
        System.out.println(usernames);

        //Changes the value of a key
        usernames.replace("Shanshan", "shanshan210");
        System.out.println(usernames);

        usernames.clear();
        System.out.println(usernames);
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());


    }
}
