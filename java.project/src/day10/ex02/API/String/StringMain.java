package day10.ex02.API.String;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "happynewyear";
		String s2 = "SEOUL";
		
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println(s1.concat(s2));		// 문자열 결합
		System.out.println(s1 + s2);
		System.out.println(s2.replace("EO", "korea"));
		System.out.println("s1 = " + s1 + ", s2 = " + s2); 	// s2 변경 없음
//		s2 = s2.replace("EO", "korea");
//		System.out.println("s1 = " + s1 + ", s2 = " + s2); 	// s2 변경 있음
		
		System.out.println();
		String s3 = new String ("            ab                 cd              ");
		System.out.println(s3);
		System.out.println("length = " + s3.length());		// 문자열 길이
		s3 = s3.trim();			// 공백 제거
		System.out.println(s3);
		System.out.println("length = " + s3.length());
		
		System.out.println();
		int [] arr = { 1,2,3,4,5 };
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		System.out.println();
		String s4 = new String("abc defgh kkkk lllll 123123123");
		String [] s5 = s4.split(" ");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		
		System.out.println();
		String s6 = new String("abc/defgh/kkkk/lllll/123123123");
		String [] s7 = s6.split("/");
		for (int i = 0; i < s7.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s7[i]);
		}
		
		System.out.println();
		String s8 = "123-4567-89";
		s5 = s8.split("-");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		System.out.println();
		String s9 = "123456789abcdef";
		char ch = s9.charAt(14);
		System.out.println(ch);
		System.out.println(s9.indexOf('f'));
		System.out.println(s9.lastIndexOf('f'));
		System.out.println(s9.substring(3));
		System.out.println(s9.substring(5, 7));
		
		System.out.println();
		System.out.println(s2 + " 소문자 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println(s1 + " 대문자 출력 toUpperCase() : " + s1.toUpperCase());
		
	}
}