package day03.quiz.ex01;
import java.util.Scanner;
public class QuizIfScore {
	public static void main(String[] args) {
		System.out.println("점수를 입력하시오. (국어, 영어, 수학)");
		Scanner sc = new Scanner(System.in);
		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = (total / 3);
		
		System.out.println("평균 :" + avg);
		if (avg == 100) {
			System.out.println("S등급 입니다.");
		} else if (avg >= 90 ) {
			System.out.println("A등급 입니다.");
		} else if (avg >= 80 ) {
			System.out.println("B등급 입니다."); 
		} else if (avg >= 70) {
			System.out.println("C등급 입니다."); 
		} else {
			System.out.println("F등급 입니다."); 
		}
	}
}