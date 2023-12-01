package day10.ex01.Enum;

public class MainEntry {
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeIS();
		
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeIS();
		
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeIS();
	}

}
