import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    }


}
