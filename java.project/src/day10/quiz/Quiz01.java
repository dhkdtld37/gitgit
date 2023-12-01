package day10.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		String str = "abc2233DEFGHeijwEIMPYvwxyz2233";
		// 위의 str 문자열을 대문자는 소문자로, 소문자는 대문자로 출력하기
		
		System.out.println(str + "\n" + str.toUpperCase() + "\n" + str.toLowerCase());
		String result = "";
		
		for ( int i = 0; i < str.length(); i ++) {
			
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				result += String.valueOf(ch).toLowerCase();
			} else if ( ch >= 'a' && ch <= 'z') {
				result += String.valueOf(ch).toUpperCase();
			} else {
				result += ch;
			} // if end
		} // for end
		
		System.out.println(result);
	}

}
