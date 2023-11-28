package testlim;

public class Point {
    private int x, y;

    public Point() {  // default constructor
        x = 10;
        y = 10;
    }

    public Point(int x) {
        this.x = x;
        y = 30;
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

    public void display() {
        System.out.println(x + ", " + y);
    }
}