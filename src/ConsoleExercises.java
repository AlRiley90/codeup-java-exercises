import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.print("The value of pi is approximately: ");
        System.out.format("%.2f%n", pi);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %s", userInput);
//
//
//        System.out.println("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("You entered: %s %s %s", userInput1, userInput2, userInput3);


//        System.out.println("Enter a sentence: ");
//        String userInput4 = scanner.nextLine();
//        System.out.printf("You entered: %s", userInput4);

        System.out.print("What is the length of the room in feet? ");
        String roomLength = scanner.nextLine();
        int roomL = parseInt(roomLength);
        System.out.print("What is the width of the room in feet? ");
        String roomWidth = scanner.nextLine();
        int roomW = parseInt(roomWidth);
//        System.out.printf("%s, %s", roomL, roomW);
        int area = roomL * roomW;
        int perimeter = (roomL*2) + (roomW*2);
        System.out.printf("The perimeter of the room is: %s ft" ,perimeter);
    }
}
