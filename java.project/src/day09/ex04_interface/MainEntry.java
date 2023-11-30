package day09.ex04_interface;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		BB b = new BB();
		b.draw();
		b.show();
		
		// 2.
		IDraw bb = new BB();
		bb.draw();
		
	}

}
