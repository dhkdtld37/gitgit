// 팰린드롬인지 확인하기
package groupquiz;
import java.util.Scanner;

public class group20402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[28];
        int[] b = new int[30];

        for (int i = 0; i < 28; i++) {
            a [i] = sc.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            b [i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 30; j++) {
                if ( a [i] == b [j]) {
                    b [j] = 0; 
                    break;
                }
            }
        }

        for (int i = 0; i < 30; i++) {
            if (b [i] != 0) {
                System.out.println(b[i]);
            }
        }

        sc.close();
    }
}