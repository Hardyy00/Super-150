package Lec2;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
	
//		int n= 5;
//		int i=1;
		
//		while(i<=n) {
//			
//			System.out.println("Hey");
//			i++;
//		}
		
// Question - 1
		
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		int row = 1;
		int star = n;
		
		while(row<=n) {
			
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			System.out.println();
			row++;
		}
		
		cin.close();
		
	}
	

	
	

}
