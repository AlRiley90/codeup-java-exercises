package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(){};

    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * width) + (2 * length);
    }
}
