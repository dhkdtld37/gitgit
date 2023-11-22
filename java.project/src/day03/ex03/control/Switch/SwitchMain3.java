package day03.ex03.control.Switch;
import java.util.Scanner;
public class SwitchMain3 {
	public static void main(String[] args) {
		System.out.println("point = ");
		
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {	// 조건 - 문자형, 정수형(long형 제외), 실수형 제외
		case 1 : System.out.print("집 "); 
		case 2 : System.out.print("피아노 "); 
		case 3 : System.out.print("우산 "); 
		
		}
		System.out.print("상품에 당첨 되셨습니다. 축하합니다 !");
	}

}
