package testlim;

public class Point02 {
    public static void main(String[] args) {
        Point pt = new Point();
        Point pt2 = new Point(2);
        pt.display();
        pt.setX(40);
        pt2.setX(40);
        pt.display();
        pt2.display();
        pt.setY(100);
        pt.display();
        pt2.setX(75);
        pt2.display();
    }
}
