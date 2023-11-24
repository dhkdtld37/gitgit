/*
 for (자료형 변수명 : 컬렉션명 or 배열명 ) {
 		반복구문;
 		}
 */
package day05.ex01.array;

public class MainEntry04ForEach {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===================");
		
		for (int item : arr) {
			System.out.println(item);
		}
		System.out.println("===================");
		
		int[] score = { 78, 80, 70, 99, 50};
		int sum = 0;
		for (int x : score) {
			sum += x;
		}
		
		System.out.println("sum = " + sum);
	}
}
