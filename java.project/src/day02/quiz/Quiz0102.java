package day02.quiz;

public class Quiz0102 {
	public static void main(String[] args) {
		int pay = 567890;
		
		System.out.println("pay = " + pay);
		
		System.out.println("만원 = " + pay/10000 + "장");
		pay %= 10000;
		System.out.println("천원 : " + pay/1000 + "장");
		pay %= 1000;
		System.out.println("백원 : " + pay/100 + "개");
		pay %= 100;
		System.out.println("십원 : " + pay/10 + "개");
	}

}
