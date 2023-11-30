// 팰린드롬인지 확인하기
package groupquiz;
import java.util.Scanner;

public class group204{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        int e = 0;
        char[] x = new char[a.length()];
        char[] y = new char[a.length()];

        for(int i=0; i<a.length(); i++){
            x[i] += a.charAt(i);
        }
        
        String str1 = new String(x);
        
        for ( int j = a.length()-1;  j >= 0;  j-- ) {
            y[e] += a.charAt(j);
            e++;
        }
        
        String str2 = new String(y);
        
        if ( str1.equals(str2) ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}

