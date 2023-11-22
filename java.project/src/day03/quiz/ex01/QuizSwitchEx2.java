// 3과목 입력 받고, 총점, 평균, 학점(if 혹은 switch) 구하기
package day03.quiz.ex01;
import java.util.Scanner;
public class QuizSwitchEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // 객체 생성, 메모리에 할당, 생성자동함수 자동호출
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("전산 : ");
		int com = sc.nextInt();
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		
		System.out.println("****** " + name + "님의 성적표 ******");
		System.out.println("국어 : " + kor + ", " +"영어 : " + eng + ", " + "전산 : " + com);
		System.out.print("총점 : " + total);
		
		if (avg == 100) {
			System.out.println(" 학점 : S");
		} else if (avg >= 90) {
			System.out.println(" 학점 : A");
		} else if (avg >= 80) {
			System.out.println(" 학점 : B");
		} else if (avg >= 70) {
			System.out.println(" 학점 : C");
		} else if (avg >= 60) {
			System.out.println(" 학점 : D");
		} else {
			System.out.println(" 학점 : F");
		}
		
	}

}
