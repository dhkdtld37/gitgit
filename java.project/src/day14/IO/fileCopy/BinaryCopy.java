package day14.IO.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		
//		File src = new File("C:/Users/Playdata/Downloads/69835089.java");
//		File dist = new File("C:\\Users\\Playdata\\git\\gitgit\\java.project\\");
		
		File src = new File("C:\\Users\\Playdata\\Desktop\\모음\\자료\\sw.PNG");
		File dist = new File("C:\\Users\\Playdata\\git\\gitgit\\java.project\\sw.PNG");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);					// 파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist);			// 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); 			// 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos);		// 버퍼 출력 스트림 연결
			
			while ( (c = bis.read() ) != -1 ) {
				bos.write( (char)c );
			}
			
			System.out.println("파일 복사 성공");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 실패");
			e.printStackTrace();
		}
		
	}

}
