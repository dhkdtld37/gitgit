/*
 7 	  2  1  3			1번째 열과
 10  8  9  7			2번재 열을 더해서
 17 10 10 10 		3번재 항에 입력하게 출력
 */
package day05.quiz;

public class Quiz05 {
	public static void main(String[] args) {
		int [][] arr = new int [][] { {7,2,1,3}, {10,8,9,7}, {0,0,0,0} };
		
		for ( int i = 0; i < arr[0].length; i++) {
			arr[2][i] = arr[0][i] + arr[1][i];
		}
		for ( int j = 0; j < arr.length; j++) {
			for ( int i = 0; i < arr[j].length; i ++) {
				System.out.print(arr[j][i] + " ");			
				} System.out.println();
			}
	}
}



