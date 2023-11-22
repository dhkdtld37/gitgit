package day02.ex02.input;

import java.util.Scanner;

public class MainEntry3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kor, eng, com data & name input : ");		
		int kor = sc.nextInt();
        int eng = sc.nextInt();
        int com = sc.nextInt();
        String name = sc.next();

        int total = kor + eng + com;
        double avg = (double) total / 3;
        
		System.out.println();
		System.out.println("국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com);
		System.out.printf("총점 : " + total + "\n평균 : " + String.format("%.2f", avg));

		
	}

}

