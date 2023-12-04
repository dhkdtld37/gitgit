package day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서 없고, 중복 허용 X

public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();	// <> : 타입
		hs.add("키보드");		hs.add("컵");		hs.add("마우스");		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());		// 중복 X로 인해 4
 		
		Iterator it = hs.iterator(); 
		
		while ( it.hasNext() ) {				// 다음 요소가 있다면~
			System.out.println(it.next());		// 중복 허용 X, 순서 X
		}
		
		System.out.println();
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(200);
		hs2.add(3);
		hs2.add(1000);
		hs2.add(20);
		
		for (Integer item : hs2) {
			System.out.println(item);
		}
		
		System.out.println();
		for (String item : hs) {
			System.out.println(item);
		}
		
		System.out.println();
		it = hs2.iterator();
		while ( it.hasNext() ) {				 // 다음 요소가 있다면~
			System.out.println(it.next());		 // 요소를 꺼내와서 출력
		}
		
	}
}
