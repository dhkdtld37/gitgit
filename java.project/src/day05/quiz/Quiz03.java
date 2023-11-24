// 7명의 3과목 입력 받고, 총점, 평균, 학점 구하기 - 배열 이용하기
package day05.quiz;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // 객체 생성, 메모리에 할당, 생성자동함수 자동호출
		int nam = 3;
		int[] kor = new int[nam];
		int[] eng = new int[nam];
		int[] com = new int[nam];
		int[] total = new int[nam];
		double[] avg = new double[nam];
		
		String[] name = new String[nam];
		
		for (int i = 0; i < nam; i++) {
			System.out.println("이름 : ");
			name[i] = sc.next();
			do {
				System.out.println("국어 : ");
				kor[i] = sc.nextInt();
			} while ( kor[i] < 0 || kor[i] > 101);
			do {
				System.out.println("영어 : ");
				eng[i] = sc.nextInt();
			} while ( eng[i] < 0 || eng[i] > 101);
			do {
				System.out.println("전산 : ");
				com[i] = sc.nextInt();
			} while ( com[i] < 0 || com[i] > 100);
			
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = total[i] / 3.0;
		}
		
		int totallall = 0;
		double avgall = 0;
		
		for (int i = 0; i < nam; i++) {
			System.out.println("********** " + name[i] + "님의 성적표 **********");
			System.out.println("국어 : " + kor[i] + ", " +"영어 : " + eng[i] + ", " + "전산 : " + com[i]);
			System.out.printf("평균 : %.2f , " , avg[i]);
			System.out.print("총점 : " + total[i] + ", ");
			
			totallall += total[i];
			avgall += avg[i];
		
			if (avg[i] == 100) {
				System.out.println("학점 : S");
			} else if (avg[i] >= 90) {
				System.out.println("학점 : A");
			} else if (avg[i] >= 80) {
				System.out.println("학점 : B");
			} else if (avg[i] >= 70) {
				System.out.println("학점 : C");
			} else if (avg[i] >= 60) {
				System.out.println("학점 : D");
			} else {
				System.out.println("학점 : F");
			}
			
		}
		System.out.println("======= 학급 평균 성적표 =======");
		System.out.printf("평균총점 : " + totallall/nam + ", " + "학급평균 : %.2f" , avgall/nam);
	}
}
