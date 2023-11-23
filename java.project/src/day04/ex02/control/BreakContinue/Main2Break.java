package day04.ex02.control.BreakContinue;

public class Main2Break {
	public static void main(String[] args) {
		
		label : 		
		// 식별자 : , 식별자의 위치와 유무에 따라 결과값이 다 달라짐
		for (int i = 1; i<6; i++) {
			
			for (int j = 1; j < 6; j ++) {
				
				if ( j == 3) continue label;
				System.out.println("i : " + i + ", j : " + j);
			}
		}
	}

}
