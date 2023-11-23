package day04.ex02.control.BreakContinue;

public class Main2Break3 {
	public static void main(String[] args) {
		boolean t = true;
		
		first : {
			second : {
				third : {
					int k = 100;
					System.out.println("Before the break"); // 실행
					if(t) break second;
					System.out.println("this won't execute");	// X
					
				}	// third end
				System.out.println("123");	// X
			}	// second end
			System.out.println("this is after seocnd block");	// 실행
		}	// first end
	}

}
