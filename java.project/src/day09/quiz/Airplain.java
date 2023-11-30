package day09.quiz;

class Airplain extends Trans {

	public void show(String name) {
		System.out.print("하늘로 가는 " + name + "으로 ");
	}

	public void start() {
		System.out.println("출발합니다.");
		
	}

	public void stop() {
		System.out.println("공항에 도착했습니다.");
		
	}

}
