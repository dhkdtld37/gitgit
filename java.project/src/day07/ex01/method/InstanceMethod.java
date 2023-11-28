/*
 instance method : 객체 생성하고 사용해야함
 (메모리에 할당이 되어야...)
 */
package day07.ex01.method;

class B {
	int x, y;
	
	public void setData ( int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
} // B class end

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B (); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
		b.setData(100, 200);
	}
}
