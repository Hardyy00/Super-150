package Lec10;

import java.util.Arrays;

/* Bubble sort
 * selection sort
 * insertion sort
 * counting sort
 * DNF
 * Merge sort
 * quick sort
 * heap sort
 */


public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1,2,0};
		
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	private static void bubbleSort(int[] arr) {
		
		for(int i=1; i<arr.length;i++) {
			
			for(int j=0;j<arr.length-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
					
			}
			
		}
	}

}
