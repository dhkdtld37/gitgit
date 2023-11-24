// 3개 정수 입력 받아서 큰 순으로 출력하기
package day04.quiz;
import java.util.Scanner;
public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();		
		int c = sc.nextInt();

		int min, max, mid;
		
		if(a>b)	{  
			max = (a>c) ? a : c;
			min = (b>c) ? c : b;
			mid = (max!=a  && min!=a)? a : 
										  (max!=b  && min!=b) ? b : c;
		} else {
			max = (b>c) ? b : c;
			min = (a>c) ? c : a;
			mid = (max!=a  && min!=a)? a : (max!=b  && min!=b) ? b : c;
		} // if end
			    
		System.out.println( max + " > " + mid + " > " + min );
	}

}
