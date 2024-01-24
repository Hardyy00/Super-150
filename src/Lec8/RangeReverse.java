package Lec8;

import java.util.Scanner;

public class RangeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6};
		
		Scanner cin = new Scanner(System.in);
		
		
		
		int i= cin.nextInt();
		int j = cin.nextInt();
		
		reverseArray(arr,i,j);
		
		
		
		for(int a : arr) {
			System.out.println(a);
		}

	}
	
	private static void reverseArray(int[] arr ,int i ,int j) {
		
		
		while(i<j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

}
