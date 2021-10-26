import java.util.Scanner;

public class Bob {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to my guy Bob.");
        String userCall = scanner.nextLine();
        if(userCall.endsWith("?")){
            System.out.println("Sure..");
        }else if(userCall.endsWith("!")){
            System.out.println("Whoa, chill out dude!");
        }else if(userCall.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }
        System.out.println("Would you like to say anything else?");
        userCall = scanner.nextLine();
        if(userCall.endsWith("?")){
            System.out.println("Sure..");
        }else if(userCall.endsWith("!")){
            System.out.println("Whoa, chill out dude!");
        }else if(userCall.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }
    }
}
