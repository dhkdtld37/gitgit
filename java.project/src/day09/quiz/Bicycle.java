package day09.quiz;

class Bicycle extends Trans {

	public void show(String name) {
		System.out.print("교통비가 없는 " + name + "로 ");
	}

	public void start() {
		System.out.println("출발합니다.");
		
	}

	public void stop() {
		System.out.println("목적지에 도착했습니다.");
		
	}

}
