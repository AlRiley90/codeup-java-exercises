package shapes;

import util.Input;

public class CircleApp {


    public static void main(String[] args) {
        Input input = new Input();
       double radius = input.getDouble();
        System.out.println("Your circle radius is: " + radius);

        Circle myCircle = new Circle(radius);
        System.out.println("The area of your circle is: " + myCircle.getArea());
        System.out.println("The circumference for your circle is: " + myCircle.getCircumference());
    }
}
