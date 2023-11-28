package day07.ex01.method;

import java.nio.file.spi.FileSystemProvider;

public class MainEntry {
	public static void main(String[] args) {
		int x= 3, y = 5;
		
		int result = methodEx ( x, y );
		System.out.println(result);
		
		int [] arrresult = methodEx2 ();
//		for ( int i = 0; i < arrresult.length; i ++) {
//			System.out.print(arrresult[i] + "\t");
//		}
		for ( int item : arrresult) {
			System.out.print(item + " ");
		
		}
		System.out.println();
		
		int [][] result2 = methodEx3 ();
		int sum = 0;
		for (int i = 0; i < result2.length; i++) {
			for (int j= 0; j < result2[i].length; j++) {
				System.out.print(result2[i][j] + "\t");
				sum += result2[i][j];
			}
			System.out.println();
		}
		
		System.out.println("sum = " + sum);
		System.out.println("===== for each 문으로 2차원 배열 데이터 출력 =====");
		
		for ( int [] item : result2) {
			for ( int arrItem : item) {
				System.out.print(arrItem + " ");
			} // arrItem end
			System.out.println();
		} // item end
		
		System.out.println("=======================");
		int index = 0;
		for ( int [] item : result2) {
			System.out.println("index = " + index++);
			System.out.println(item); // 데이터 들어있는 주소 출력
			System.out.println(item.hashCode());
			// 메모리 상의 주소 (16진수 형태)를 10진수 형태 메모리 주소로 보여줌
		}
		
	} // main end

	private static int methodEx(int x, int y) {
		return x + y;
	}

	private static int[] methodEx2() {
		int [] arr = {1,2,3,4,5,6,7,8};
		return arr;
	}
	
	private static int[][] methodEx3() {
		int [][] arr = { {1,2,3,4}, {5,6,7,8} };
		return arr;
	}
}
