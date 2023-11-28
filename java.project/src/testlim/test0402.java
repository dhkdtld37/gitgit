package testlim;

public class test0402 {
	public static void main(String[] args) {
		test04 t4 = new test04 ();
		test04 t42 = new test04 (2);
		test04 t43 = new test04 (2);
		test04 t44 = new test04 ("랄랄랄");
		test04 t45 = new test04("맘맘맘");
		
		t4.display();
		t4.setName("홍길동");
		t4.display();
		t4.setNum(2);
		t4.display();
		t42.display();
		t42.setName("닫닫닫");
		t42.display();
		t42.setNum(3);
		t42.display();
		t43.display();
		t44.display();
		t45.display();
		
	}

}
