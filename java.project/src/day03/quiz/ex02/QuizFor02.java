// 1~100중에 숫자의 배수의 합과 개수 구하는 프로그램 작성
package day03.quiz.ex02;
import java.util.Scanner;
public class QuizFor02 {
	public static void main(String[] args) {
		System.out.println("숫자 : ");
		int num = new Scanner (System.in).nextInt();
		int sum=0; 
		int count = 0;
		
		for ( int i = 1; i < 101; i++) {
			if ( i % num ==0 ) {
				sum+= num;
				count++;
			}
			System.out.println("num = " + num + ", sum = " + sum + ", count = " + count);
		}
		
	}

}