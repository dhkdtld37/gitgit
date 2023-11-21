package day02.ex02.input;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
		int kor, eng, com, total = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("name input : ");
		String name = sc.next();
		System.out.println("kor, eng, com data input : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		total = kor + eng + com;
		avg = total / 3.0;
		
		System.out.println(" ===임성현 님의 성적표===");
		System.out.printf("국어 : %d점, 영어 : %d점, 전산 : %d점\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
		
		System.out.println("\n=========================");
		System.out.println("국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com);
		System.out.printf("총점 : " + total + "\n평균 : " + String.format("%.2f", avg));
	}

}
