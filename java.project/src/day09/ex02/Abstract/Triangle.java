package day09.ex02.Abstract;

class Triangle extends Shape {

	public double calc(double x, double y) {
		result = (x*y)/2;
		return result;
	}

	public void show(String name) {
		calc(10, 10);
		System.out.println("삼각형의 넓이 : " + result + "인 " + name + "을 그렸습니다.");

	}

}
