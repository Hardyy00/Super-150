package Lec3;

import java.util.Scanner;

// Very Important

public class PascalTriangle {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int row =0 ;
		int star = 1;
		
		while(row<n) {
			int i=0;
			int val = 1;
			while(i<star) {
				System.out.print(val +" ");
				val = ((row -i)*val)/(i+1);	 // Combination is used for next element in the pattern ncr+1 = ((n-r) * ncr)/(r+1)
				i++;
			}
			
			System.out.println();
			row++;
			star++;
		}
		
	}

}
