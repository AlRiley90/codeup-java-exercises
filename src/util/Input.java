package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;



    public Input(){
        this.scanner = new Scanner(System.in);

    }
    public String getString(){
        return this.scanner.nextLine();

    }
    boolean yesNo(){
        System.out.println("Enter yes or no!");
        String userInput = scanner.nextLine();
       return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("Y");

    }
    int getInt(int min, int max){
        
        System.out.println("Enter a number in the range of " + min + " and " + max +": ");

       int parsedNum = Integer.valueOf(getString());

        try{
            int parsedNum1 = parsedNum;
        }catch(NumberFormatException e){
            System.out.println("That number is not in range. Try again.");
            return getInt(min, max);
        }

        if(parsedNum < min || parsedNum > max){
            System.out.println("Try another number");
            getInt(min, max);
        }
        return parsedNum;
    }
    
    int getInt(){
        System.out.println("Enter a number without limits: ");
        try{
            return Integer.valueOf(getString());
        }catch(NumberFormatException e){
            System.out.println("That isn't an acceptable number. Try again.");
            return getInt();
        }

    }


    double getDouble(double min, double max){
        System.out.println("Enter a double in the range of " + min + " and " + max + ": ");
//        double userDouble = scanner.nextDouble();
        double parsedNum = Double.valueOf(getString());

            try {
                if(parsedNum < min || parsedNum > max) {
                    System.out.println("Try another number");
                    getDouble(min, max);
                }
                return parsedNum;
            } catch (NumberFormatException e) {
                System.out.println("That is not an acceptable number. Try again.");
                return getDouble(min, max);
            }


    }
    
    public double getDouble(){
        System.out.println("Enter a double without limits: ");
//        return scanner.nextDouble();
        try{
            return Double.valueOf(getString());
        }catch(NumberFormatException e){
            System.out.println("That is not an acceptable double. Try again.");
            return getDouble();
        }

    }
    public static void main(String[] args) {
        System.out.println("enter a word or somethin");
        Input input = new Input();
        System.out.println("You entered into a new scanner " + input.getString());
        boolean trueOrFalse = input.yesNo();
        System.out.println("trueOrFalse = " + trueOrFalse);
        int yourNumber = input.getInt(-100, 100);
        System.out.println("yourNumber = " + yourNumber);
        int noLimit = input.getInt();
        System.out.println("noLimit = " + noLimit);
        double userDouble = input.getDouble(-1000.0, 1000.0);
        System.out.println("userDouble = " + userDouble);
        double noLimitDouble = input.getDouble();
        System.out.println("noLimitDouble = " + noLimitDouble);
    }

}
