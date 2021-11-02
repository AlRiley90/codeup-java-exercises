public class SuperHero extends Person{
    private String alterEgo;

    public SuperHero(String govtName, String alterEgo){
        super(govtName);
        this.alterEgo = alterEgo;
    }

    //Overriding the method getName()
    public String getName(){
        return alterEgo;
    }
    
    //How to access the superclass method of the same name that was overridden above
    public String getSecretIdentity(){
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManofSteel = new SuperHero("Clark Kent", "Superman");
        System.out.println("theManOfSteel.getName() = " + theManofSteel.getName());

        System.out.println("theManofSteel.getSecretIdentity() = " + theManofSteel.getSecretIdentity());
    }
}
