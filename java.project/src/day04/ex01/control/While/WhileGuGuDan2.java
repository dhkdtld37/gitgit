package day04.ex01.control.While;

public class WhileGuGuDan2 {
	public static void main(String[] args) {
		System.out.println(" 전체 구구단");
		
		int a = 1;
		int b = 1;
				
		System.out.println("=================");
		b=1;
		do {
			do {
			System.out.print (a + " X " + b + " = " + a*b + "  ||    ");
			} while (++b < 10);
		
			System.out.println();
			a++;
		} while (a < 10);
	}
}