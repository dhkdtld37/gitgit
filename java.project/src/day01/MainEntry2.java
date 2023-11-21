package day01;

public class MainEntry2 {
	public static void main(String[] args) {
		int su = 9;
		char ch = 'A';
		String str = "korea";
		double d = 12.34;
		float f = 12.34f;
		
		System.out.println(su + ", " + ch + ", " + str);
		System.out.println("su ="+su);
		
		System.out.println(100); // int 0 - 4 byte // long x
		System.out.println(100L); // long - 8 byte
		
		System.out.println(3.5);	// double
		System.out.println(3.5F);  // float
		
		System.out.println(su);
		System.out.println(ch); // 2byte
		System.out.println(str);
		System.out.println(d);
		System.out.println(f);
		
		System.out.println();
		int su2 = 100;	// 지역 변수는 반드시 초기화하고 사용
		System.out.println(su2);
		
		// * ----------------------------------------------
		int x = 2;	// 기본자료형
		Integer y = 2;	// 참조형
		x = y.intValue(); 	// 4.x 이전까지는 형변환 함수 이용해야했음
		y = x; 	// autoboxing / unboxing 5.x 이후부터
		
//		String str2 = 'A'; 	// 
//		char ch2 = "encore";
		
		String str3 = "A"; 		// A | 0
		char ch3 = 'A';		// A
		System.out.println(str3);
		System.out.println(ch3);
	}

}
