package day09.ex02.Abstract;

class Circle extends Shape {

	public double calc(double x, double y) {
		result = x * x * Math.PI;
		return result;
	}

	public void show(String name) {
		calc(5, 5);
		System.out.println(result + " 반지름의 " + name + "이 그려졌습니다.");

	}

}
