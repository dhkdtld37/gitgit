package day03.quiz.ex02;

public class QuizFor06 {
	public static void main(String[] args) {
		//정사각형
        for (int i = 1; i <= 5; ++i) {
     
            for (int j = 1; j <= 5; ++j) {
                System.out.print("* ");
            }  
            System.out.println();
        }
        System.out.println("==============================");
        
        // 54321 다른방법
        for (int i = 0; i <= 5; ++i) {
            
            for (int j = 1; j < 6-i ; ++j) {
                System.out.print("* ");
            }  
            System.out.println();
        }
	}
}

