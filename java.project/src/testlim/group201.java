// 백준 - 영수증 문제
package testlim;
import java.util.Scanner;
public class group201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 	// 총 금액
		int y = sc.nextInt(); 	// 물건의 종류 수
		
		int total = 0;
		for (int i = 0; i < y; i++) {
			int a = sc.nextInt();	// 물건 가격
			int b = sc.nextInt();	// 물건 개수
			
			total = total + (a*b);
		}
		
		if (total == x) {
			System.out.println("Yes");
		} else 
			System.out.println("No");
		
		sc.close();
	}

}
