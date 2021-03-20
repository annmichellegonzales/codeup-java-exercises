package shapes;

public abstract class Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral (double length, double width) {
        this.length = length;
        this.width = width;
    }


    public abstract void setWidth(double width);
    public abstract void setLength(double length);

    public double getArea() {
        return length * width;
    }

}


