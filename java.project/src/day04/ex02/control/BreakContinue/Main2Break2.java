package day04.ex02.control.BreakContinue;

public class Main2Break2 {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i < 101; i ++) {
			if (i % 2 != 0) {
				count++;
				continue;
			}
			System.out.print(i + "\t");
			if (count % 10 == 0) System.out.println();
		}
	}
}