package day15.thread.syncronized;
// 해결하기 @@@@@@@@@@@@@@@@@@@@@
class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	// 입금 함수
	public void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금 금액 " + amount + "원");
	}
	
	// 출금 함수
	public synchronized void withdraw(int amount, String name) {
		synchronized (this) {
			if ( (money - amount) >= 0 ) {
			
			Thread.yield(); 		//
			
			money -= amount;
			System.out.println(name + " : 출금 금액 " + amount + "원");
		} else {
			System.out.println(name + " : 출금 불가 ( 잔액 부족 )");
		}
	} 		// synchronzied end
			
}
	
	public void getMoney() {
		System.out.println("잔액은 : " + money + "원");
	}
	
}  		// Atm end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { 		// 스레드 실행부 ( 구현부 )
		for (int i = 0; i < 2; i++) {
			try { 
				sleep(50);  	// 0.05초 동안
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (flag) {
				// 1번
				obj.deposit( (int) (Math.random ()*10 + 1 ) * 100 , getName() );
				// 2번 - 코드의 유지 및 보수가 더 좋다고 함
//				int depositAmount = (int) (Math.random() * 10 + 1) * 100;
//				obj.deposit(depositAmount, getName());
//				obj.getMoney();
			} else {
				obj.withdraw( (int)(Math.random ()*10 + 1 ) * 100, getName());
			}	// if end
			
			flag = true;
			obj.getMoney();
		}	// for end
	}
}		// UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "가");
		UserAtm user2 = new UserAtm(at, "나");
		UserAtm user3 = new UserAtm(at, "다");
		
		user1.start();
		user2.start();
		user3.start();
		
	}

}
