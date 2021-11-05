package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jim = new Student("Jim");
        jim.addGrade(90);
        jim.addGrade(60);
        jim.addGrade(85);
        jim.addGrade(100);
        System.out.println("jim.getGradeAverage() = " + jim.getGradeAverage());
//        System.out.println(jim.grades);

        Student john = new Student("John");
        john.addGrade(85);
        john.addGrade(90);
        john.addGrade(95);
        john.addGrade(97);

        Student jane = new Student("Jane");
        jane.addGrade(75);
        jane.addGrade(68);
        jane.addGrade(80);
        jane.addGrade(55);

        Student alex = new Student("Alex");
        alex.addGrade(100);
        alex.addGrade(98);
        alex.addGrade(95);
        alex.addGrade(100);

        students.put("AlexKillsCode", alex);
        students.put("JimHasMehCode", jim);
        students.put("John404", john);
        students.put("Jane713", jane);

        //This method prints all key values
        System.out.println(students.keySet());
        System.out.println("Which student would you like to see more information about?");
        Scanner scanner = new Scanner(System.in);
        String userSearch = scanner.nextLine();
        if(students.containsKey(userSearch)){
            System.out.println();
        }

    }
}
