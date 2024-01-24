package Lec11;


// To find the to find the maximum sum in an array

public class KadaneAlgorithm {

	public static void main(String[] args) {
		
		int[] arr = {-2,-5,-6,-5,-7};
		System.out.println(maxSum(arr));

	}
	
	private static int maxSum(int[] arr) {
		
		int ans=Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i< arr.length; i++) {
			
			sum += arr[i];
			ans = Math.max(ans, sum);
			
			if(sum<0)
				sum = 0;
		}
		
		return ans;
	}

}
