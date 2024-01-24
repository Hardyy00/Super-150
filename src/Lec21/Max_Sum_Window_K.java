package Lec21;

public class Max_Sum_Window_K {

	public static void main(String[] args) {
		
		int[] arr = {1,4,5,6,7,8,2,3,9,1,2,5};
		
		System.out.println(maxSum(arr,3));
		

	}
	
	private static int maxSum(int[] arr ,int k) {
		int max = 0;
		int sum = 0;
		for(int i=0;i<k;i++) {
			sum += arr[i];
		}
		
		max = sum;
		for(int i=k;i<arr.length;i++) {
			sum = sum + arr[i];		// increasing window size
			sum = sum -arr[i-k];	// decreasing window size
			max = Math.max(max, sum);
			
		}
		
		return max;
	}

}
