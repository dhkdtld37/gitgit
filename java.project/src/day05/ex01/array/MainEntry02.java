package day05.ex01.array;

public class MainEntry02 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		for (int i = 0; i <= arr.length; i++) {
//			sum += i;
		
		System.out.println("arr의 합 = " + sum);
	
	}

}
