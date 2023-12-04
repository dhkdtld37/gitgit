/*
 ArrayList or Vector 이용해서
 고객추가 / 삭제 / 고객 리스트 출력 / 수정 / 종료 프로그램 작성
 */
package day11.quiz.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
		
//		Customers[] c = new Customers[5];   // 배열 : 고정길이
		ArrayList<Customers> list = new ArrayList<>();   // 가변길이 배열
		Customers c = new Customers();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택하세요 1.add,  2.delete,  3. list print");
		
		switch (sc.nextInt()) {
		case 1 : list.add(new Customers());
		
			break;
		
		default : 
			break;
		}
		
		
	}

}
