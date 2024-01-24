package Lec8;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin  = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		
		int value = cin.nextInt();
		System.out.println("Enter element :");
		
		for(int i=0; i<n; i++) {
			arr[i] = cin.nextInt();
		}
		
		System.out.println(findElement(arr , value));
		
		cin.close();

	}
	
	private static int findElement(int[] arr , int ele) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == ele)
				return i;
		}
		
		return -1;
	}

}
