package day03.ex01.control;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		// 짝, 홀수 판정
		if (su % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}

