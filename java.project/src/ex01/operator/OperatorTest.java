package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// 관계 연산자 : >, <, >=, <=, ==, !=
		int x = 3, y= 3;
		
		boolean flag = true;
		
		System.out.println(!flag);  // t -> f, f -> t
		
		if(x>y) {	// if (x==y), if(x>=y), 
			System.out.println("max : " + x );
		} else {
			System.out.println("max : " + y);
		}
	}

}
