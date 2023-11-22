package day03.ex01.control;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		System.out.println("integer data : ");
		int su = new Scanner(System.in).nextInt();
	
		if (su > 0) {
			System.out.println("' 양수 ' 입니다.");
		} else if ( su == 0) {
			System.out.println("' 0 ' 입니다.");
		} else {
			System.out.println("' 음수 ' 입니다.");
		}	
	}
}

