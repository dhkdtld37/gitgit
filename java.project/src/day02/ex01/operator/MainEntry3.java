package day02.ex01.operator;

public class MainEntry3 {
	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %, 등등
		int x = 10, y = 20;
		int gob = x*y;
		System.out.println(" x * y = " +  gob);
		System.out.println(" x * y = " + (x*y));
		System.out.println(x + " * " + y + "= " + gob);
		System.out.println("\n\n3+4*5 = " + (3+4*5));
		System.out.println("(3+4*5) = " + ((3+4)*5));
		
		// 정수 (+, -, *, /, %, 등등) 정수 = 정수
		System.out.println("\n 7 / 3 =" + (7/3) );
		System.out.println(" 7 % 3 =" + (7%3));
		System.out.println("\n 7 / 3.0 =" + (7/3.) );
		System.out.println(" 7.0 % 3.0 = " + (7. % 3.));
	}

}

