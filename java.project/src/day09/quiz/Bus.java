package day09.quiz;

class Bus extends Trans {

	public void show(String name) {
		System.out.print("지상" + name + "를 타고 ");
	}

	public void start() {
		System.out.println("출발합니다.");
		
	}

	public void stop() {
		System.out.println("정류장에 도착했습니다.");
		
	}

}
