public class PersonLec {
    //This is the template/blueprint for a person

    //Instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat() {
        return lastName + ", " + firstName + " has joined the chat!";

    }
      //make a static property - representing the world population
        public static long worldPop = 7_900_000_000L;




    public static void main(String[] args) {
        PersonLec alex = new PersonLec();

        alex.firstName = "Alex";
        alex.lastName = "Riley";

        System.out.println("alex = " + alex.firstName);
        System.out.println(alex.firstName + " " + alex.lastName + " is my name");
        System.out.printf("%s %s is my name!%n", alex.firstName, alex.lastName);
//        System.out.println(alex)
        System.out.println(alex.joinChat());

        System.out.println("worldPop = " + worldPop);

        PersonLec douglas = new PersonLec();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //Adding another person to our worldPop count
        PersonLec.worldPop += 1;
        System.out.println("New worldPop = " + worldPop);



    }


}
