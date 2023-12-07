package day14.IO.fileCopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args)
				throws MalformedURLException, IOException {		// 예외 처리 위임
		
		URL url = new URL("https://ssl.pstatic.net/melona/libs/1476/1476819/cc23628815a4aa3ecef5_20231206153547828.jpg");
		
		// 읽기 개체
		InputStream is = url.openStream(); 	// 통로 연결
		
		// 쓰기 개체
		OutputStream os = new FileOutputStream("naver.jpg");	// 상대 경로
		
		byte[] buffer = new byte[1024*8];
		
		while ( true ) {
			int inputData = is.read(buffer);
			
			if ( inputData == -1 ) break;
			os.write(buffer, 0, inputData);
		}
		
		is.close(); 	os.close();
		System.out.println("웹으로부터 파일 복사 성공");
	}

}
