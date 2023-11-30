// 소수 찾기 - 백준
package groupquiz;
import java.util.Scanner;
import java.util.Random;
public class group208 {
	public static void main(String[] args) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		n = sc.nextInt();
		
		int [] num = new int [n];
		
		for ( int i = 0; i < n; i++) {
			int pick = rand.nextInt(1000)+1;
			num[i] = pick;
			for (int j = 0; j < i; j++) {
				if (num[j] == pick) {
					i--;
					break;
				}
			}
		}
		
		for (int x : num)
			System.out.print(x + "\t");
		
		int count = 0;
		
		for (int x : num) {
            if (x > 1) {
                boolean S = true;
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        S = false;
                        break;
                    }
                }
                if (S) {
                    count++;
                }
            }
        }

        System.out.println("\n소수 개수: " + count);
    }
}


