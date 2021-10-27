import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MethodsExercises {

//    public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me two numbers to work with: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("Would you like to add, subtract, multiply, divide, or modulate?");
//        String calculation = scanner.next();
////        System.out.println(add(num1, num2));
//        calculate(num1, num2, calculation);
//
//
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

    public static int getInteger(int min, int max){
        System.out.println(min);
        System.out.println(max);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        getInteger();
        return scanner.nextInt();
    }

}

