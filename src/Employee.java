public class Employee extends Person{

    public Employee(String employeeName){
        super(employeeName);
    }

    public int getAge(){

        return this.age;
    }

    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you?");
    }

    public void doWork(){
        System.out.println("Work, work, work....");
    }

    public static void main(String[] args) {
        //Calling superclass
        Person unemployedKen = new Person("Kenny");
        System.out.println(unemployedKen.getName());
        unemployedKen.sayHello();
        System.out.println();


        //Calling subclass
        Employee ken = new Employee("Ken");
        ken.sayHello();
        System.out.println("ken.name = " + ken.getName());


        //Let's try to do work with our person and our employee
        ken.doWork();


    }
}
