/*
 문제 1] 업 다운 게임 프로그램 작성 (난수 이용)
 1 ~ 100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를 줘서 입력
 그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
 */
package day05.quiz;
import java.util.Random;
import java.util.Scanner;
public class Quiz07UpDown {
	public static void main(String[] args) {
		int num = 0;
		int ans = 0;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		num = rand.nextInt(100)+1;		
//		System.out.println(num);
		
		System.out.println("Up or Down");
		
		for (int i= 0; i < 5; i++) {
			System.out.println(i+1 + "번째 답을 입력하세요.");
			ans = sc.nextInt();
			if ( num > ans) {
				System.out.println("Up");
			} else if (num < ans) {
				System.out.println("Down");
			} else {
				System.out.println("Congratuation! " + num);
				return;
			}
		}
		System.out.println("아쉽습니다. 정답은 " + num + "입니다.");;
	}
}

