package shapes;

public class Square extends Rectangle {

//    private final int side;

    public Square(int side) {
        super(side,side);
//        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }

}


//perimeter = 4 x side
//        area = side ^ 2