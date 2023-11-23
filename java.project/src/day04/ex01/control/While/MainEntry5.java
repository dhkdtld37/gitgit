package day04.ex01.control.While;

import java.util.Scanner;

public class MainEntry5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name, int input : ");
		
		String name = sc.nextLine();
		int su = sc.nextInt();
		double dou = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		// int , string로 위에 역순이면 에러, 무조건 string(nextline) 우선으로
		// 순서랑 버퍼, 저장위치 좀 더 알아볼 것
		
		System.out.println(name + ", " + su + ", " + dou + ", " + ch);
	}
}
