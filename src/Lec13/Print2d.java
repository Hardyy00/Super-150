package Lec13;

import java.util.Scanner;

public class Print2d {

	public static void main(String[] args) {

		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ColWavePrint(arr);
		
		
	}
	
	public static void ColWavePrint(int[][] arr) {
		
		for(int col =0 ;col<arr[0].length;col++) {
			
			if(col%2==0) {
				for(int row = 0;row<arr.length;row++) {
					System.out.print(arr[row][col] + " ");
				}
			}else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

}
