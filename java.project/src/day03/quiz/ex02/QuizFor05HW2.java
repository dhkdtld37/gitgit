/*
 *****
 ****
 ***
 **
 *
 */
package day03.quiz.ex02;

public class QuizFor05HW2 {
	public static void main(String[] args) {
		int row = 5;
		
		for (int x = 1; x <=row ; x++) {
			
			for (int y = 5; y >= x; y--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}



