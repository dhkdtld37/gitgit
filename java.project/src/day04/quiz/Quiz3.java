// 1/2 + 2/3 + 4/5 + 5/6 + 6/7 + ... + 9/10 = ? (7.07)
package day04.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		double sum = 0;
		for ( int i = 1; i<10; i++) {
			sum += (double)i/(i+1);
		}
		System.out.println("1/2 + 2/3 + 4/5 + 5/6 + 6/7 + ... + 9/10 = " + sum);
	}

}
