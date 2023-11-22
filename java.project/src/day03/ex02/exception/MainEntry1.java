/*
package day03.ex02.exception;


public class MainEntry1 {
	public static void main(String[] args) {
		int x = 30, y = 0;
		
		int result = x / y;
		
		System.out.println(result);
	}

} // 에러로 인해 실행 x
*/
package day03.ex02.exception;

public class MainEntry1 {
	public static void main(String[] args) {
		int x = 30, y = 0;
		int result = 0;
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} else {
			result = x / y;
		}
		System.out.println(result);
	}

}

