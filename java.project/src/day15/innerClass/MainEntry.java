package day15.innerClass;

class OuterClass { 		// 외부 클래스
	static int no;
	String message = "hello";
	
	public void OuterMethod() {
		System.out.println("outer method call");
//		System.out.println(su); 		// 외부에서 내부는 접근 불가
//		show();
		System.out.println();
	}
	
	class InnerClass {  	// 내부 클래스
		int su = 99;
		
		public void show() {
			System.out.println(su);		// 내부(자신의 것) 사용 가능
			System.out.println(message); 		// 외부 클래스 멤버 사용 가능
		}
		
		public void disp () {
			OuterMethod(); 		// 외부 클래스 메소드 호출
		}
	} 	// innerclass end
}  	// outerclass end

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("000000000000000000000000000");
		
		// 2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
			ic.disp();
			ic.show();

	}

}
