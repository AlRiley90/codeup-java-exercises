package InterfacesAbstractLec;

public class Custodian extends Employee{

    //Always needs a constructor in the class
    public Custodian(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Keeping our company clean! Great work!";
    }

    @Override
    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department.";
    }

    @Override
    public String lunchTime() {
        return "12:00 - 1:00pm";
    }

    @Override
    public int dailyPay() {
        return 45000;
    }
}
