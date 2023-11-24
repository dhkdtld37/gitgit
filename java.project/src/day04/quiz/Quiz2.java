// (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ? (5)
package day04.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		
		for ( int i =1; i <11; i++) {
			if (i % 2 == 1) {
				sum1 += (-i);
			} else {
				sum2 += i;
			}
		}
		System.out.println("(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = " + (sum1+sum2));
	}

}
