/*
 wrapper class : 기본 자료형에 대응되는 클래스형 자료형
 기본 자료형	클래스(래퍼런스 또는 참조형) 자료형
 int				integer
 float				Float
 char 				Charter
 double			Double
 */
package day10.ex02.API.wrapper;

class Point { }

public class MainEntry {
	public static void main(String[] args) {
		
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		String su = "30";
		int x = 10;
		Point pt = new Point();
		
		System.out.println(pt);		// 주소
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());
		
		System.out.println();
		System.out.println(Ia);
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));
		
		// Boxing vs UnBoxing
		int  y = 5;
		double d = 3.3;
//		d = y;			// 묵시적 형변환
//		y = d; 		// 에러
		y = (int)d;	// 명시적 형변환
		
		int c = Ia.intValue();		// jdk 4.x 이전까지 사용하던 메소드
		int e = Ib;					// jdk 5.0 이후부터 autoboxing, unboxing 가능
		int num = Integer.parseInt(su);		// 정수로 변환
		
		System.out.println(c + num);
		System.out.println(c + e);
		System.out.println(Ia.MAX_VALUE);		// 21~~
		System.out.println(Ia.MIN_VALUE);		// -21 ~~
		
		Double dd = new Double(12.34);
		System.out.println();
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		
		System.out.println();
		System.out.println(Float.MIN_VALUE);
		
		System.out.println();
		c = (int)dd.doubleValue();
		System.out.println("형변환한 c의 값은? " + c );
		
		System.out.println();
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111111", 2);
		System.out.println(f);
		System.out.println(g);
		
		int h = 3;							// stack memory
		Integer i = new Integer(3);		// heap memory
		
		System.out.println();
		System.out.println(Integer.toOctalString(10));  		// 10진수
		System.out.println(Integer.toHexString(10));		//
		System.out.println(Integer.toBinaryString(10));		// 2진수로
		
	}

}
