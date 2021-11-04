package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public int setLength() {
        return length;
    }

    @Override
    public int setWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
//    public int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//
//    }
//
//    public int getArea(){
//        return (side * side);
//    }
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
}
