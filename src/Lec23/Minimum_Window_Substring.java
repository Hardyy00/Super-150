package Lec23;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		System.out.println(MinimumWindow(s,t));
	

	}
	
	private static String MinimumWindow(String s,String t) {
		
		int[] freT = new int[123];
		
		for(int i=0;i<t.length();i++) {
			
			char ch = t.charAt(i);
			freT[ch]++;
			
		}

		int[] freS = new int[123];
		int si = 0;
		int ei = 0;
		int start = -1;
		int len = Integer.MAX_VALUE;
		int count = 0;
		while(ei<s.length()) {
			
			// grow
			char ch  = s.charAt(ei);
			freS[ch]++;
			if(freT[ch] >= freS[ch])
				count++;
			
			// shrink
			if(count==t.length()) {

				while(freS[s.charAt(si)] > freT[s.charAt(si)]) {
					freS[s.charAt(si)]--;
					si++;
				}
				
				// ans
				if(len > ei-si+1) {
					len = ei-si+1;
					start = si;
				}
			}
			
			ei++;
		}
		
		if(start==-1)
			return "";
		
		return s.substring(start,start+len);
	}

}
