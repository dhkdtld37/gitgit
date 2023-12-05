package day12.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx03 {
	static HashMap phoneBook = new HashMap ();	
		public static void main(String[] args) {
			addPhoneNo("친구", "이자바", "010-1111-2222");
			addPhoneNo("친구", "김자바", "010-2222-2222");
			addPhoneNo("친구", "박자바", "010-3333-4444");
			addPhoneNo("회사", "김대리", "010-2323-0101");
			addPhoneNo("회사", "박과장", "010-5555-5555");
			addPhoneNo("회사", "강대리", "010-7777-2211");
			addPhoneNo("세탁", "010-8888-8888");
			
			printAll ();
		}
		
		// 그룹을 추가하는 메소드
		static void addGroup(String groupName) {
			
			if ( !phoneBook.containsKey(groupName) ) {
				phoneBook.put(groupName, new HashMap() );
			}
		}
		
		// 그룹에 전화번호를 추가하는 메소드
		private static void addPhoneNo(String groupName, String name, String tel) {
			addGroup(groupName);
			
			HashMap group = (HashMap)phoneBook.get(groupName);
			group.put(tel, name);		// 이름은 중복 허용으로 put 사용하고
											// 전화번호를 key로 저장
		}
		
		private static void addPhoneNo(String name, String tel) {
			addPhoneNo ("기타", name, tel);
		}
		
		// 전화번호부 전체를 출력하는 메소드
		static void printAll() {
			Set set = phoneBook.entrySet();		//	System.out.println(set);
			Iterator it = set.iterator();
			
			while ( it.hasNext() ) {
				Map.Entry e = (Map.Entry)it.next();
				
				Set subSet = ((HashMap)e.getValue()).entrySet();
				Iterator subIt = subSet.iterator();
				
				System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
				
				while ( subIt.hasNext() ) {
					Map.Entry subE = (Map.Entry)subIt.next();
					String telNo = (String)subE.getKey();
					String name = (String)subE.getValue();
					System.out.println(name + " " + telNo);
					
				}	// in while end
				System.out.println();
						
			}	// while end
		}
		
}
