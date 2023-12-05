package day12.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoManager extends Video {
	
	ArrayList<Video> list = new ArrayList<Video>();
	
	VideoManager() {
	}
	
	VideoManager(String title, String lend, String lendN, String lendD) {
		Video v = new Video( title, lend, lendN, lendD);
		list.add(v);
	}
	
	public void VideoAdd(String title, String lend, String lendN, String lendD) {
		Video v = new Video (title, lend, lendN, lendD);
		list.add(v);
	}
	
	public void VideoAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비디오 제목 : ");
		title = sc.next();
		System.out.println("대여 여부 : ");
		lend = sc.next();
		System.out.println("대여자 ( 고객명) : ");
		lendN = sc.next();
		System.out.println("대여 일자 : ");
		lendD = sc.next();
		
		Video v = new Video (title, lend, lendN, lendD);
		list.add(v);
	}
	
	public void VideoRm ( int i ) {
		System.out.println("\n\n 삭제할 비디오");
		list.get(i-1).display();
		System.out.println("----------------");
		list.remove(i-1);
	}
	
	public void VideoCh (int i, String title, String lend, String lendN, String lendD) {
		Video v = new Video (title, lend, lendN, lendD);
		list.set(i-1, v);
	}
	
	public void display() { 
		System.out.println("저장된 비디오 수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println(" - " + (i-1) + "번 - ");
			list.get(i).display();
		}
	}
}

