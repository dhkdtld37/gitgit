package day07.ex04.oop;

public class MainEntry {
	public static void main(String[] args) {
        Point pt = new Point();
        Point pt2 = new Point(2);
        pt.display();
        pt2.setX(40);
        pt.display();
        pt2.display();
        pt.setY(100);
        pt.display();
    
		System.out.println("Circle object");
		
		Circle cc = new Circle();
		cc.display();
		cc.setX(10);
		cc.setY(10);
		cc.setR(10);
		cc.display();
		
	}

}
