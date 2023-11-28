package day07.ex03.oop;

class Point {
	private int x, y;	// 멤버 변수, int 0 , double/float 0.0, String null로 초기화된다.
	
	// 멤버 함수 - getter / setter method
	public void setX ( int xx) { x = xx; }
	public int getX() { return x; }
	public void setY ( int yy) { y = yy; }
	public int getY() { return y; }
	public void display () {
//		System.out.println(x + ", " + y );
		System.out.println(getX() + ", " + getY());
	}
}	// point end

class Circle {
	private int x, y, z;
	// getter / setter
	public void setX ( int xx ) { x = xx;}
	public int getX() { return x; }
	public void setY ( int yy ) { y = yy;}
	public int getY() { return y; }
	public void setZ ( int zz ) { z = zz;}
	public int getZ() { return z; }
	public void display () {
		System.out.println( getX() + ", " + getY() + ", " + getZ() );
	}
	// output
}	// circle end


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();	// 객체 생성, 메모리에 할당, 생성자함수 자동호출
		System.out.println(pt.getX() + ", " + pt.getY());		// 0, 0
		pt.setX(55);
		pt.setY(100);
		System.out.println(pt.getX() + ", " + pt.getY());		// 55, 100
		pt.display(); 		
//		pt.x = 3;
//		pt.y = 5;
//		System.out.println(pt.x + ", " + pt.y);
		
		System.out.println("=====================");
		
		Circle cc = new Circle();
		System.out.println(cc.getX() + ", " + cc.getY() + ", " + cc.getZ() );
		cc.setX(10);
		cc.setY(10);
		cc.setZ(10);
		System.out.println(cc.getX() + ", " + cc.getY() + ", " + cc.getZ() );
		cc.display();
		
	}
} 	// MainEntry end
