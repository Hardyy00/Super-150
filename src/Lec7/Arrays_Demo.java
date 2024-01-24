package Lec7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays_Demo {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		
		
		int[] arr = new int[5];
		
		// setting values
		
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = cin.nextInt();
		}
		
		// getting values
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		int a[] = new int[5];  // C type 
//		int c[] = {1,2 ,3};
//		printArray(arr);
		
		
		swap(arr , 0 ,1);
		printArray(arr);
		
		
	}
	
	private static void swap(int[] arr ,int i ,int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void printArray(int[] arr) {
		
		for(int i : arr ) {
			System.out.println(i);
		}
	}

}
