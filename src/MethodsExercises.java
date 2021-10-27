import java.util.Scanner;

import java.util.Random;

public class MethodsExercises {

    public static void main(String [] args) {
//        userInput();
//        getInteger(1,10);
//            factorialTree();
        diceRoll();
    }

//    public static void userInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me two numbers to work with: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("Would you like to add, subtract, multiply, divide, or modulate?");
//        String calculation = scanner.next();
//        System.out.println(add(num1, num2));
//        calculate(num1, num2, calculation);
//    }
//    public static void calculate(int num1, int num2, String calculation) {
//        switch (calculation) {
//            case "add":
//                System.out.println("Sum: " + add(num1, num2));
//                break;
//            case "subtract":
//                System.out.println("Difference: " + subtract(num1, num2));
//                break;
//            case "multiply":
//                System.out.println("Product: " + multiply(num1, num2));
//                break;
//            case "divide":
//                System.out.println("Dividend: " + divide(num1, num2));
//                break;
//            case "modulate":
//                System.out.println(num1 + " Modulus of " + num2 +": " + modulus(num1, num2));
//                break;
//            case "modulus":
//                System.out.println(num1 + " Modulus of " + num2 +": " + modulus(num1, num2));
//                break;
//            default:
//                System.out.println("idk how we got here, fam");
//                break;
//        }
//    }
//
//    public static int add(int num1, int num2){
//       return num1 + num2;
//    }
//    public static int subtract(int num1, int num2){
//        return num1 - num2;
//    }
//    public static int multiply(int num1, int num2){
//        return num1 * num2;
//    }
//    public static int divide(int num1, int num2){
//        return num1 / num2;
//    }
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }

//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int userNum = scanner.nextInt();
//        if(userNum < 1){
//            System.out.println("Your number is too low. Let's go higher.");
//            return getInteger(min, max);
//        } else if(userNum > 10){
//            System.out.println("Your number is too high. Let's go lower.");
//            return getInteger(min, max);
//        }else {
//            return userNum;
//        }
//    }

//    public static int factorialTree() {
//        int fact = 1;
//        int userInput = getInteger(1, 10);
//        for(int i = 1; i <= userInput; i++) {
//            fact = fact * i;
//            System.out.println(i + "! = " + fact );
//        }
//            System.out.println("Factorial of " + userInput + " is: " + fact);
//        return userInput;
//    }

    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean keepRolling = true;
        do {
            System.out.println("Would you like to roll your dice?");
            if (scanner.next().equalsIgnoreCase("yes")) {
                System.out.println("Enter the number of sides for your pair of dice");
                int userNSides = scanner.nextInt();
                int n = rand.nextInt(userNSides * 2);
                System.out.println("You rolled " + n);
            } else {
                System.out.println("Maybe we can play another time.");
                keepRolling = false;
            }
        } while(keepRolling);
    }

    }


