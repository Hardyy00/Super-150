package Lec12;

public class BinarySearch {

	public static void main(String[] args) {

		// Binary Search is applicable in sorted search space
		
		int[] arr = {2,3,5,7,8,11,13,14,16,18,19};
		
		System.out.println(BinarySearch(arr , 19));

	}
	
	private static int BinarySearch(int[] arr , int ele) {
		
		
		int lower = 0;
		int higher = arr.length-1;
		
		while(lower<=higher) {
			
			int mid = (lower+higher)/2;
			
			if(ele < arr[mid])
				higher = mid-1;
			else if(ele>arr[mid])
				lower = mid+1;
			else {
				return mid;
			}
		}
		
		return -1;
		
	}

}
