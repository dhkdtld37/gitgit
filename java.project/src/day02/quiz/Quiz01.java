package day02.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890;
		
		int man = pay / 10000;
		int chun = (pay % 10000) / 1000;
		int bak = (pay % 1000) / 100;
		int ship = (pay % 100) / 10;
		
		System.out.println("pay = " + pay);
		System.out.println("만원 = " + man + "장");
		System.out.println("천원 = " + chun + "장");
		System.out.println("백원 = " + bak + "개");
		System.out.println("십원 = " + ship + "개");
			}

}
/* 
문제 1] 월급을 단위로 계산하기
	pay = 567890;
	result : 
	만원 : 56장
	천원 : 7장
	백원 : 8개
	십원 : 9개
*/
