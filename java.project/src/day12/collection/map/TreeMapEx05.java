package day12.collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx05 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 1000);
		tm.put("aa", 9999);
		tm.put("cc", 1000);
		tm.put("tt", 1);
		tm.put("bb", 1000);
		
		System.out.println("value : " + tm.get("aa"));
		System.out.println(tm);		// 자동 정렬 - key
		
		TreeSet set = new TreeSet();
		
		for (int i = 0; i < 6; i++) {		// set.size() : 0
			set.add((int)(Math.random()*50)+1);
		}
		
		List list = new LinkedList(set);
		
		System.out.println(set);
	}

}







