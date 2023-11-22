package day02.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int su = 12345;
		int hour = su / 3600;
		int min = su %3600 / 60;
		int sec = su % 60;
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
	}
}

/* 
int su = 12345;

시 : 분 : 초
60초 => 1분
60초 => 3600
*/
