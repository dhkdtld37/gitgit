package day07.quiz;

import java.util.Scanner;

public class Score02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Score 객체 생성
        Score score = new Score();

        // 이름 입력
        score.setName(inputName(sc));

        // 각 과목별 성적 입력
        System.out.print("국어 ");
        score.setKor(input(sc));
        System.out.print("영어 ");
        score.setEng(input(sc));
        System.out.print("전산 ");
        score.setCom(input(sc));

        // 성적 출력
        score.display();
    }

    // 성적 입력 메소드
    public static int input(Scanner sc) {
        System.out.print("점수 입력 : ");
        return sc.nextInt();
    }

    public static String inputName(Scanner sc) {
        System.out.print("이름 입력 : ");
        return sc.next();
    }
}