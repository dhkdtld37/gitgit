package day05.ex03.random;

public class MainEntry {
	public static void main(String[] args) {

//		System.out.println(Math.random()); 				// 0.0 ~ 1.0
//		System.out.println(Math.random() * 5 ); 			// 0.0 ~ 5.0
		System.out.println((int)(Math.random() * 5) );	// 0~5
		System.out.println((int)(Math.random() * 5) + 1 );
		
		for ( int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 45) + 1 );
		}
	}
}
