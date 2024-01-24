package Lec2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		int row =1 ;
		int star = 1;
		
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			System.out.println();
			row++;
			star++;
		}

	}

}
