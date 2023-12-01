package groupquiz;

import java.util.Scanner;

public class group211 {
    public static void main(String[] args) {
        int n, k, j = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = -1;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a[j] = i;
                j++;
            }
        }
        if (a[k] == -1) {
            System.out.println(0);
        } else {
            System.out.println(a[k]);
        }
    }
}

