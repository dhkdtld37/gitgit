package day09.quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Bus b = new Bus();
		b.show("버스");
		b.start();
		b.stop();
		
		Subway s = new Subway();
		s.show("2호선");
		s.start();
		s.start();
		
		Bicycle y = new Bicycle();
		y.show("로드 자전거");
		y.start();
		y.stop();
		
		Airplain a = new Airplain();
		a.show("대한항공");
		a.start();
		a.stop();
		
	}

}
