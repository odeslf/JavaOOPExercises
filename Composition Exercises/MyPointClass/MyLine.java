package MyPointClass;

public class MyLine {

    private MyPoint begin;
    private MyPoint end;


    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.begin = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x,y);
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        int deltaY = end.getY() - begin.getY();
        int deltaX = end.getX() - begin.getX();
        return Math.atan2(deltaY, deltaX);
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
