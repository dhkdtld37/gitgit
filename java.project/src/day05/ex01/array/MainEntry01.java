/*
 배열 (array)
 - 일괄 처리
 - 동일한 데이터 모임
 - 메모리 상에 연속적 모임
 - index는 0부터 시작함
 - for문이랑 친함

 - 형식>
 
 	자료형[] 배열명 = new 자료형[크기];
 	int[] a = new int[30];
 	
 	자료형[][] 배열명 = new 자료형[행크기][열크기];
 	int[][] a = new int[2][3];
 	
 	자료형[][][] 배열명 = new 자료형[면크기][행크기][열크기];
 	int[][][] a = new int[2][2][3];
 	
 */
package day05.ex01.array;

public class MainEntry01 {
	public static void main(String[] args) {
		// 1번
		char[] ch; 	// 배열선언
		ch = new char[4]; 	// 배열 생성, 메모리에 할당
		
		// 2번
		char[] ch2 = new char[4]; 	// 배열 선언 및 생성
		
		// 배열 초기화
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);
		System.out.println(ch2[1]);
		System.out.println(ch2[2]);
		System.out.println(ch2[3]);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("ch2["+i+"] = " + ch2[i]);
		}
		
		// 3번
		char[] ch3 = {'J', 'A', 'Y', 'k', 'p', 'a', 'b', 'y'};
		System.out.println("배열의 길이 : " + ch3.length);
		
		for (int i = 0; i < 7; i++) {
			System.out.println("ch3["+i+"] = " + ch3[i]);
		}
		for (int i = 0; i < ch3.length; i++) {
			System.out.println("ch3["+i+"] = " + ch3[i]);
		}
		
		String[] str = {"a", "kbs", "mbc", "sbs", "jtbc"};
		for (int i = 0; i < str.length; i++) {
			System.out.println("str["+i+"] = " + str[i]);
		}
		
		char[] ch4 = { };		// 초기화
		char[] ch5 = new char[] { }; 	// 초기화
		
		
	}
}
