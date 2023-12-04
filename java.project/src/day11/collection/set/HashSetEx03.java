package day11.collection.set;

import java.util.HashSet;
import java.util.Set;
// import java.lang.* 		// 자동 임포트

class Person {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public boolean equals(Object obj) {
		
		if ( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;	// @ 한번 더 이해할 것 @
		}
		return false;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
}

public class HashSetEx03 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("sad"));
		set.add(new String("happy"));
		
		Person ps = new Person("aaa", 10);
		set.add(ps);
		set.add(new Person("David", 10));
		set.add(new Person("David", 33));
		set.add(new Person("David", 10));
		set.add(new Person("David", 22));
		
		System.out.println(set);
	}
}
