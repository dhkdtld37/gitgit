// 원하는 단 입력 받아서 구구단 출력하기
package day03.quiz.ex02;
import java.util.Scanner;
public class QuizFor01 {
	public static void main(String[] args) {
		System.out.println("구구단 몇 단 : ");
		int num = new Scanner(System.in).nextInt();
		
		for ( int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + "= " + (num*i));
		}
		
	}

}
