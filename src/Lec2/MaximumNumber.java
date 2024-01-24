package Lec2;

import java.util.Scanner;

public class MaximumNumber {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();	
		int b = cin.nextInt();
		int c = cin.nextInt();
	
		int ans = a> b && a> c ? a : (b>a && b> c ? b : c);
		
		System.out.println(ans);

	}

}
