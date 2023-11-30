// 소수 찾기 - 백준
package groupquiz;
import java.util.Scanner;
public class group20802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int [] arr = new int[N];
        int count = 0;

        if (N <= 100) {
            for (int i = 0; i < N; i++) {
                arr [i] = sc.nextInt();
                
                if (arr [i] <= 1000) {
                    if (arr[i] > 1) {
                        boolean isPrime = true;
                        
                        for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        
                        if (isPrime) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}