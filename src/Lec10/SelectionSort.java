package Lec10;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1,2,0};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	private static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int mini = i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[mini])
					mini = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		
		
	}
	
	// Selection sort is better than bubble sort in terms of swapping

}
