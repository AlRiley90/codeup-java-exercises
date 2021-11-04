package InterfacesAbstractLec;

public class Accountant extends Employee{

    //Always need this constructor in your class
    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "TPS reports have been drafted!";
    }

    @Override
    public String morningMeeting() {
        return "Accountants have morning meetings beginning at 8:15AM until 8:45AM.";
    }

    @Override
    public String lunchTime() {
        return "Accountants take their lunch at their desk whenever they want to";
    }

    @Override
    public int dailyPay() {
        return 100000;
    }
}
