package day04.ex01.control.While;

public class WhileMulti {
	public static void main(String[] args) {
		int a = 1, b= 1;
		
		while (a <=2) {
			b = 1;
			while (b <=3 ) {
				System.out.print(b + "\t");
				b++;
			}		// b end
			a++;
			System.out.println();
		}			// a end
	}

}
