// 백준 - 행렬 덧셈
package groupquiz;
import java.util.Scanner;
public class group203 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int x = scan.nextInt();
		int y = scan.nextInt();
				
		int[][] arr = new int[x][y];
				
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				arr [i][j] = scan.nextInt();
				}
			}
			
			for(int i=0; i<x; i++) {
				for(int j=0; j<y; j++) {
					arr [i][j] += scan.nextInt();
				}
			}
				
			scan.close();
				
			for(int i=0; i<x; i++) {
				for(int j=0; j<y; j++) {
					System.out.print(arr [i][j] + " ");
				}
				
				System.out.println();
				}
		}
}


