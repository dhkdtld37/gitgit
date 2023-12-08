package day15.thread.ex01;

public class UserThread extends Thread {
	
	String name;
	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { 		// 스레드 실팽부 ( 구현부 )
		
		for (int i = 1; i <= 10; i++) {
			
			if ( i == 7 ) {
				try {
					sleep(1000); 		// 예외 발생, 1/1000 <=== 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			
			System.out.print(i+" ");
		}

		
		
		
//		super.run(); 		// 부모가 갖고 있는 run() 호출
	}		// 
	
	

}
