package day03.ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x = ");
		System.out.println("y = ");
		int x, y, result = 0;
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			
			result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		} catch (InputMismatchException e) {
			System.out.println("ArithmeticException");
			System.out.println("올바른 숫자를 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}

