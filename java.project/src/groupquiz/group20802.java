// 문자열 반복 - 백준
package groupquiz;
import java.util.Scanner;

public class group20802 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int times;
        int cnt = in.nextInt();
        for (int i = 0; i < cnt; i++) {
            times = in.nextInt();
            str = in.next();
            for (int h = 0; h < str.length(); h++) {
                for (int j = 0; j < times; j++)
                    System.out.print(str.charAt(h));
            }
            System.out.println();
        }
    }
}
