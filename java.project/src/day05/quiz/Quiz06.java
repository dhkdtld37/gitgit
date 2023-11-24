package day05.quiz;
import java.util.Random;
public class Quiz06 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for ( int i = 0; i < 7; i++) {
			System.out.println(rand.nextInt(45));
		}
	}
}
