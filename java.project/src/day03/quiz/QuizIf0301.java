package day03.quiz;
import java.util.Scanner;
public class QuizIf0301 {
	public static void main(String[] args) {
		int math, eng, kor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("전산 점수 입력 : ");
        math = sc.nextInt();
        System.out.print("영어 점수 입력 : ");
        eng = sc.nextInt();
        System.out.print("국어 점수 입력 : ");
        kor = sc.nextInt();

        double avg = (double)(math + eng + kor) / 3;

        if(math <= 40 || eng <= 40 || kor <= 40){
            if(math <= 40)
                System.out.print("전산 ");
            if (eng <= 40)
                System.out.print("영어 ");
            if (kor <= 40)
                System.out.print("국어 ");
            System.out.println("점수 미달로 불합격입니다.");
        }
        else{
            System.out.printf("평균 :  %.2f\n" , avg);
            if(avg >= 60)
                System.out.println("합격입니다.");
            else
                System.out.println("펑균 미달로 불합격 입니다.");
        }
    }
}


