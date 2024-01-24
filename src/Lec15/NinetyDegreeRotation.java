package Lec15;

import java.util.Arrays;

public class NinetyDegreeRotation {

	public static void main(String[] args) {
		
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		transpose(matrix);
		
		for(int i=0; i<matrix.length;i++) {
			reverse(matrix[i]);
		}
		
		System.out.println(Arrays.toString(matrix));
	}
	
	private static void transpose(int[][] arr) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][j]= temp;
			}
		}
	}
	
	private static void reverse(int[] arr) {
		
		int i=0;
		int j= arr.length-1;
		
		while(i<j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

}
