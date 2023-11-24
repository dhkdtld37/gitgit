package day05.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int[] su = {1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 33};
		
		int count = 0;
		
		for ( int i = 0; i < su.length; i++) {
			if (su[i] == 7) {
				count = count + 1;
			}
		}
		System.out.println("su의 7의 개수 = " + count);
	}

}
