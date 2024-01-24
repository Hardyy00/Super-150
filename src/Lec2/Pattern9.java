package Lec2;

import java.util.Scanner;

public class Pattern9 {

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
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			star += 2;
			space--;
			row++;
			System.out.println();
		}

	}

}
