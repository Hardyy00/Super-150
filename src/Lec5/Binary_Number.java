package Lec5;

import java.util.Scanner;

public class Binary_Number {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int binary = 0;
		int mul = 1;
		
//		for(int i=0; n!=0; i++) {
//			
//			binary += (n%2) * (int)Math.pow(10,i);
//			n/=2;
//			
//		}
//		
// 		base 10 137 to base 6
		
		while(n>0) {
			
			int rem = n%6;
			binary += rem * mul;
			n /= 6;
			mul *= 10;
		}
		System.out.println(binary);
		

	}

}
