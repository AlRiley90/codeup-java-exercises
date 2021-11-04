package InterfacesAbstractLec;

public class Company {


    public static void main(String[] args) {


        //The next line is instantiation
        Accountant accountBot = new Accountant("numberBot", "Accounting");
        System.out.println(accountBot.work());
        System.out.println(accountBot.getName());


        Custodian cleaningBot = new Custodian("royBot", "Sanitation");
        System.out.println(cleaningBot.work());
        System.out.println(cleaningBot.getDepartment());

        //How does our workday go
        System.out.println(accountBot.getName() + " is reporting for business for the " + accountBot.getDepartment());
        System.out.println(cleaningBot.getName() + " is reporting for business for the " + cleaningBot.getDepartment());

        System.out.println("How did the morning meetings go?");
        System.out.println("accountBot.morningMeeting() = " + accountBot.morningMeeting());
        System.out.println("cleaningBot.morningMeeting() = " + cleaningBot.morningMeeting());

        System.out.println("What happens at lunch time?");
        System.out.println("accountBot.lunchTime() = " + accountBot.lunchTime());
        System.out.println("cleaningBot.lunchTime() = " + cleaningBot.lunchTime());

    }
}
