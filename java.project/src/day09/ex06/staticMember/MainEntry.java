package day09.ex06.staticMember;

class Atm {
	int count;	// instance member
	static int total;		// static member
	
	public Atm(int amount) {	//constructor
		count += amount;	// count = count + amount;
		total += amount; 		// total = total + amount;
	}
	
	public static void view() {
//		count = count + 100;	// static method 에서는 일반 멤버 변수는 사용 불가
		total = total + 100;
	}
	
	public void show (int count, int total) {
		this.count = count;
//		this.total = total;		// static member에는 this 사용 불가
	}
	
	public void display() {	// instance method에서는 둘 다 사용 가능
		count = count + 200;
		total = total + 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
		
	}
}	// Atm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display(); 		// c : 1000, t : 1000
		
		Atm at2 = new Atm(1000);		// c : 1000, t : 2000
		at2.display();
		
		Atm at3 = new Atm(1000);		// c : 1000, t : 3000
		at3.display();
		
		System.out.println(at.total);
		System.out.println(at.count);
	}

}
