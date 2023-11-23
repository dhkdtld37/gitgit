/*
 *****
  ****
   ***
    **
     *
 */
package day03.quiz.ex02;

public class QuizFor05HW3 {
	public static void main(String[] args) {
		// 오른쪽 정렬 역삼각형
        for (int i = 5; i >= 1; i--) {
        	for (int j = 0; j < 5-i; j++)
        		System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



