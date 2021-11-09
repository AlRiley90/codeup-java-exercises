import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilePathLec {

    //Creating files and directories in java

    public static void main(String[] args) throws IOException {
        String directory = "./src/data";
        String fileName = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        System.out.println(dataFile);
        //If it is true that the directory does not exist
        if(Files.notExists(dataDirectory)){
            //create the data directory in our src folder
            Files.createDirectories(dataDirectory);
        }
        //Must create data directory before creating the file
        if(Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }

        //Example of how to write into a .txt file
        Path groceriesTxtPath = Paths.get(directory, fileName); //getting the whole shabang!

        System.out.println("groceriesTxtPath = " + groceriesTxtPath);
        System.out.println("Files.exists(groceriesTxtPath) = " + Files.exists(groceriesTxtPath));

        //Creating content for file, changing the following items here will overwrite the list
        List<String> groceryList = Arrays.asList("dog food", "coffee creamer", "potato bread", "milk");
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        //Reading from the file
        List<String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        //We can write our own print method
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        Files.write(groceriesTxtPath, Arrays.asList("eggs", "milkbones"), StandardOpenOption.APPEND);
        //Get the updated txt file
        printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);


        //Last example: Dive into the .txt document, get the current number of items [the lines], and look for ONE to update

        //getting the current groceryList from our files
        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        //This replaces the current line if the value is present with the new value in the conditional
        for(String line: groceryList){
            if(line.equalsIgnoreCase("milkbones")){
                newList.add("dentistix");
                continue;
            }
            newList.add(line);
        }
        System.out.println(newList);
        Files.write(groceriesTxtPath, newList);
    }


}
