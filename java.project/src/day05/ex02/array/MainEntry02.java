package day05.ex02.array;
// 2차원 배열
public class MainEntry02 {
	public static void main(String[] args) {
		int [][] a = new int [][] { {1,2,3,}, {4,5,6,} };
		
		System.out.println("행의 길이 : " + a.length);
		System.out.println("열의 길이 : " + a[0].length);
		System.out.println("열의 길이 : " + a[1].length);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
