public class Circle {

    private double radius;
    private String color;

    //constutores (overloades)
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //segundo construtor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //retorna o radius
    public double getRadius() {
        return radius;
    }

    //retorna a area do circulo
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class TestCircle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle c1 = new Circle(1.1);
        System.out.println(c1);   // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}

