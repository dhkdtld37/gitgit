// 백준 저항 @@ 전혀 모르겠음
package testlim;
import java.util.*;
public class group206 {
	public static void main(String[] args) {
		String [] resArr = { "black", "brown", "red", "ornage", "yellow", "green",
				"blue", "violet", "gray", "white" };
		Scanner sc = new Scanner(System.in);
		String sb = String.valueOf(Arrays.asList(resArr).indexOf(sc.nextLine())) +
				Arrays.asList(resArr).indexOf(sc.nextLine()) +
				"0".repeat(Arrays.asList(resArr).indexOf(sc.nextLine()));
		long isb = Long.parseLong(String.valueOf(sb));
		System.out.println(isb);
	}

}
