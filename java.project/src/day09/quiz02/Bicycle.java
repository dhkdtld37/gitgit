package day09.quiz02;

public class Bicycle extends Trans {

	public String start(String x) {
		go = x;
		return go;
	}

	public void show(String wow) {
		start("따르릉따르릉!!!");
		stop("끽!!!");

		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);

	}

	public String stop(String y) {
		no = y;
		return no;
	}

}