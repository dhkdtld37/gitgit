// 2개 정수 입력 받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성 (io로 처리)
package day13.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double su1, su2;
		String str;
		
		while (true) {
			try {
				System.out.println("숫자를 입력하시오");
				System.out.println("숫자 1 : ");
				su1 = Integer.parseInt(br.readLine());
				System.out.println("숫자 2 : ");
				su2 = Integer.parseInt(br.readLine());
				System.out.println("사칙연산 기호 : ");
				str = br.readLine();
				
				if ( str != null && str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") ) {
					break;
				} else {
					System.out.println("잘못된 연산 기호입니다. 다시 입력하세요.");
				}
			}
			catch (NumberFormatException n) {
				System.out.println("숫자를 입력하지 않았습니다.");
			}
		}
		
		switch (str) {
			case "+" : {
				System.out.println((int)su1 + " " + str + " " + (int)su2 + " = " + (su1+su2));
				break;
			}
			case "-" : {
				System.out.println((int)su1 + " " + str + " " + (int)su2 + " = " + (su1-su2));
				break;
			}
			case "*" : {
				System.out.println((int)su1 + " " + "×"+ " " + (int)su2 + " = " + (su1*su2));
				break;
			}
			case "/" : {
				if ( su2 == 0 ) {
					System.out.println("0으로 나눌 수 없습니다.");
					break;
				} else {
					System.out.println((int)su1 + " " + "÷" + " " + (int)su2 + " = " + (su1/su2));
					break;
				}
			}
		}
	}
}
