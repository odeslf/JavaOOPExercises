package GeometricObj;
import java.text.DecimalFormat;

public class Circle implements GeometricObject{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00"); //format to two decimals
        return "Circle{" +
                "radius=" + df.format(radius)  +
                " Area="+ df.format(getArea()) +
                " Perimeter=" + df.format(getPerimeter()) + '}';
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
}
