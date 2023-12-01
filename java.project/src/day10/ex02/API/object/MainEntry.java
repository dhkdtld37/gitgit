package day10.ex02.API.object;

class Point {}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());		// 1651191114
		System.out.println("Object String : " + pt.toString());		// 626b2d4a
		System.out.println("Object String : " + pt);
		System.out.printf("10진수 %d\n", 0x626b2d4a);		// 숫자, 0숫자, 0x숫자
		System.out.println("=================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());			// 2054798982
		System.out.println("Object String : " + pt2.toString());		// 7a79be86
		System.out.printf("10진수 %d\n", 0x7a79be86);
		
		System.out.println("pt.toString() :  toString()의 의미 - ay10.ex02.API.object.Point@a79be86 ");
		System.out.println(pt2.getClass() .getName() + '@'+Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		
		if ( pt.hashCode() == pt3.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Point pt4;
		pt4 = pt;		 // ?
		
		if ( pt.hashCode() == pt4.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println(pt.hashCode() + ", " + pt4.hashCode());
	}
}
