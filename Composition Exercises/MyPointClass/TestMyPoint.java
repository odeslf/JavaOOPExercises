package MyPointClass;

public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for (MyPoint point : points) {
            System.out.println(point.toString() + "Distance to origin: " + point.distance());
        }
    }
}
