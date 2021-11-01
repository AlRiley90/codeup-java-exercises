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
        
        System.out.println("Enter a number: ");
        int userNumber = scanner.nextInt();
        if(userNumber < min || userNumber > max){
            System.out.println("Try another number");
            userNumber = scanner.nextInt();
        }
        return userNumber;
    }
    
    int getInt(){
        System.out.println("Enter a number without limits: ");
        return scanner.nextInt();
        
    }

    double getDouble(double min, double max){
        System.out.println("Enter a number: ");
        double userDouble = scanner.nextDouble();
        if(userDouble < min || userDouble > max){
            System.out.println("Try another number");
            userDouble = scanner.nextDouble();
        }
        return userDouble;
    }
    
    public double getDouble(){
        System.out.println("Enter a number without limits: ");
        return scanner.nextDouble();
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
