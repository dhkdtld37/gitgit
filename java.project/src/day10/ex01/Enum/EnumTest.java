package day10.ex01.Enum;

// (접근지정자) enum 열거형 이름 {필요한 상수들 나열...}

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest {
	Day day;
	
	public EnumTest (Day day) {
		this.day =day;
	}
	
	public void tellItLikeIS() {
		switch (day) {
		case MONDAY : 
			System.out.println("Monday are bad.");
			break;
		case TUESDAY : 
			System.out.println("Tuesday are better.");
			break;
		case WEDNESDAY : 
			System.out.println("Wednesday are best..");
			break;
			
			default : 
				System.out.println("Midweek days are so~so.");
			
		}
	}

}
