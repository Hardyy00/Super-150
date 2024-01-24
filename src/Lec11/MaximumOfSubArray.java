package Lec11;

public class MaximumOfSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-2,-5,-6,-5,-7};
		System.out.println(maxSum(arr));

	}
	
	private static int maxSum(int[] arr) {
		
		int ans =arr[0];				// OR ans = Integer.MIN_VALUE
		for(int i=0;i<arr.length;i++) {
			
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				
				sum += arr[j];
				ans = Math.max(sum, ans);
			}
		}
		
		return ans;
	}

}
