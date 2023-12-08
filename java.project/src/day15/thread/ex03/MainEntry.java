package day15.thread.ex03;

public class MainEntry {
	public static void main(String[] args) {
		
//     1.		
//		GrapicThread gt = new GrapicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
// 		2.		
		new Thread( new GrapicThread(200) ).start();
		
	}

}
