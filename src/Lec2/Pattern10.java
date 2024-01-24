package Lec2;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int row = 1;
		int space = 0;
		int star = 1 + 2*(n-1);
		
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
			
			space++;
			star -=2;
			row++;
			
			System.out.println();
			
		}
			cin.close();
			}

}
