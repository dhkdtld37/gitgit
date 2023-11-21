package day02.ex01.operator;

public class OperatorTest4 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : (조건) ? 참 : 거짓 ;
		int x = 20, y = 10;
		String msg = null;
		
		msg = ( x != y) ? "not same" : "same";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;;
		result = ( a > b ) ? a : ( b > c ) ? b : c;
		System.out.println(result);
		
		
	}

}
