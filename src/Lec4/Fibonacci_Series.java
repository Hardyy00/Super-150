package Lec4;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();

		System.out.println(getFibonacci(n));
	}
	
	private static int getFibonacci(int n) {
		
		int a1= 0;
		int a2 = 1;
		
		
		for(int i=0;i<n;i++) {
			int sum = a1 + a2;
			a1 =a2;
			a2 = sum;
		}
		
		return a1;
	}

}
