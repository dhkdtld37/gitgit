// 백준 - 배열 최소, 최대
package testlim;
import java.util.Scanner;
public class group202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
			
		int [] arr = new int[x];
		
		for (int i =0; i < x; i++) {
			arr [i] = sc.nextInt();
		}
		
		int max = arr [0];
		int min = arr [0];
		
		for (int i = 1; i < x; i++) {
			if (max < arr [i]) {
				max = arr [i];
			} else if ( min > arr [i] ) {
				min = arr [i];
			}
		}
		System.out.println(min + " " + max);
		
		sc.close();
	}

}
