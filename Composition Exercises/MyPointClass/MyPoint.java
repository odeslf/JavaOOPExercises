package MyPointClass;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x,y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance (int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance (MyPoint another) {
        int deltaX = this.x - another.getX();
        int deltaY = this.y - another.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
