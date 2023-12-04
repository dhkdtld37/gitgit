package day11.collection.list;

import java.util.Vector;
import java.util.Iterator;

// list : 순서 있고, 중복 허용
public class VectorEx01 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length         /          capacity");
		System.out.println(v.size() + "                /                " + v.capacity());
	
		Vector<Integer> v2 = new Vector<Integer>(3,4);
		v2.add(20);
		v2.add(12);;
		v2.add(55);
		v2.add(99);
		v2.add(55);
		System.out.println(v2.size() + "                /                " + v2.capacity());
		
		System.out.println("===============interator() method===============");
		Iterator  it = v2.iterator();
		while (it.hasNext() ) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println("\n===============get() method===============");
		for ( int i = 0; i < v2.size(); i++) {
			System.out.print( v2.get(i) + "\t");
		}
		
		System.out.println("\n===============elementsAt() method===============");
		for ( int i = 0; i < v2.size(); i++) { 	// Vector에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.print( num.toString() + "\t");
		}
		
		System.out.println("\n\n" + v2.size() + "                /                " + v2.capacity());
		v2.trimToSize(); // capaity 조정하기
		System.out.println("\n\n" + v2.size() + "                /                " + v2.capacity());
	}
	

}
