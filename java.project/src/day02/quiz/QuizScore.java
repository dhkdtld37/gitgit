package day02.quiz;

public class QuizScore { 
	public static void main(String[] args) {
		int kor = 90;
		int eng = 88;
		int com = 100;
		int total = kor + eng+ com;
		double avg =(double)(kor + eng + com) / 3;
		
		System.out.println(" ===임성현 님의 성적표===");
		System.out.printf("국어 : %d점, 영어 : %d점, 전산 : %d점\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
		
		System.out.println("\n=========================");
		System.out.println("국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com);
		System.out.printf("총점 : " + total + "\n평균 : " + String.format("%.2f", avg));
	}

}

/*
  result : 
  임성현님의 성적표
  국어 : 90, 영어 : 808 전산 : 100
  총점 : 278, 평균 92.67
 */


