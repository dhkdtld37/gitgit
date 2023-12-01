package testlim;
import java.util.Scanner;
public class test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		long result = A(x);
		System.out.println(result);
	}
	
	static long A(int x) {
		long sum = 0;
		
		for (int i = 0; i <= x; i ++) {
			sum += f(i);
		}
		
		return sum;
	}
	
	static long f(int B) {
		long sum = 0;
		
		for (int i = 1; i * i <= B; i++) {
			if ( B % i == 0) {
				sum += i;
				if (i * i != B) {
					sum += B / i;
				}
			}
		}
		
		return sum;
	}

}
