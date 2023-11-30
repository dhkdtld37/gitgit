package day09.quiz;

class Subway extends Trans {

	public void show(String name) {
		System.out.print("지하에 있는 " + name + "을 타고 ");
	}

	public void start() {
		System.out.println("출발합니다.");
		
	}

	public void stop() {
		System.out.println("역에 도착했습니다.");
		
	}

}
