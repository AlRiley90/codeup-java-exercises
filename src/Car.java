public class Car {
    public int year;
    public String make;
    public String model;
    public int doorCount;
    public String color;
    public boolean fast;


    //    Main Constructor
    public Car(int year, String make, String model, int doorCount, String color, boolean fast){

        this.year = year;
        this.make = make;
        this.model = model;
        this.doorCount = doorCount;
        this.color = color;
        this.fast = fast;


    }
    //    Overload Constructor for only year make and model
    public Car(int year,String make, String model){
        this(year, make, model, 0, "acolor", false);
    }

    public void OpenAllDoors(){
        for (int i = 0; i < this.doorCount; i++){
            System.out.println("Opening door " + i);
        }
    }

    public static void main(String[] args) {

        Car myCar = new Car(2012, "Mitsubishi", "Galant", 4, "Black", false);

        System.out.printf("My Car is a %s %s %s %s with %s doors and is it fast?????? %s \n", myCar.color, myCar.year, myCar.make, myCar.model, myCar.doorCount, myCar.fast );

        Car badCar = new Car(2014, "ford","truck" );

        System.out.printf("a bad car would be a %s %s %s %s %s \n", badCar.year, badCar.make, badCar.model, badCar.doorCount, badCar.color);

        myCar.OpenAllDoors();
    }
}
