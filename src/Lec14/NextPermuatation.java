package Lec14;

import java.util.Arrays;

public class NextPermuatation {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		permuatation(arr);

		System.out.println(Arrays.toString(arr));
	}
	
	private static boolean permuatation(int[] arr) {
		
		int p = -1;
		int q =-1;
		
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		
		if(p==-1) {
			reverse(arr,0);
			return true;
			
		}
		
		for(int i=arr.length-1;i>p;i++) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}	
		}
		
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
		reverse(arr,p+1);
		
		return true;
		
	}
	
	private static void reverse(int[] arr , int i) {
		int j = arr.length-1;
		
		while(i<j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

}
