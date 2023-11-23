package day04.ex01.control.While;
import java.util.Scanner;
public class WhileGuGuDan {
	public static void main(String[] args) {
		System.out.println("구구단");
		System.out.println("원하는 숫자 입력 : ");
		
		int a = 1;
		int b = new Scanner(System.in).nextInt();
		
		while (++a < 10) {
			System.out.println(b + " X " + a + " = " + a*b);
		}
		
		System.out.println("=================");
		
		a=1;
		do {
			System.out.println(b + " X " + a + " = " + a*b);
		} while (++a < 10);
	}
	
}