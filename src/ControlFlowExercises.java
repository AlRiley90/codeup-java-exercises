import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        long x = 2;
//        do{
//            System.out.println(x);
//            x*=x;
//        }while(x <= 1000000);


        //Same loops written in for loop
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        for(long x = 2; x <= 1000000; x*=x){
//            System.out.println(x);
//        }

        //FIZZ BUZZ Question
//        int f = 1;
//        while(f <= 100){
//            if(f % 3==0 && f % 5 != 0){
//                System.out.println("Fizz");
//            }else if(f % 5 == 0 && f % 3 != 0){
//                System.out.println("Buzz");
//            }else if(f % 3 == 0 && f % 5 ==0){
//                System.out.println("FizzBuzz");
//            }else{
//                System.out.println(f);
//            }
//            f++;
//        }

        //Table of powers
//        String continuing = null;
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            if (userInput > 0) {
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------ | ------ ");
//                for (int i = 1; i <= userInput; i++) {
//                    int number = i;
//                    int squared = i * i;
//                    int cubed = i * i * i;
//                    System.out.printf("%-7d|", number);
//                    System.out.printf("%-8d|", squared);
//                    System.out.printf("%d%n", cubed);
//                }
//                System.out.println("Do you want to continue? Y/N");
//                continuing = scanner.next();
//            }
//
//        } while (continuing.equalsIgnoreCase("Y"));


        String doContinue = "Y";
        do {
            System.out.println("What grade did you get? ");
            int userGrade = scanner.nextInt();
            if (userGrade <= 100 && userGrade >= 88) {
                System.out.printf("You got an A%n");
            }else if(userGrade <= 87 && userGrade >= 80){
                System.out.printf("You got a B%n");
            }else if(userGrade <= 79 && userGrade >= 67){
                System.out.printf("You got a C%n");
            }else if(userGrade <= 66 && userGrade >= 60){
                System.out.printf("You got a D%n");
            }else{
                System.out.printf("You got an F%n");
            }
            System.out.println("Would you like to enter another grade? Y/N ");
            doContinue = scanner.next();
        }while(doContinue.equalsIgnoreCase("Y"));
    }
}
