// class person ( string name, gender, int age)
// 상속한 학생 클래스 까지 구현
// class student ( int jumsu)
package day08.quiz03;
import java.util.Scanner;
public class Person {		// Super class

	protected String name, gender;
	protected int age;
	
	Scanner sc =  new Scanner(System.in);
	
	public Person () {
		
	}
	
	public void input () {
		String name, gender;
		System.out.println("name = ");
		this.name = sc.next();
		System.out.println("gender = "); 
		this.gender = sc.next();
		System.out.println("age = ");
		this.age = sc.nextInt();
			
	}
	
	public Person (String name, String gender, int age) {
		super ();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
//	public Person(String name) {
//		this (name, null, null);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void disp () {
		System.out.println("이름 : " + name + "\n성별 : " + gender + "\n나이 : " + age);
	}
	
}
	

