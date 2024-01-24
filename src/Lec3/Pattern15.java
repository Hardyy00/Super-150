package Lec3;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row<=2*n-1) {
			
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
			
			//Mirroring
			
			if(row<n) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			
			row++;
			System.out.println();
			
		}
			cin.close();
	}

}
