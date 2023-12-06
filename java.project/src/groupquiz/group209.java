// 약수의 합2 - 백준
package groupquiz;

import java.util.Scanner;

public class group209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long result = g(N);
        System.out.println(result);
    }

    static long g(int N) {
        long sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum += f (i);
        }

        return sum;
    }

    static long f(int A) {
        long sum = 0;

        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                sum += i;
                if (i * i != A) {
                    sum += A / i;
                }
            }
        }

        return sum;
    }
}