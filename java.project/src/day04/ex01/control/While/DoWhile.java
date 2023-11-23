package day04.ex01.control.While;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		int su = 0;
		
		/*
		System.out.println("점수 ( 0 ~ 100 ) = ? ");
		su = new Scanner(System.in).nextInt();
		
		System.out.println(su);
		*/
		
		do {
			System.out.println("점수 ( 0 ~ 100 ) = ? ");
			su = new Scanner(System.in).nextInt();
			
			System.out.println(su);
		} while ( su < 0 || su > 100);
		
		System.out.println(su);
	}

}
