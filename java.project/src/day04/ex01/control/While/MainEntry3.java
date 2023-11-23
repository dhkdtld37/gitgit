package day04.ex01.control.While;
import java.util.Scanner;
public class MainEntry3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 데이터 입력");
		System.out.println("integer, double, char data input : ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char z = sc.next().charAt(0);
		
		System.out.println(x + ", " + y + ", " + z);

	}

}
		
