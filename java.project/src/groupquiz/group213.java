// 약수의 합
package groupquiz;

import java.util.Scanner;

public class group213 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		while(true){
			n = sc.nextInt();
			
			if(n!=-1){
			
				int sum=0;
				String X = "";
				for(int i=1; i<n; i++){
					if(n%i==0){
						sum+=i;
					}
				}
				if(sum==n){
					X += n + " = ";
					for(int i=1; i<n; i++){
						if(i==1){
							X += 1;
						}else{
							if(n%i==0){
								X += " + " + i;
								sum+=i;
							}
						}
					}
				} else {
					System.out.print(n + " is NOT perfect.");
				}
				System.out.println(X);
			} else {
				break;
			}
		}
	}
}