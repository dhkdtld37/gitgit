package day03.quiz;
import java.util.Scanner;
public class QuizIf0202 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("년도를 입력하시오");
	        int a = sc.nextInt();

	        if(a % 4 == 0) {
	                System.out.println("윤년");
	            }
	            else System.out.println("평년");
	        }
}

// 윤년 계산에 있어서 실제로는 4의 배수로만 해도 100의 배수는 겹치지 않음
