package day07.quiz;
public class Score {
    // 멤버 변수
    private String name;
    private int kor;
    private int eng;
    private int com;

    // 생성자
    public Score() {
    }

    public Score(String name, int kor, int eng, int com) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.com = com;
    }

    // getter / setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    // 총점 계산 메서드
    public int getTotal() {
        return kor + eng + com;
    }

    // 평균 계산 메서드
    public double getAverage() {
        return getTotal() / 3.0;
    }

    // 학점 계산 메서드
    public char getGrade() {
        double average = getAverage();

        if (average > 90) {
            return 'A';
        } else if (average > 80) {
            return 'B';
        } else if (average > 70) {
            return 'C';
        } else if (average > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // output 메서드
    public void display() {
        System.out.println("====== 성적표 ======");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor + " / 영어 : " + eng + " / 전산 : " + com);
        System.out.println("총점 : " + getTotal());
        System.out.printf("평균 : %.2f\n", getAverage());
        System.out.println("학점 : " + getGrade());
    }
}