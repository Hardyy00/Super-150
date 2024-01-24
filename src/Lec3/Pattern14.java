package Lec3;

import java.util.Scanner;

public class Pattern14 {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int row = 1;
		int space = n-1;
		int star = 1;
		
		while(row<=2*n-1) {
			
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			if(row<n) {
				space--;
				star++;
			}else {
				
				space++;
				star--;
			}
			
			row++;
			System.out.println();
			
			
		}
		cin.close();
		
	}

}
