// 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) = ? (35)
package day04.quiz;

public class Quiz0102 { 
	public static void main(String[] args) {
		int sum = 0;
		
		for ( int x = 1; x <=5; x++) {
			for (int y = 1; y <=x; y++) {
				sum+=y;
				System.out.println(sum);
			}
		} 
		System.out.println(sum);
	} 
}