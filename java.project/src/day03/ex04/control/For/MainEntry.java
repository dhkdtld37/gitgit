/*
 - 초기값, 증감식은 2개 이상 기재 가능
 (단, 조건은 오직 1개여야함)
 - 초기값, 증감식은 생략 가능
 (단, 조건은 생략하면 무한루프 - 에러)
 
 int a = 1, b;
 for (a = 1; b = 2; a<=2; a++, b+=2) {
 		s.o.p ( a + "\t" );
 		}
 int a = 1, b;
 
 for( ; a<=2; ) {
 		s.o.p ( a + "\t" );
 		a++;
 		b+=2;
 		}
 		
 - 무한 루프
 for ( ; ; ) {
 		s.o.p ( a + "\t" );
 		if(조건) break; // 탈출구문

 }
 */
package day03.ex04.control.For;

public class MainEntry {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
		}
		
		for (int i = 1; i < 101; i++) {
			System.out.print(i + "\t");
				if (i  % 10 == 0 ) {
					System.out.println();	
			}
		}
		for (int i = 1; i <= 5; i++) {
			System.out.print("* ");
		}
	}
}
