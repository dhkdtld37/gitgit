/*
과제 ] 사칙 연산 프로그램 작성 (예외 처리 하기)
숫자 2개 입력 받고, 연산자 (+, -, *, /) 1개 입력 받아서 <--- string, char
 */
package day03.quiz.ex02;
import java.util.Scanner;
public class QuizFor04HW {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("사칙 연산 프로그램");
		System.out.println("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2 : ");
		int num2 = sc.nextInt();
		System.out.println("원하는 연산 : ");
		String x = sc.next();
		
		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1*num2;
		double d = num1/num2;
		
		switch (x) {
			case "+" :
				System.out.print(num1 + " + " + num2 + " = " + a); break;
			case "-" :
				System.out.print(num1 + " - " + num2 + " = " + b); break;
			case "*" : 
				System.out.print(num1 + " * " + num2 + " = " + c); break;
			case "/" :
				System.out.print(num1 + " ÷ " + num2 + " = " + d); break;
		}
	}
}