package day13.IO.generic;

import java.awt.Point;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = { "abc", "kbs", "dirotor" };
		t1.set(str);
		t1.print();
		System.out.println("===============");

		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
		t2.set(num);
		t2.print();
		System.out.println("===============");
		
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] dob = { 1.2, 2.2, 3.3, 4.5, 5.6, 6.7, 7.7, 8.9 };
		t3.set(dob);
		t3.print();
		System.out.println("===============");
		
		GenericEx<Object> t4 = new GenericEx<Object>();
		Object [] ob = { "12.45", new Date(), 47.2, 5.5, "text", new Point() };
		t4.set(ob);
		t4.print();
		System.out.println("===============");
		
	}
}

