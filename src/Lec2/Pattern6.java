package Lec2;

import java.util.Scanner;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		
		int row = 1;
		int star = n;
		int space = 0;
		
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
			
			System.out.println();
			space+=2;
			star--;
			
			row++;
			
		}
	}

}
