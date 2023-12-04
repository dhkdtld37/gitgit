// 세로 읽기
package groupquiz;

import java.util.Scanner;

public class group213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] words = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String word = sc.next();
            words[i] = word.toCharArray();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length) {
                    result.append(words[j][i]);
                }
            }
        }

        System.out.println(result.toString());
    }
}
