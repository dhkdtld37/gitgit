package day03.ex02.exception;
import java.util.Scanner;
public class MainEntry2 {
	public static void main(String[] args) {
		System.out.print("x = ");
		System.out.print("\ny = ");
		int x, y, result = 0;
		
		Scanner scanner = new Scanner(System.in);

        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
			result = x / y;	// 문제 발생 소지 있는 코드
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			scanner.close();
			}
	}

}

