package day12.quiz0102;

import java.util.Date;
import java.util.Scanner;

public class MainEntry {	
	static String title;
	static char lend;
	static String lendN;
	static Date lendD;
	
	public static void menu() {
		System.out.println("\n\n******** 메뉴 **********");
		System.out.println("1. 비디오 정보 입력");
		System.out.println("2. 비디오 정보 삭제");
		System.out.println("3. 비디오 정보 수정");
		System.out.println("4. 모든 비디오 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {
				menu();
				int inNum = sc.nextInt();
				
				try {
					switch (inNum) {
					
					case 1 :
						System.out.println("\n******** 1. 비디오 정보 입력 ********");
						vm.VideoAdd();
						System.out.println("* 입력완료");
						break;
						
					case 2 :
						System.out.println("\n******** 2. 비디오 정보 삭제 ********");
						vm.display();
						System.out.println("-------------------------------------------");
						System.out.println("삭제할 비디오의 번호를 입력 : ");
						inNum = sc.nextInt();
						vm.VideoRm(inNum);
						break;
						
					case 3 :
						System.out.println("\n******** 3. 비디오 정보 수정 ********");
						vm.display();
						System.out.println("-------------------------------------------");
						System.out.println("수정할 비디오의 번호를 입력 : ");
						inNum = sc.nextInt();
						System.out.println("수정할 비디오의 정보를 입력하세요.");
						inVideo();
						vm.VideoCh(inNum, title, lend, lendN, lendD);
						break;
						
					case 4 : 
						System.out.println("\n******** 4. 모든 비디오 열람 ********");
						vm.display();
						break;
						
					case 5 :
						System.out.println("\n******** 프로그램 종료 ********");
						System.exit(0);
						break;
						
					default :
						System.out.println("\n ERROR - 잘못 입력하셨습니다. 다시 입력하시오.");
					}	
				} catch (Exception e) {
					System.out.println("\n ERROR - 비디오가 없습니다. 다시 입력하시오.");
				}
			}
		} catch ( Exception e) {
			System.out.println("\n ERROR - 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}

	private static void inVideo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비디오 제목 : ");
		title = sc.next();
		System.out.println("대여 여부 : ");
//		lend = sc.equals();
		System.out.println("대여자 ( 고객명) : ");
		lendN = sc.next();
		System.out.println("대여 일자 : ");
//		lendD = sc.next();
		
	}

}
