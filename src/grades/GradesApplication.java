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

        students.put("AlexCrushesCode", alex);
        students.put("JimHasMehCode", jim);
        students.put("John404", john);
        students.put("Jane713", jane);

        //This method prints all key values
        boolean keepSearching = true;
        System.out.println(students.keySet());
//        System.out.println("Which student would you like to see more  information about?");

//
//        String userSearch = scanner.nextLine();
//
//        System.out.println(students.get(userSearch));

//        students.getOrDefault("")
//        System.out.println(alex.searchStudents(students, userSearch));
        //This way works in the main, working a making a method to call for this
        do { System.out.println("Which student would you like to see more information about?");
        Scanner scanner = new Scanner(System.in);
        String userSearch = scanner.nextLine();

            if (userSearch.equalsIgnoreCase("Jane713")) {
                System.out.println("Name: " + jane.getName() + " - GitHub Username: " + userSearch + "\nCurrent Average: " + jane.getGradeAverage());
            } else if (userSearch.equalsIgnoreCase("AlexCrushesCode")) {
                System.out.println("Name: " + alex.getName() + " - GutHub Username: " + userSearch + "\nCurrent Average: " + alex.getGradeAverage());
            } else if (userSearch.equalsIgnoreCase("JimHasMehCode")) {
                System.out.println("Name: " + jim.getName() + " - GutHub Username: " + userSearch + "\nCurrent Average: " + jim.getGradeAverage());
            } else if (userSearch.equalsIgnoreCase("John404")) {
                System.out.println("Name: " + john.getName() + " - GutHub Username: " + userSearch + "\nCurrent Average: " + john.getGradeAverage());
            } else {
                System.out.println("No users with that username were found.");
            }
            System.out.println("Would you like to continue?");
            String doContinue = scanner.nextLine();
            if(doContinue.equalsIgnoreCase("no")){
                keepSearching = false;
                break;
            }
        }while(keepSearching == true);
    }

    }

