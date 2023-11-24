package day05.ex01.array;
import java.util.Scanner;
public class MainEntry0302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		int sum = 0;
		// 임의적 데이터 입력 받아서 출력하기
		System.out.println("arr 데이터 5개를 입력 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + "]  = " + arr[i]);			
		}
		System.out.println("sum = " + sum);
	}
}