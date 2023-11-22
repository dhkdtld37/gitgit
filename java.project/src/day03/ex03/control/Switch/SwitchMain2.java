package day03.ex03.control.Switch;
import java.util.Scanner;
public class SwitchMain2 {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j)");
		
		String ch = new Scanner(System.in).next();
		
		switch (ch) {	// 조건 - 문자형, 정수형(long형 제외), 실수형 제외
		case "s" : System.out.print("서울"); break;
		case "d" : System.out.print("대구"); break;
		case "b" : System.out.print("부산"); break;
		case  "j" : System.out.print("제주"); break;
		default : System.out.println("잘못 선택하셨습니다. s, b, d, j 중에서만 선택하시오.");
					System.exit(0);	
		}
		System.out.print(" 를(을) 선택하셨습니다.");
	}

}
