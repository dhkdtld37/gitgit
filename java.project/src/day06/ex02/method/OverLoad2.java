package day06.ex02.method;

public class OverLoad2 {
	
	public static void line() {
		System.out.println("-------------------");
	}
	
	public static void line(String str) {
		for (int i = 1; i < 11; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void line(String str, int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		line("&", 15);
		line("A");
		line();
		line("*");
		line("#", 20);
	}
}
