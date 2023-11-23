// 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) = ? (35)
package day04.quiz;

public class Quiz01 { 
	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		
		for ( int x = 1; x <6; x++) {
			sum += x;
			System.out.println(sum);
			a += sum;
	}
		System.out.print(a);
		
	}
}
