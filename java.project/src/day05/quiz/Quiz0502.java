/*
1번째 열과
2번재 열을 더해서
3번재 항에 입력 출력
 */
package day05.quiz;
import java.util.Scanner;
public class Quiz0502 {
	public static void main(String[] args) {
		int [][] arr = new int [3][4];
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr[i].length; j++) {
				if ( i==2 ) {
					arr [2][j] = arr[0][j] + arr[1][j];
				} else {
					System.out.print("a[" + i + "] [" + j + "] = ");
					arr [i][j] = sc.nextInt();
				}
			}
		}
		System.out.println()
		;
		for ( int i = 0; i < arr[0].length; i++) {
			arr[2][i] = arr[0][i] + arr[1][i];
		}
		for ( int j = 0; j < arr.length; j++) {
			for ( int i = 0; i < arr[j].length; i ++) {
				System.out.print(arr[j][i] + "\t");			
			} 
			System.out.println();
		}
	}
}



