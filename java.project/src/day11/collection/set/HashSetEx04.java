package day11.collection.set;

public class HashSetEx04 {
	public static void main(String[] args) {
		A a = new A ();
		B b = new B ();
		A bb = new B ();
		
		System.out.println( b instanceof A);
		System.out.println( b instanceof B);
		System.out.println( a instanceof A);
		System.out.println( a instanceof B);
		
	}
}

class A {
	String name;
}

class B extends A {
	
}


