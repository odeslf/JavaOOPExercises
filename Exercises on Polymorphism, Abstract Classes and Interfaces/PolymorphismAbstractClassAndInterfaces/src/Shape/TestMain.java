package Shape;

public class TestMain {
    public static void main(String[] args) {

        Shape s1 = new Circle("red",true, 5.5);
        Shape s3 = new Rectangle(2,4, "green", false);
        Shape s4 = new Square(6, "Black", true);

        Circle c1 = (Circle)s1;
        System.out.println(c1);

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);

        Square sq1 = (Square)s4;
        System.out.println(sq1);
    }
}
