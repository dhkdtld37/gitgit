package day13.IO.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferdReaderEx {
	public static void main(String[] args) throws IOException {	// 예외처리 위임 - JVM

		/*
		InputStream is = System.in;	// 표준 입력
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 위와 동일, 좀 더 간결
		
		System.out.println("charactor input = ");
		String str = br.readLine();	// 예외 발생
		String str2 = br.readLine();
		
		System.out.println(str + str2);
		
		int su1 = Integer.parseInt(str);
		int su2 = Integer.parseInt(str2);
		
		System.out.println(su1 + su2);
		
		int str3 = Integer.parseInt(br.readLine());
		int str4 = Integer.parseInt(br.readLine());
		System.out.println(str3 + str4);
		
	}

}
