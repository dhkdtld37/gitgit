package day09.quiz;

public abstract class Trans {
	
	public abstract void start();
	public abstract void stop();
	public abstract void show (String name);
	
	public void view() {
		System.out.println("super class trans 입니다.");
	}

}
