package day11.collection.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dZZZZZ");
		set.add("dzzz");
		set.add("elepahnt");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);		// 대문자>소문자>숫자>한글>
		System.out.println("rnage serch : from " + from +  " to " +to);
		System.out.println("result : " + set.subSet(from, to)); 	// a, d;
		System.out.println("result : " + set.subSet(from, to + "zzz")); 	// a, d
		
	}

}
