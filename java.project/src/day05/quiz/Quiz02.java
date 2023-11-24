// 문제2 ] 11월 한달간의 강수량을 입력 받아서 평균을 구하는 프로그램 작성
package day05.quiz;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		double sum = 0;
		
		System.out.println("11월의 강수량 입력을 입력하시오.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"일의 강수량 입력 : ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.printf("11월 한달간의 강수량의 평균 = %.2f" , (sum/3));
	}

}
