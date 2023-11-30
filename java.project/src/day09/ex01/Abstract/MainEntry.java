package day09.ex01.Abstract;

abstract class Shape {			// abastract class , super class
	double result = 0;
	public abstract double calc(); 		// abstract method
	public abstract void draw();
	
	public void show() {		// 일반 메소드
		System.out.println("Super class Shape");
	}
}		// Shape end

class Circle extends Shape {
	double r = 5.0;

	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
		
	}
}		// Circle end

class Rectangle extends Shape {
	int w = 5, h = 8;

	public double calc() {
		result = w*h;
		return result;
	}
	
	public void draw() {
		calc();
		System.out.println("직사각형의 넓이 : " + result + "인 직사각형을 그렸습니다.");
		
	}
	
} 		// Rectangle end


class Triangle extends Shape {
	int w = 3, h = 5;
	
	public double calc() {
		result = (w*h) / 2;
		return result;
	}

	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
		
	}	
}		// Triangle end

public class MainEntry {
	public static void main(String[] args) {
		
		Shape sh = new Circle();
		sh.draw();
		
		sh = new Rectangle();
		sh.draw();
		
		System.out.println("===========================");
		new Triangle().draw();
		new Rectangle().draw();
		Circle c = new Circle();
		
		c.draw();
		
		//		Shape sh = new Shape();	// 자체적으로 객체 생성 불가능
		
	}

}
