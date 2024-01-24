package Lec13;

public class Kth_Root {

	public static void main(String[] args) {
		
		// Find the maximum value of x such that x^k<=n (k and n are given)
		int n = 67;
		int k = 3;
		
		System.out.println(kthRoot(n,k));
		

	}
	
	public static int kthRoot(int n , int k) {
		int lower = 1;
		int higher = n;
		
		int ans = 0;
		while(lower<=higher) {
			
			int  mid = lower + (higher-lower)/2;
			if(Math.pow(mid, k)<=n) {
				ans = mid;
				lower = mid+1;
			}else {
				higher = mid -1;
			}
		}
		
		return ans;
	}

}
