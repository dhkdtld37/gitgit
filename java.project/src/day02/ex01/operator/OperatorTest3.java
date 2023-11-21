package day02.ex01.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		// 논리 연산자 : && (and), || (or), ! (not) 10진 논리 => 결과 : 참, 거짓
		
		int x = 10, y = 20, z = 30;
		boolean result = true;
		
		result = ( x > y ) && ( y > z ); // && 연산은 앞에 것이 '거짓'이면 뒤는 수행 x
		System.out.println("&& : " + result);
		
		result = ( x < y ) && ( y > z ); 
		System.out.println("&& : " + result);
		
		result = ( x < y ) && ( y < z );
		System.out.println("&& : " + result);
		
		result = ( x > y ) || ( y > z ); 	// '||' 연산은 앞에 것이 '참'이면 뒤는 수행 x
		System.out.println("&& : " + result);
		
		result = ( x < y ) || ( y > z ); 
		System.out.println("&& : " + result);
		
		result = ( x < y ) || ( y < z ); 
		System.out.println("&& : " + result);
		
		System.out.println("!  : " + !result);
	}

}
