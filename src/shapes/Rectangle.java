package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setWidth(double width) {
        super.width = width;
    }

    public void setLength(double length) {
        super.length = length;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

}