package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setWidth(double side) {
        super.width = side;
    }

    public void setLength(double side) {
        super.length = side;
    }

    public double getPerimeter() {
        return length * 4;
    }

}
