package shapes;

public class Rectangle {

//    public Rectangle() {
//
//    }

    protected double length;
    protected double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

}


//perimeter = 2 x length + 2 x width
//        area = length x width