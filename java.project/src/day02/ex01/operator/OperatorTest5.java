package day02.ex01.operator;

public class OperatorTest5 {
	public static void main(String[] args) {
		// 대입(배정) 연산자 : =, +=, -=, *=, /=, >>=, <<=, &=, 등등
		
		int x = 3, y = 5, result;
		result = x+ y;
		System.out.println(result);

		x = x +y;
		x += y;
		System.out.println("x = " +x +",  y =" + y);
		
		x = x * y;
		x * = y;
		
		
		
	}

}
