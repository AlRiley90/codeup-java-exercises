package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("enter a word or something");
        Input input = new Input();
        System.out.println("You entered into a new scanner " + input.getString());

        boolean trueOrFalse = input.yesNo();
        System.out.println("trueOrFalse = " + trueOrFalse);

        int yourNumber = input.getInt();
        System.out.println("yourNumber = " + yourNumber);

        int yourRangedNumber = input.getInt(-100, 100);
        System.out.println("yourRangedNumber = " + yourRangedNumber);

        double userDouble = input.getDouble(-1000.0, 1000.0);
        System.out.println("userDouble = " + userDouble);

        double noLimitDouble = input.getDouble();
        System.out.println("noLimitDouble = " + noLimitDouble);
    }
}
