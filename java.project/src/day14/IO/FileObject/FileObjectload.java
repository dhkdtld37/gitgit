package day14.IO.FileObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileObjectload {
	public static void main(String[] args) throws IOException {
		
		String name, id, pwd, temp, phone;;
		name = id = pwd = temp = phone = null;
		int age = 0;
		boolean gender = true;
		
		File f = new File("member.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			name = (String)bis.readObject();
			id = (String)bis.readObject();
			pwd = (String)bis.readObject();
			gender = (Boolean)bis.readObject();
			age = (Integer)bis.readObject();
			phone = (String)bis.readObject();
			
			System.out.println("\t\t\t >> 회원 정보 << \n");
			System.out.println("Name \t\t ID \t\t PWD \t\t Gender \t Age \t PhoneNumber ");
			System.out.println();
			System.out.println(name + "\t" + id + "\t" + pwd + "\t");
			if ( gender == true ) System.out.print("남자");
			else System.err.print("여자");
			System.out.println("\t" + age + "\t" + phone);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bis.close();
			
		}
		
	}

}
