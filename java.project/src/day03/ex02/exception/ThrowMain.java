package day03.ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowMain {
	public static void main(String[] args) 
		throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x = ");
		System.out.println("y = ");
		int x, y, result = 0;
		
			x = sc.nextInt();
			y = sc.nextInt();
			
			result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		}
	}
