package ex01.operator;

public class MainEntry4 {
	public static void main(String[] args) {
		// shift 연산자 : <<, >>, >>>
		int x = 8, result, result2, result3;
		
		result = x << 2; // left shift : 원래값 * 2 ^ bit 수
		result2 = x >>3; // right shift : 원래값 / 2 ^ bit 수
		result3 = result << 3;
		
		System.out.println( "left shift result : " + result);
		System.out.println( "right shift result : " + result2);
		System.out.println( "left shift result : " + result3);
		
	}

}
