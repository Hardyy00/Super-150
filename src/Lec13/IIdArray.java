package Lec13;

import java.util.Scanner;

public class IIdArray {

	public static void main(String[] args) {
//		int[][] arr = new int[3][4];
//
//		
//		int rows = arr.length;						// number of rows
//		int dimensionOfARow = arr[0].length;			// number of columns in a row
//		
//		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			
//				System.out.println();
//		}
		
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length;j++) {
				arr[i][j] = cin.nextInt();
			}
		}
		
//		display(arr);
	}
	
	private static void Display(int[][] arr) {
		
	}

}
