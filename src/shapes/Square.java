package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
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
