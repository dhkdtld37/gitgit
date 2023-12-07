// 대칭 차집합
package groupquiz;

import java.util.HashMap;
import java.util.Scanner;

public class group217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a 집합 입력받기
        HashMap<Integer, Integer> aArr = new HashMap<>();
        for (int i = 0; i < a; i++) {
            int aa = scanner.nextInt();
            aArr.put(aa, aa);
        }

        // b 집합 입력받기
        HashMap<Integer, Integer> bArr = new HashMap<>();
        for (int i = 0; i < b; i++) {
            int bb = scanner.nextInt();
            bArr.put(bb, bb);
        }

        // a-b , x 변수에 aArr와 bArr 일치할때마다 +1 해주기
        int x = 0;
        for (int key : bArr.keySet()) {
            if (aArr.containsKey(key)) {
                x++;
            }
        }

        // b-a, y 변수에 aArr와 bArr 일치할때마다 +1 해주기
        int y = 0;
        for (int key : aArr.keySet()) {
            if (bArr.containsKey(key)) {
                y++;
            }
        }

        System.out.println((aArr.size() - x) + (bArr.size() - y));
    }
}