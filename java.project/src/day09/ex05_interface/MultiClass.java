package day09.ex05_interface;

import day09.ex02.Abstract.Shape;
import day09.ex04_interface.IDraw;

public class MultiClass extends Shape implements Test, IDraw {
	
	String irum = "이순신";

	public void draw() {
		System.out.println("IDraw interface method");
	}

	public void tshow(String name) {
		System.out.println("Test interface method");
	}

	public double calc(double x, double y) {
		System.out.println("Shape abstract class");
		return 100;
	}

	public void show(String name) {
		System.out.println("Shape class method");
		System.out.println(name + " hi");
	}


}
