// 배열로 로또 프로그램 만들기
package day05.quiz;
import java.util.Random;
public class Quiz08Lotto02 {
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		Random rand = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			int pick = rand.nextInt(45)+1;
			lotto[i] = pick;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == pick) {
					i--;
				}
			}
		}
		for (int k : lotto) {
			System.out.print(k + "\t");
		}
		System.out.println();
	}
}

		