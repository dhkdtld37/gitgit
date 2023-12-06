/*
 Video class
 - title 비디오제목
 - lend 대여여부
 - lendName 대여자 (고객명)
 - lendDate 대여일자 
 
 Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료 출력하는
 프로그램 작성
 */
package day12.quiz0102;

import java.util.Date;

public class Video {
	String title, lendN;
	char lend;
	Date lendD;
	
	Video() {
	}

	Video(String title, char lend, String lendN, Date lendD) {
		this.title = title;
		this.lend = lend;
		this.lendN = lendN;
		this.lendD = lendD;
	}
	
	public void display() {
		System.out.println("비디오 제목 : " + title);
		System.out.println("대여 여부 : " + lend);
		System.out.println("대여자 (고객명) : " + lendN);
		System.out.println("대여 일자 : " + lendD);
		
	}

}
