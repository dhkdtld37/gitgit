// 소인수 분해
package groupquiz;

import java.util.Scanner;

public class group215 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if (x < 2) {
      return;
    }

    A(x);
  }

  private static void A(int n) {
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        n /= i;
      }
    }
    if (n > 1) System.out.println(n);
  }
}
