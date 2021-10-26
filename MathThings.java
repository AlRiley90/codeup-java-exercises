public class MathThings {


    public static void calculateUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String input = scanner.next();

        calculate(num1, num2, input);

    }

    public static void calculate(int num1, int num2, String input){
        switch (input) {
            case "add":
                System.out.println("Sum: " + add(num1, num2));
                break;
            case "subtract":
                System.out.println("Difference: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Product: " + (num1 * num2));
                break;
            case "divide":
                System.out.println("Dividend: " + (num1 / num2));
                break;
            default:
                System.out.println("idk how we got here, fam");
                break;
        }
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}
