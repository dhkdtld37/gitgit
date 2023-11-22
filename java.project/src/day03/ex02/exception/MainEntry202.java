package day03.ex02.exception;
import java.util.Scanner;

public class MainEntry202 {
    public static void main(String[] args) {
        System.out.print("x = ");
        Scanner scanner = new Scanner(System.in);

        int x, y, result = 0;

        try {
            x = scanner.nextInt();

            System.out.print("y = ");
            y = scanner.nextInt();

            result = x / y;  // 문제 발생 소지 있는 코드
        } catch (Exception e) {
            System.out.println("에러가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        System.out.println(result);
        System.out.println("프로그램이 종료되었습니다.");
    }
}

