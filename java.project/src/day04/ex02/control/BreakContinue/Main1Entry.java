package day04.ex02.control.BreakContinue;

public class Main1Entry {
	public static void main(String[] args) {
		
		for ( int i = 1; i < 11; i ++) {
			if (i==7) break;
			System.out.print(i + " ");
		}
		System.out.println();
		for ( int i = 1; i < 11; i++) {
			if (i == 7) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		for ( int i = 1; i < 11; i++) {
			if (i %2!=0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		for ( int i = 1; i < 11; i++) {
			if (i %2!=1) continue;
			System.out.print(i + " ");
		}
	}

}
