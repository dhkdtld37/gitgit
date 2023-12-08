package day15.thread.ex02;

import java.util.Iterator;

public class UserRunnable implements Runnable {

	String name;
	public UserRunnable (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {		// 스레드 구현 후 실행부(구현부)
		
//		System.out.println("runaable run() call");
			
		for (int i = 1; i < 11; i++) {
			
			if ( i == 4 ) {
				try {
					Thread.sleep(1000); 	// 예외 발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
}
