package day09.ex03_interface;

import day09.ex02.Abstract.Shape;

interface A {
	int x = 9;	// interface - abstract methodm final member만 가질 수 있다.
	
	public void show();	// abstract
	public abstract void disp();
	public int plus(int x, int y);
}	// A end

interface B {
	void bView();
}	// B end

interface C {
	String name = "happy";		// final 멤버는 초기화 필수
	public void draw();
//	name = "doyean"; 	// final 멤버는 값 변경 금지 - 상수
//	10 = 5;
}	// C end

interface D extends B {		// interface 간에 상속에서도 extends 키워드 사용
	void dView();
}	// D end

class Rect implements C {

	public void draw() {
		System.out.println(name + " 님 반갑습니다.");
	}
}	// Rect class end

// class Multi implements B, C, A extends Shape {	// 순서로 인한 에러
class Multi extends Shape implements B, C, A {

	public void show() {
		System.out.println("A interface");
		
	}

	public void disp() {
		System.out.println("disp call");
		
	}

	public int plus(int x, int y) {
		System.out.println("plus call");
		return 0;
	}

	public void draw() {
		System.out.println("draw call");
		
	}

	public void bView() {
		System.out.println("bView call");
		
	}

	public double calc(double x, double y) {
		System.out.println("calc call");
		return 5.3;
	}

	public void show(String name) {
		System.out.println("show call" + name);
		
	}
	
}

public class MainEntry {
	
	String name;	// null
	int x, y;			// 0
	
	public static void main(String[] args) {
		MainEntry me = new MainEntry();
		System.out.println(me.name);
		System.out.println(me.x);
		
		Rect r = new Rect();	// 자기 자신으로 객체 생성
		r.draw();
		C rr= new Rect();	// 부모 C 인터페이스로 객체 생성
		rr.draw();
		System.out.println(rr.name);
		
		Multi m = new Multi();
		m.bView();
		m.calc(3, 3);
		m.disp();
		
		Shape m2 = new Multi();	// 부모 클래스를 이용해 객체 생성
		m2.view();
		m2.calc(3, 2);
		
		B m3 = new Multi();		// 부모 인터페이스를 이용해 자손 클래스 객체 생성 가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 2);
		m4.show();
		
		
		
		
//		A a = new A (); 	// 클래스가 아니므로 객체 생성 불가
		
	}

}

/*
 interface
 - 클래스 아님(객체 생성 불가)
  - implements
  - 추상 메소드, 상수만 가질 수 있다. (abstract, final 생략 가능)
  - 다중 상속 구현, ...
 */

