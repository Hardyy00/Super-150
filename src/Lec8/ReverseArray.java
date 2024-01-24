package Lec8;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6};
		
		reverseArray(arr);
		
		for(int a : arr) {
			System.out.println(a);
		}

	}
	
	private static void reverseArray(int[] arr) {
		
//		int length = arr.length;
//		
//		for(int i=0; i<length/2; i++) {
//			
//			int temp = arr[i];
//			arr[i] = arr[length-1-i];
//			arr[length -1 -i] = temp;
//		}
//		
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
