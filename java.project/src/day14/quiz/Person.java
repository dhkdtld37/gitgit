/*
 비만도 측정 프로그램 작성 - collection, io, file 이용하기
 추가 / 삭제 / 출력 / 수정 처리할것 ( file 저장 함수 따로 만들수도 있고 )
 
 몸무게, 키를 입력 받아서 bmi 계산하기
 bmi = 몸무게 / ( (키/100) * (키/100) );
 
  남 : (신장cm - 100) * 0.9
  여 : (신장cm - 100) * 0.85
  
 판정>
 18.5 미만 저체중
 18.5 ~ 22.9  정상
 23.0 ~ 24.9  과체중
 25.0  이상 비만
 */
package day14.quiz;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private double height, weight, bmi;
	
	public Person() {
		this.name = "";
		this.height = 0;
		this.weight = 0;
		this.bmi = 0;
	}
	public Person(String name) {
		super();
		this.name = name;
		this.height = 0;
		this.weight = 0;
		this.bmi = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	

}
