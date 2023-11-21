package day02.ex01.operator;
// 최 단 산 쉬 관 논 삼 대 콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 => ++, --, ~, 등등
		
		int x = 10, y;
		
		y = x++; // 후위 연산 : 대입 먼저, 연산을 나중에
		System.out.println("x = " + x + ", y = " + y);
		
		
		int a = 10, b;
		
		b = ++a; // 전위 연산 : 연산 먼저, 대입을 나중에
		
		System.out.println("a = " + a + ", b = " + b);
	}
}
