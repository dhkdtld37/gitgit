// 소수
package groupquiz;

import java.util.Scanner;

public class group215 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean foundPrime = false;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
                foundPrime = true;
            }
        }

        if (foundPrime) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
