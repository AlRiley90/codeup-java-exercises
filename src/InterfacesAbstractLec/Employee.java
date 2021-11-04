package InterfacesAbstractLec;

abstract class Employee implements DailyWork{
    protected String name;
    protected String department;


    //Always need the constructor in your superclass
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return this.name;
    }
    public String getDepartment() {
        return this.department;
    }

//    public abstract String work();


}
