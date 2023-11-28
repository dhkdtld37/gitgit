package day07.quiz;

/*
생성자 함수 ( constructor method)
- 클래스명과 동일
- 리턴 타입 없으므로 void 사용 X
- 중복 정의 가능 ( overload rksmd - 중복함수)
- default constructor 갖고 있음
( 단, 사용자가 생성자 함수 재정의 하면 디폴트 생성자함수 기능 상실)
- 멤버 변수의 초기화 담당
*/

public class TV {	
	String color;
	int channe;
	
	public TV() { 		// default constructor
		color = "gray";
		channe = 11;
	}
	public TV ( String color) {
		this.color = color;
	}
	public TV ( int channe) {
		color = "pink";
		this.channe = channe;
	}
	public TV ( String color, int ch ) {
		this.color = color;
		channe = ch;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChanne() {
		return channe;
	}
	public void setChanne(int channe) {
		this.channe = channe;
	}
	public void display() {
		System.out.println("TV의 색상 : " + color + "\n현재 채널 : " + channe);
	}
	//output
}
