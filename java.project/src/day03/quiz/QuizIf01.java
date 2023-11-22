// 문제 1 ] 숫자 2개 입력 받아서 큰 수 출력하는 프로그램 작성

package day03.quiz;

import java.util.Scanner;

public class QuizIf01 {
	public static void main(String[] args) {
		System.out.println("input data 1 : ");
		int su = new Scanner(System.in).nextInt();
		System.out.println("input data 2 : ");
		int su2 = new Scanner(System.in).nextInt();
		
		if ((su + su2) > 1000 ) {
			System.out.println("큰 수 입니다.");
		} else {
			System.out.println("작은 수 입니다.");
		}
	}

}

