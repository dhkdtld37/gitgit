package day08.quiz03;
import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		
		Person pe;
		Student st;
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("1. 일반인, 2. 학생 중 선택하시오.");
		
		choice = (sc.nextInt());
		
		switch (choice) {
		case 1 : 
			pe = new Person();
			pe.input();
			pe.disp();
			break;
		case 2 :
			st = new Student();
			st.input();
			st.disp();
			break;
		}
	}

}
