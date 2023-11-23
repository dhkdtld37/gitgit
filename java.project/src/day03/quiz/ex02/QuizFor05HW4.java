/*
     *
    **
   ***
  ****
 *****
 */
package day03.quiz.ex02;

public class QuizFor05HW4 {
	public static void main(String[] args) {
		// 오른쪽 정렬 삼각형
        for (int i = 1; i <= 5; i++) {
        	for (int j = 0; j < 5-i; j++)
        		System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

