package day10.ex03.API.stringBuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("This");
		System.out.println(sb);
		
		sb.append(" is pecil.");		// 문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my");				// 원하는 위치로 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your");  	// 문자열 변경
		System.out.println(sb);
		
//		System.out.println(sb.reverse()); 		// 문자열 역으로 출력
		System.out.println(sb.length()); 		// 19
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}
}