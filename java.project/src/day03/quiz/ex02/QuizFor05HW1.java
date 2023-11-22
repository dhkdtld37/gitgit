/*
 *
 **
 ***
 ****
 *****
 */
package day03.quiz.ex02;

public class QuizFor05HW1 {
	public static void main(String[] args) {
		int rows = 5;  // 출력할 줄 수

        // 첫 번째 for 루프: 줄을 나타냄
        for (int i = 1; i <= rows; ++i) {
            // 두 번째 for 루프: 현재 줄(i)의 번호만큼 별표 출력
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            // 현재 줄의 별표 출력이 끝나면 줄 바꿈
            System.out.println();
        }
    }
}

