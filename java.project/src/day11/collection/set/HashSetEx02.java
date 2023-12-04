package day11.collection.set;

import java.util.HashSet;
import java.util.Set;

// Set : 순서 없고, 중복 허용 X

public class HashSetEx02 {
	public static void main(String[] args) {
		Object[] objarr = { "1", new Integer(1), "2", "3", "4", "4", "4" };
	
		Set set = new HashSet();
	
		for(int i = 0; i < objarr.length; i++) {
			set.add(objarr[i]);
		}
		
		System.out.println(set);
	}
	
}
