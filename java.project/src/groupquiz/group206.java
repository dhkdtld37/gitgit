// 단어의 갯수 - 백준
package groupquiz;
import java.util.Scanner;
public class group206 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.print(0);
            return;
        }

        String[] words = s.split("\\s+");
        int count = words.length;
        System.out.print(count);
    }
}

