package day14.IO.fileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
//		RandomAccessFile raf2 = new RandomAccessFile("C:\\test\\sawon.txt", "rw");
		
		for (int i = 0; i <= 10; i++) {
			
			raf.seek(i * 200); 		// 예외 발생
			String str = "hello";
			raf.writeUTF(str+i);
		
			raf.writeInt(i);
			
		}
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
			
		}
		
		System.out.println("String print success!");
		raf.close();
		
	}

}
