/*
  문제 3 ] 전산, 영어, 국어 점수 입력 받아서 평균 60점 이상이고,
			각 과목 과락 40점 이하이면 과목 불합격 처리하는 프로그램 작성
*/

package day03.quiz.ex01;
 
import java.util.Scanner;

public class QuizIf03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전산 점수를 입력하시오.");
		int com = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		
		double avg = (com + eng + kor) / 3;
		System.out.println("평균 점수 : " + avg + "점");
		
		if (avg >= 60 ) {
			if (com <= 40) {
				System.out.println("전산 점수가 " + com + "점으로 40점 이하 과락입니다.");
				System.out.println("불합격 입니다.");
			} if (eng <= 40) {
				System.out.println("영어 점수가 " + eng + "점으로 40점 이하 과락입니다.");
				System.out.println("불합격 입니다.");
			} if (kor <= 40) {
				System.out.println("국어 점수가 " + kor + "점으로 40점 이하 과랍니다.");
				System.out.println("불합격 입니다.");
			}
		} if ((com > 40) && (eng > 40) && (kor > 40)) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
}

