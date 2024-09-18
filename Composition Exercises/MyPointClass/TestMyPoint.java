package MyPointClass;

public class TestMyPoint {

    public static void main(String[] args) {

//        MyPoint[] points = new MyPoint[10];
//
//        for (int i = 0; i < points.length; i++) {
//            points[i] = new MyPoint(i + 1, i + 1);
//        }
//
//        for (MyPoint point : points) {
//            System.out.println(point.toString() + " Distance to origin: " + point.distance());
//        }


        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,4);

        MyLine line = new MyLine(p1, p2);


        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());
    }
}
