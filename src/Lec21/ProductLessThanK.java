package Lec21;

public class ProductLessThanK {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int k = 10;

	}
	
	private static int countSubArray(int[] arr,int k) {
		
		int ans = 0;
		int si = 0;
		int ei = 0;
		int p = 1;
		
		while(ei < arr.length) {
			//grow
			p*=arr[ei];
			
			//shrink
			
			
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			
			// answer calculate
			
			ans += (ei-si+1);
			ei++;
		}
		
		return ans;
		
	}

}
