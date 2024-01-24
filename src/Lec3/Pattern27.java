package Lec3;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		
Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row<=n) {
			
			int i=1;
			
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			
			i=1;
			int k=1;
			while(i<=star) {
				System.out.print(k +" ");
				
				if(i<star/2 + 1) {
					k++;
				}else {
					k--;
				}
				
				i++;
			}
			
			star += 2;
			space--;
			row++;
			System.out.println();
		}

	}

}
