package day08.quiz03;

public class Student extends Person {

	protected int total;
	
	public Student() {
		
	}
	
	public void input () {
		super.input();
		System.out.println("total = ");
		total = sc.nextInt();
	}
	
	public Student (String name, String gender, int age, int total) {
		super (name, gender, age);
		this.total = total;
	}
	
	public Student (int total) {
		super();
		this.total = total;
	}
	
	public void disp() {
		super.disp();
		System.out.println("점수 : " + total);
	}

}
