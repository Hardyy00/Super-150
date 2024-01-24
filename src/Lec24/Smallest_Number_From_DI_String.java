package Lec24;

import java.util.Arrays;

public class Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		String str = "DDIIIDD";
		Smallest_Number(str);
	}
	
	public static void Smallest_Number(String str) {
		
		int[] ans = new int[str.length() + 1];
		int count = 1;
		
		for(int i=0;i<=str.length();i++) {
			
			if(i==str.length() || str.charAt(i)=='I') {
				
				ans[i] = count;
				count++;
				for(int j=i-1;j>=0 && str.charAt(j)!='I';j--) {
					ans[j] = count;
					count++;
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
