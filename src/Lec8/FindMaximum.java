package Lec8;

import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin  = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = cin.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter element :");
		
		for(int i=0; i<n; i++) {
			
			arr[i] = cin.nextInt();
			
			
		}
		
		System.out.println("Maximum number : " + findMaximum(arr));
		
		cin.close();

	}
	
	private static int findMaximum(int[] arr) {
		
			int max = arr[0];
			
			for(int i=1; i<arr.length; i++) {
				
				if(arr[i]> max)
					max= arr[i];
			}
			
			return max;
		}


}
