// 숫자 입력 받아서 짝/홀수 판정 프로그램
package day03.quiz.ex01;
import java.util.Scanner;
public class QuizSwitchEx1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		
		int num = new Scanner (System.in).nextInt();
		
		switch (num%2) {
		case  0 : System.out.println(num + " 은(는) 짝수 입니다."); break;
		case 1 : System.out.println(num + " 은(는) 홀수 입니다."); break;
		default : System.out.println("잘못 입력하셨습니다. 숫자를 입력하세요.");
		}
	}

}
