package day05.ex03.random;
import java.util.Random;
public class MainEntry02 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt());			// -21억 ~ 21억
		System.out.println(rand.nextInt(5));		// 0 ~ 4
		System.out.println(rand.nextInt(10) + 2);
		
	}
}
