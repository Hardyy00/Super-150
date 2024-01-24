package Lec7;

public class Array_Demo_2 {

	public static void main(String[] args) {				// Java is call by value
		
		int[] arr = {10 ,20 ,30 ,40 ,50};
		int[] other = {100 , 200 ,300 , 400, 500};
		System.out.println(arr[0] + " " + other[0]);
		
		swap(arr , other);
		System.out.println(arr[0] + " " + other[0]);

	}
	
	private static void swap(int[] arr , int[] other) {
		
		int[] temp = arr;
		arr = other;
		other = temp;
				
	}

}
