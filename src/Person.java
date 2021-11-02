public class Person {
    private String name;
    protected int age;
    //Added public name for the sake of inheritance lecture
//    public String name;

    //This is the default constructor used to eliminate error for employee to extend person
    public Person(){};


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person Alex = new Person("Alex Riley");
        Alex.setName("Alex Riley");
        Alex.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

    public String getName(){
        return this.name;
//TODO: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.println("Hello " + name);
//TODO: print a message to the console using the person's name
    }
}
