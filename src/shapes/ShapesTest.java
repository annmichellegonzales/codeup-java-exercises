package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Quadrilateral myShape;

        myShape = new Square(5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape.setLength(11);
        System.out.println();

        myShape = new Rectangle(6,8);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());



    }

}


