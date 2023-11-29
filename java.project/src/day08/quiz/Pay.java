package day08.quiz;


public class Pay extends Regular {
	double per = 0.03 ;
	
	public Pay() {
		super();
	}
	
	public Pay(int enumber, int phone, String name, String part) {
		super(enumber, phone, name, part);
	}
	
	public void salesP(String a) {
		
		if(a == "영업") {
			System.out.printf("당신의 급여는 %.0f입니다.", pay*(per+1));
		}
		else {
			System.out.printf("당신의 급여는 %.0f입니다.", pay);
		}
	}
}