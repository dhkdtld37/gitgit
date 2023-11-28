package testlim;

public class test04 {
	String name;
	int num;
	
	public test04 () {
		name = "강강강";
		num = 1;
	}
	public test04 (int num) {
		name = "난난난";
		this.num = num;
	}
	
	public test04 (String name) {
		num = 999;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void display () {
		System.out.println("이름은 : " + name + "\n번호는 : " + num);
	}
	

}
