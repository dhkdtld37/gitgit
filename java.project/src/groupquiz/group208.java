// 문자열 반복 - 백준
package groupquiz;
import java.util.Scanner;

public class group208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            if (num <= 0) {
                return;
            }

            String index = sc.nextLine();

            if (index.length() > 100) {
                return;
            }

            for (int j = 0; j < index.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(index.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
