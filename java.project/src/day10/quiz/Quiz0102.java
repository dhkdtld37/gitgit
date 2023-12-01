package day10.quiz;

public class Quiz0102 {
	public static void main(String[] args) {
		String str = "abc2233DEFGHeijwEIMPYvwxyz2233";
		// 위의 str 문자열을 대문자는 소문자로, 소문자는 대문자로 출력하기
		
		System.out.println(str + "\n" + str.toUpperCase() + "\n" + str.toLowerCase());
		
		for ( int i = 0; i < str.length(); i ++) {
			char str2 = str.charAt(i);
			
			if (Character.isUpperCase(str2)) {
				System.out.print(Character.toLowerCase(str2));
			} else if (Character.isLowerCase(str2)) {
				System.out.print(Character.toUpperCase(str2));
			} else {
				System.out.print(str2);
			}
		}
	}

}
