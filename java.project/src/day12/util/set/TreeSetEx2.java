package day12.util.set;
import java.util.*;

class TreeSetEx2{
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

		System.out.println("50보다 작은 원소들 출력 :" + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 원소들 출력 :" + set.tailSet(new Integer(50)));
	}
}