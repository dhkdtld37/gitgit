// 1~100중에 3의 배수의 합과 개수 구하는 프로그램 작성
package day03.quiz.ex02;

public class QuizFor0202 {
	public static void main(String[] args) {
		int sum=0; 
		int count = 0;
		
		for ( int i = 1; i < 101; i++) {
			if ( i % 3 ==0 ) {
				sum+= i;
				count++;
			}
			System.out.println("i = " + i + ", sum = " + sum + ", count = " + count);
		}
		
	}

}