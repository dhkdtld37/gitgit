package day09.ex05_interface;

import day09.ex02.Abstract.Shape;
import day09.ex04_interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		
		mc.draw();
		mc.tshow("강감찬");
		mc.show("광개토대왕");
		mc.tshow("메세지");
		System.out.println("=============");
		
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.su);
		
		System.out.println("==============");
		Shape s = new MultiClass ();
		System.out.println(s.calc(3, 3));
		s.show("김희선");
		
	}

}
