package day04.ex01.control.While;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("------------------");
		for (int i = 1; i < 4; i++) {
			System.out.println(i+"\t");
		}
		
		System.out.println("\nwhile~~~");
		int a = 1; // 변수 초기화
		while (a<=3) {
			System.out.println(a+"\t");
			a++;
		}
		System.out.println(a); //4
		
		a=1;
		do {
			System.out.println(a+"\t");
			a++;
		} while (a <= 3);
	}
}
