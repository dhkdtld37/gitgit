package day02.ex01.operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// 논리 연산자 : & (and), | (or), ^ (xor)   2진 논리 => 결과를 값으로 변환
		int x =4, y = 7, a,b,c,d;
		a = x & y; 
		b = x | y;
		c = x ^ y;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}

