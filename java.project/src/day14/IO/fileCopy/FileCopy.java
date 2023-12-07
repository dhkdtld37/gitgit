package day14.IO.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {		// 예외 처리 위임
		
		// 읽기 개체 - FileInputStream
		InputStream is = new FileInputStream("sw.PNG");
		
		// 쓰기 개체 - FilleOutputStream
		OutputStream os = new FileOutputStream("C:\\test\\sw2.JPG");
		
//		byte[] buffer = new byte[100];
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		while ( true ) {
			int inputData = is.read(buffer);		// buffer 크기 만큼 읽어들임
			if ( inputData == -1) break;
			os.write(buffer, 0, inputData);
		}	// while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); 	// 복사(작업)에 걸린 시간
		is.close();
		os.close();
		System.out.println("복사 성공");
	}

}
