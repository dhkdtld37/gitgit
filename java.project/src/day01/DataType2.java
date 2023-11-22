package day01;

public class DataType2 {
	public static void main(String[] args) {
char ch = 'A';	// ASCII code
		
		System.out.println(ch + ", ASCII code =" + (int)ch);
		System.out.println('B');
		System.out.println((int)'b');
		
		int num = 9;		// 10진수
		int xNum = 0x9; 	// 0x숫자 : 16진수
		int oNum = 011;  // 0숫자 : 8진수
		int bNum = 0B1010;  // 0b숫자 : 2진수 
	
		System.out.println();
		System.out.println("2진수 : " + bNum);
		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + xNum);
		System.out.println("8진수 : " + oNum);
		
		System.out.println("==========================");
		System.out.printf("%d %d  | n", 0xa, 0xA);		// 16 ---> 10
		System.out.printf("%d | n", 012);		// 8 ---> 10
		System.out.println();
		System.out.println("==========================");
		System.out.printf("%x  %X  | n", 10, 10);  // 10 ---> 16
		System.out.printf("%o  %o  | n", 10, 10);  // 10 ---> 8
		
	}

}
