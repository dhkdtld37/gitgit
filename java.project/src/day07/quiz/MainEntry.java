package day07.quiz;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV ();
		TV tv1 = new TV ("red");
		tv.display();
		tv.setChanne(17);
		tv.setColor("green");
		tv.display();
		tv1.display();
		
		TV tv2 = new TV(7);
		tv2.display();
		
		TV tv3 = new TV("aqua", 20);
		tv3.display();
	}

}
