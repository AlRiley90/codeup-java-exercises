package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width){
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2 * width) ;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public int setLength() {
        return length;
    }

    @Override
    public int setWidth() {
        return width;
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(){};
//
//    public Rectangle(int width, int length){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * width) + (2 * length);
//    }
}
