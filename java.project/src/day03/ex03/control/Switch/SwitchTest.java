package day03.ex03.control.Switch;
import java.util.Scanner;
public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("점수를 입력하시오. ( 국어, 영어, 수학 ) = ");
		Scanner sc = new Scanner(System.in);
		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = (double)total / 3;
		char grade;
		System.out.println("평균 : " + avg);
		
		switch (total / 30) {
			case 10 : grade = 'S'; break;
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F'; 
		}
		System.out.println("\n\n" +"총점 : " + total + " ===> " + grade + "학점");
	}

}
