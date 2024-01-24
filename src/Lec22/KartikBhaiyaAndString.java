package Lec22;

public class KartikBhaiyaAndString {

	public static void main(String[] args) {
		
		String str = "abababbabbbbbaaaa";
		int k=3;
		int aflip = perfectMaximumLength(str,k,'a');
		int bflip = perfectMaximumLength(str,k,'b');
		
		System.out.println(Math.max(aflip,bflip));

	}
	
	public static int perfectMaximumLength(String str, int k , char ch) {
		
		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans =  0;
		while(ei < str.length()) {
			
			// window Grow kiya hai
			if(str.charAt(ei)==ch) {
				flip++;
			}
			
			// window shrink krna hai
			
			while(flip > k) {
				if(str.charAt(si) == ch)
					flip--;
				
				si++;
			}
			
			// calculate window size
			ans = Math.max(ans, ei-si +1);
			ei++;
			
		}
		
		return ans;
		
	}

}
