package testlim;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 자연수 A와 B 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // A + B 출력
        System.out.println(A + B);

        // A - B 출력
        System.out.println(A - B);

        // A * B 출력
        System.out.println(A * B);

        // A / B 출력 (몫)
        System.out.println(A / B);

        // A % B 출력 (나머지)
        System.out.println(A % B);
    }
}
