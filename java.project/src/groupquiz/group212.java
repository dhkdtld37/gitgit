// 하얀 칸
package groupquiz;

import java.util.Scanner;

public class group212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
        
		for (int i = 0; i < 8; i++) {
			String[] arr = sc.nextLine().split("");
            
			int size = arr.length;
			for (int j = 0; j < size; j++) {
				if (i % 2 == 0 && j % 2 == 0 && arr[j].equals("F")) {
					count++;
				} else if (i % 2 == 1 && j % 2 == 1 && arr[j].equals("F")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
